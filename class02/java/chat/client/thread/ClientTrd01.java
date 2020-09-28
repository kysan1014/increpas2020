package chat.client.thread;

import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import chat.client.ChatClient01;

public class ClientTrd01 extends Thread {

	private ChatClient01 main;
	private BufferedReader br;
	private JTextArea area;
	private JScrollPane span;

	public ClientTrd01(ChatClient01 main) {
		this.main = main;
	}

	@Override
	public void run() {

		try {
			while (true) {
				String msg = "";
				br = main.getBr();
				area = main.getChatFr().getTextArea();
				span = main.getChatFr().getScrollPane();
				msg = br.readLine();
				if (msg == null) {
					break;
				}
				
				area.append(msg + '\n');
				span.getVerticalScrollBar().setValue(span.getVerticalScrollBarPolicy());
//				area.rev
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
