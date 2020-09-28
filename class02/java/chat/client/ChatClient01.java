package chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import chat.client.thread.ClientTrd01;
import chat.client.ui.ChatFr;
import chat.client.ui.LoginFr;

public class ChatClient01 {

	private LoginFr loginFr;
	private ChatFr mainUI;

	private Socket socket;
	private OutputStream out;
	private PrintWriter pw;
	private InputStream in;
	private InputStreamReader isr;
	private BufferedReader br;
	private ClientTrd01 t;

	public ChatClient01() {
		setUI();

		try {
//			socket = new Socket("192.168.0.21", 7788);
			socket = new Socket("192.168.0.97", 7788);
			in = socket.getInputStream();
			out = socket.getOutputStream();
			
			pw = new PrintWriter(out);
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			System.out.println(br);
		} catch (UnknownHostException e) {
			e.printStackTrace();
			close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void setUI() {
		mainUI = new ChatFr(this).setUI();
		loginFr = new LoginFr(this).setUI();
		loginFr.setEvt();
	}

	public ChatFr getMainUI() {
		return mainUI;
	}
	
	public void close() {
		try {
			if (pw != null) pw.close();
			if (br != null) br.close();
			if (isr != null) isr.close();
			if (socket != null) socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public Socket getSocket() {
		return socket;
	}
	
	public LoginFr getLoginFr() {
		return loginFr;
	}
	
	public ChatFr getChatFr() {
		return mainUI;
	}
	
	public BufferedReader getBr() {
		System.out.println(br);
		return br;
	}

	public PrintWriter getPW() {
		System.out.println(pw);
		return pw;
	}
	
	public void setThread(ClientTrd01 t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		ChatClient01 client = new ChatClient01();
	}
}
