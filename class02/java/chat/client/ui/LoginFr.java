package chat.client.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import chat.client.ChatClient01;
import chat.client.evt.LoginFrEvt;

public class LoginFr extends JFrame {

	public ChatClient01 main;
	
	private JButton loginB, exitB;
	private JLabel idL, pwL;
	private JPanel contentP, idP, pwP, buttonP;
	public JTextField inId;
	public JPasswordField inPw;
	
	
	public LoginFr(ChatClient01 main) {
		this.main = main;
	}

	public LoginFr setUI() {
		this.setTitle("** Login **");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(250, 150));
		this.setResizable(false);

		initializeComponents();
		
		this.setVisible(true);
		return this;
	}

	public void setEvt() {
		loginB.setActionCommand("로그인");
		exitB.setActionCommand("종료");
		LoginFrEvt evt = new LoginFrEvt(main);
		loginB.addActionListener(evt);
		exitB.addActionListener(evt);
	}

	public void initializeComponents() {
		idL = new JLabel("ID : ");
		pwL = new JLabel("PW : ");

		Dimension ldim = new Dimension(35, 11);
		Dimension cdim = new Dimension(150, 32);
		idL.setPreferredSize(ldim);
		pwL.setPreferredSize(ldim);

		idL.setHorizontalAlignment(JLabel.RIGHT);
		pwL.setHorizontalAlignment(JLabel.RIGHT);

		inId = new JTextField();
		inPw = new JPasswordField();

		inId.setPreferredSize(cdim);
		inPw.setPreferredSize(cdim);

		idP = new JPanel(new BorderLayout());
		pwP = new JPanel(new BorderLayout());

		idP.add(idL, BorderLayout.WEST);
		idP.add(inId, BorderLayout.CENTER);

		pwP.add(pwL, BorderLayout.WEST);
		pwP.add(inPw, BorderLayout.CENTER);

		contentP = new JPanel();
		contentP.setPreferredSize(new Dimension(245, 100));
		contentP.add(idP);
		contentP.add(pwP);

		loginB = new JButton("로그인");
		exitB = new JButton("종료");

		buttonP = new JPanel(new GridLayout(1, 2));
		buttonP.setPreferredSize(new Dimension(250, 30));
		buttonP.add(loginB);
		buttonP.add(exitB);

		this.add(contentP, BorderLayout.CENTER);
		this.add(buttonP, BorderLayout.SOUTH);
	}
	
	public JTextField getinId() {
		return inId;
	}

	
}
