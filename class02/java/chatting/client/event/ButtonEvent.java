package chatting.client.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import chatting.client.ClientController;
import chatting.client.thread.ReceiveThread;

public class ButtonEvent implements ActionListener {

	public ClientController main;
	public final int ACCESS_PERMITTED = 110;
	public final int REQUEST_ACCESS_PERMISSION = 210;
	public final int REQUEST_SEND_MSG = 230;
	public final int MSG_RECEIVED = 130;

	public ButtonEvent(ClientController main) {
		this.main = main;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();

		switch (str) {
		case "로그인":
			loginProc();
			break;

		case "send":
			sendProc();
			break;

		case "종료":
			main.close();
			System.exit(0);
			break;
		default:
			break;
		}
	}

	public void sendProc() {
		String msg = main.frame.input.getText().trim();

		System.out.println(msg);
		
		if (!msg.equals("") && msg != null) {
			System.out.println("****************************");
			main.prw.println(REQUEST_SEND_MSG + msg);
			main.prw.flush();
		} else {
			return;
		}

	}

	public void loginProc() {
		String sid = main.loginFr.inId.getText();
		String spw = new String(main.loginFr.inPw.getPassword());

		try {
			main.socket = new Socket("192.168.0.97", 7788);
//			main.socket = new Socket("192.168.0.21", 7788);

			InputStream in = main.socket.getInputStream();
			OutputStream out = main.socket.getOutputStream();
			main.br = new BufferedReader(new InputStreamReader(in));
			main.prw = new PrintWriter(out);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			main.prw.println(REQUEST_ACCESS_PERMISSION + sid + "|" + spw);
			main.prw.flush();
//			System.out.println("came here!");
			String msg = main.br.readLine().trim();
			int code = 0;
			if (!msg.equals("") && msg != null) {
				code = Integer.parseInt(msg.substring(0, 3));
			} else {
				main.close();
			}
			
			if (code == ACCESS_PERMITTED) {
				if (msg.charAt(3) == 'Y') {
					System.out.println("came here!");
					main.loginFr.setVisible(false);
					main.frame.setVisible(true);

					ReceiveThread t = new ReceiveThread(main);
					t.start();
				} else {
					main.loginFr.inId.setText("");
					main.loginFr.inPw.setText("");
					JOptionPane.showMessageDialog(null, "아이디나 비밀번호를 잘못 입력하셨습니다.");
				}
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
			main.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
