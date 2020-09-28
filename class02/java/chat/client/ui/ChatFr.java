package chat.client.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chat.client.ChatClient01;
import chat.client.evt.ChatFrEvt;

public class ChatFr extends JFrame {

	private ChatClient01 main;
	private LoginFr loginFr;
	private JTextArea area;
	private JTextField input;
	private JScrollPane span;
	private JPanel inPan;
	private JButton sendB;

	private Socket socket;
	private String id;
	
	public ChatFr(ChatClient01 main) {
		this.main = main;
		socket = main.getSocket();
	}

	public ChatFr setUI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initializeComponents();
		setEvt();
		
		this.setSize(450, 500);
		this.setResizable(false);
		this.setVisible(false);
		
		return this;
	}

	private void setEvt() {
		ChatFrEvt evt = new ChatFrEvt(main);
		sendB.addActionListener(evt);
	}

	public void initializeComponents() {
		area = new JTextArea();
		area.setEditable(false);
		span = new JScrollPane(area);
		span.setPreferredSize(new Dimension(420, 460));
		
		inPan = new JPanel(new BorderLayout());
		
		input = new JTextField();
		input.setPreferredSize(new Dimension(350, 30));
		
		sendB = new JButton("send");
		
		inPan.add(input, BorderLayout.CENTER);
		inPan.add(sendB, BorderLayout.EAST);
		
		this.add(span, BorderLayout.CENTER);
		this.add(inPan, BorderLayout.SOUTH);
	}
	
	public JScrollPane getScrollPane() {
		return span;
	}
	
	public JTextArea getTextArea() {
		return area;
	}
	
	public JTextField getTextField() {
		return input;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
