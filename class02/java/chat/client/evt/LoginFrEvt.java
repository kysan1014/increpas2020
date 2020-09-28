package chat.client.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextField;

import chat.client.ChatClient01;
import chat.client.thread.ClientTrd01;
import chat.client.ui.LoginFr;

public class LoginFrEvt implements ActionListener {

	private ChatClient01 main;
	private LoginFr loginFr;
	private PrintWriter pw;
	private BufferedReader br;

	public LoginFrEvt(ChatClient01 main) {
		this.main = main;
		this.loginFr = main.getLoginFr();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("로그인")) {
			JTextField inId = loginFr.getinId();
			String inputId = inId.getText();

			if (inputId == null) {
				return;
			}

			System.out.println(inputId);
			
			pw = main.getPW();
			br = main.getBr();
			
			pw.println("id=" + inputId);
			pw.flush();
			System.out.println("data sent");
			
			String msg = "";
			try {
				System.out.println("came here!");
				msg = br.readLine();
				System.out.println(msg);
			} catch (IOException e1) {
				e1.printStackTrace();
				return;
			}

			if (msg.equals("OK")) {
				main.getChatFr().setId(inputId);
				loginFr.setVisible(false);
				main.getChatFr().setVisible(true);

				ClientTrd01 t = new ClientTrd01(main);
				t.start();
				main.setThread(t);

			}
		} else if (command.equals("종료")) {
			System.exit(0);
		}

	}

}
