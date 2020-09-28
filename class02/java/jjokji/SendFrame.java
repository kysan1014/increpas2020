package jjokji;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SendFrame {

	public Jjokji main;

	public JFrame wframe;
	public JTextField field;
	public JTextArea area;
	public JButton sendB, resetB, exitB;
	
	public SendFrame(Jjokji main) {
		this.main = main;
		
		setUI();
		
	}

	public void setUI() {
		wframe = new JFrame("### 쪽지쓰기 ###");
		wframe.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				wframe.setVisible(false);
				main.fr.setVisible(true);
			}

		});
		field = new JTextField();
		area = new JTextArea();
		JScrollPane span = new JScrollPane(area);
		
		sendB = new JButton("보내기");
		resetB = new JButton("초기화");
		exitB = new JButton("닫기");
		
		BtnEvent event = new BtnEvent(this);
		sendB.addActionListener(event);
		resetB.addActionListener(event);
		exitB.addActionListener(event);
		
		JLabel label = new JLabel("받는 사람 : ");
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("West", label);
		p1.add("Center", field);
		
		JPanel p2 = new JPanel(new GridLayout(1,3));
		p2.add(sendB);
		p2.add(resetB);
		p2.add(exitB);

		wframe.add("North", p1);
		wframe.add("Center", span);
		wframe.add("South", p2);
		
		wframe.setSize(400, 300);
		wframe.setResizable(false);
	}

}
