package chatting.client.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import chatting.client.ClientController;
import chatting.client.event.ButtonEvent;

public class LoginFrame extends JFrame{
	
	ClientController main;

	public JButton loginB, exitB;
	public JTextField inId;
	public JPasswordField inPw;
	
	public LoginFrame() {
		
	}

	public LoginFrame(ClientController main) {
		this.main = main;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 입력창 만들기
		JLabel lid = new JLabel("I D : ");
		JLabel lpw = new JLabel("P W : ");

		// dimension
		Dimension ldim = new Dimension(35, 11);
		Dimension cdim = new Dimension(150, 32);

		// 라벨사이즈지정
		lid.setPreferredSize(ldim);
		lpw.setPreferredSize(ldim);

		// 라벨 텍스트 정렬
		lid.setHorizontalAlignment(JLabel.RIGHT);
		lpw.setHorizontalAlignment(JLabel.RIGHT);

		// 입력창 만들기
		inId = new JTextField();
		inPw = new JPasswordField();

		// 입력창 사이즈
		inId.setPreferredSize(cdim);
		inPw.setPreferredSize(cdim);

		// 감싸는 패널 만들기
		JPanel idP = new JPanel(new BorderLayout());
		JPanel pwP = new JPanel(new BorderLayout());

		// 패널에 내용추가하기
		idP.add(lid, BorderLayout.WEST);
		idP.add(inId, BorderLayout.CENTER);
		pwP.add(lpw, BorderLayout.WEST);
		pwP.add(inPw, BorderLayout.CENTER);

		// 입력내용 모두 감쌀 패널
		JPanel loginPan = new JPanel();
		loginPan.setPreferredSize(new Dimension(245, 100));
		loginPan.add(idP);
		loginPan.add(pwP);

		// 버튼 추가
		loginB = new JButton("로그인");
		exitB = new JButton("종료");

		// 버튼 패널
		JPanel bPan = new JPanel(new GridLayout(1, 2));
		bPan.setPreferredSize(new Dimension(250, 30));
		bPan.add(loginB);
		bPan.add(exitB);

		this.add(loginPan, BorderLayout.CENTER);
		this.add(bPan, BorderLayout.SOUTH);

//		ButtonEvent event = new ButtonEvent(main);
		loginB.addActionListener(main.event);
		exitB.addActionListener(main.event);
		
		this.setSize(250, 150);
		this.setResizable(false);
		this.setVisible(true);
	}


}
