package chat.client.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextField;

import chat.client.ChatClient01;

public class ChatFrEvt implements ActionListener {

	private ChatClient01 main;
	private JTextField textField;
	private PrintWriter pw;
	private BufferedReader br;
	private String id;
	
	public ChatFrEvt(ChatClient01 main) {
		this.main = main;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		pw = main.getPW();
		br = main.getBr();
		textField = main.getChatFr().getTextField();
		String input = textField.getText().trim();
		System.out.println("cl : " + input);
		if (input == null) {
			return;
		}
		
		pw.println(input);
		pw.flush();
		
		textField.setText("");
//		try {
//			String msg = br.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
