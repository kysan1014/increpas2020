package chatting.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import chatting.client.event.ButtonEvent;
import chatting.client.ui.ChattingFrame;
import chatting.client.ui.LoginFrame;

public class ClientController {

	public ChattingFrame frame;
	public LoginFrame loginFr;
	public ButtonEvent event;

	public Socket socket;
	public PrintWriter prw;
	public BufferedReader br;

	public ClientController() {
		event = new ButtonEvent(this);
		frame = new ChattingFrame(this);
		loginFr = new LoginFrame(this);
	}

	public void close() {
		try {
			if (prw != null)
				prw.close();
			if (br != null)
				br.close();
			if (socket != null)
				socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ClientController();
	}
}
