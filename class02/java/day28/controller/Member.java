package day28.controller;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import day28.evt.JoinEvent;
import day28.evt.MemberEvent;
import day28.ui.MemberJoin;

public class Member {

	public JFrame fr;
	public MemberJoin join;
	
	public Member() {
		fr = new JFrame();
		join = new MemberJoin();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pan = new JPanel(new GridLayout(1,3));
		
		JButton btn1 = new JButton("회원리스트");
		JButton btn2 = new JButton("회원가입");
		JButton btn3 = new JButton("닫기");
		
		btn1.setActionCommand("회원리스트");
		btn2.setActionCommand("회원가입");
		btn3.setActionCommand("닫기");

		pan.add(btn1);
		pan.add(btn2);
		pan.add(btn3);
		fr.add(pan);
		
		fr.setSize(new Dimension(400, 100));
		fr.setResizable(false);
		
		MemberEvent evt = new MemberEvent(this);
		btn1.addActionListener(evt);
		btn2.addActionListener(evt);
		btn3.addActionListener(evt);
		
		fr.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Member();
	}

}
