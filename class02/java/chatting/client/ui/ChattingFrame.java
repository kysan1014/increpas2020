package chatting.client.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chatting.client.ClientController;
import chatting.client.event.ButtonEvent;
import chatting.client.event.EnterEvent;

public class ChattingFrame extends JFrame {

	ClientController main;

	// 화면 관련 변수
	public JTextArea area;
	public JTextField input;
	public JScrollPane span;
	public JButton sendB;

	public ChattingFrame() {

	}

	public ChattingFrame(ClientController main) {
		this.main = main;
		setUI();
	}

	public void setUI() {
		// 이 클래스는 JFrame을 상속받은 클래스이기 때문에 JFrame의 기능을 가지고 있다.
		this.setTitle("*** cls2 Chat client01 ***");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 채팅 목록
		area = new JTextArea();
		area.setEditable(false);
		area.setFont(new Font("gulim", Font.BOLD, 16));
		span = new JScrollPane(area);
		span.setPreferredSize(new Dimension(420, 460));

		// 입력패널
		JPanel inPan = new JPanel(new BorderLayout());

		// 입력창
		input = new JTextField();
		input.setPreferredSize(new Dimension(350, 30));

		// 버튼
		sendB = new JButton("send");
		sendB.setPreferredSize(new Dimension(100, 30));

		inPan.add(input, BorderLayout.CENTER);
		inPan.add(sendB, BorderLayout.EAST);

//		ButtonEvent actionEvent = new ButtonEvent(main);
		sendB.addActionListener(main.event);
		EnterEvent keyEvent = new EnterEvent(main);
		input.addKeyListener(keyEvent);

		this.add(span, BorderLayout.CENTER);
		this.add(inPan, BorderLayout.SOUTH);

		this.setSize(450, 500);
		this.setResizable(false);
		this.setVisible(false);
	}

}
