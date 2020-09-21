package day28.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import day28.evt.MemberEvent;

public class MemberUI extends JFrame{
	public JScrollPane span;
	public JButton lbtn, qbtn;
	public JTextArea area;
	public JPanel mPan, tPan, wPan, cPan, picPan;
	public JLabel welcome, ttl;
	public ImageIcon icon;
	public Image img;
	public JLabel cid, cno, cname, cmail, ctel, cano, cjoin, cgen;
	public BorderLayout blout;
	
	public void setCont() {
		
		Dimension dim = new Dimension(60, 10);
		JLabel tid = new JLabel("아 이 디 : ");
		tid.setPreferredSize(dim);
		tid.setHorizontalAlignment(JLabel.RIGHT);
		JLabel tno = new JLabel("회원번호 : ");
		tno.setPreferredSize(dim);
		tno.setHorizontalAlignment(JLabel.RIGHT);
		JLabel tname = new JLabel("회원이름 : ");
		tname.setPreferredSize(dim);
		tname.setHorizontalAlignment(JLabel.RIGHT);
		JLabel tmail = new JLabel("메일주소 : ");
		tmail.setPreferredSize(dim);
		tmail.setHorizontalAlignment(JLabel.RIGHT);
		JLabel ttel = new JLabel("전화번호 : ");
		ttel.setPreferredSize(dim);
		ttel.setHorizontalAlignment(JLabel.RIGHT);
		JLabel tano = new JLabel("아 바 타 : ");
		tano.setPreferredSize(dim);
		tano.setHorizontalAlignment(JLabel.RIGHT);
		JLabel tjoin = new JLabel("가 입 일 : ");
		tjoin.setPreferredSize(dim);
		tjoin.setHorizontalAlignment(JLabel.RIGHT);
		JLabel tgen = new JLabel("성    별 : ");
		tgen.setPreferredSize(dim);
		tgen.setHorizontalAlignment(JLabel.RIGHT);

		
		Dimension dim1 = new Dimension(160, 10);
		cno = new JLabel("");
		cno.setPreferredSize(dim1);
		cid = new JLabel("");
		cid.setPreferredSize(dim1);
		cname = new JLabel("");
		cname.setPreferredSize(dim1);
		cmail = new JLabel("");
		cmail.setPreferredSize(dim1);
		ctel = new JLabel("");
		ctel.setPreferredSize(dim1);
		cano = new JLabel("");
		cano.setPreferredSize(dim1);
		cjoin = new JLabel("");
		cjoin.setPreferredSize(dim1);
		cgen = new JLabel("");
		cgen.setPreferredSize(dim1);
		
		cno.setHorizontalAlignment(JLabel.CENTER);
		cid.setHorizontalAlignment(JLabel.CENTER);
		cname.setHorizontalAlignment(JLabel.CENTER);
		cmail.setHorizontalAlignment(JLabel.CENTER);
		ctel.setHorizontalAlignment(JLabel.CENTER);
		cano.setHorizontalAlignment(JLabel.CENTER);
		cjoin.setHorizontalAlignment(JLabel.CENTER);
		cgen.setHorizontalAlignment(JLabel.CENTER);
		
		
		Dimension dim2 = new Dimension(245, 10);
		JPanel idP = new JPanel(new BorderLayout());
		idP.setBackground(Color.WHITE);
		idP.setPreferredSize(dim2);
		idP.add(tid, BorderLayout.WEST);
		idP.add(cid, BorderLayout.CENTER);
		JPanel noP = new JPanel(new BorderLayout());
		noP.setBackground(Color.WHITE);
		noP.setPreferredSize(dim2);
		noP.add(tno, BorderLayout.WEST);
		noP.add(cno, BorderLayout.CENTER);
		JPanel nameP = new JPanel(new BorderLayout());
		nameP.setBackground(Color.WHITE);
		nameP.setPreferredSize(dim2);
		nameP.add(tname, BorderLayout.WEST);
		nameP.add(cname, BorderLayout.CENTER);
		JPanel mailP = new JPanel(new BorderLayout());
		mailP.setBackground(Color.WHITE);
		mailP.setPreferredSize(dim2);
		mailP.add(tmail, BorderLayout.WEST);
		mailP.add(cmail, BorderLayout.CENTER);
		JPanel telP = new JPanel(new BorderLayout());
		telP.setBackground(Color.WHITE);
		telP.setPreferredSize(dim2);
		telP.add(ttel, BorderLayout.WEST);
		telP.add(ctel, BorderLayout.CENTER);
		JPanel anoP = new JPanel(new BorderLayout());
		anoP.setBackground(Color.WHITE);
		anoP.setPreferredSize(dim2);
		anoP.add(tano, BorderLayout.WEST);
		anoP.add(cano, BorderLayout.CENTER);
		JPanel joinP = new JPanel(new BorderLayout());
		joinP.setBackground(Color.WHITE);
		joinP.setPreferredSize(dim2);
		joinP.add(tjoin, BorderLayout.WEST);
		joinP.add(cjoin, BorderLayout.CENTER);
		JPanel genP = new JPanel(new BorderLayout());;
		genP.setBackground(Color.WHITE);
		genP.setPreferredSize(dim2);
		genP.add(tgen, BorderLayout.WEST);
		genP.add(cgen, BorderLayout.CENTER);
		
		JPanel contPan = new JPanel(new GridLayout(8, 1));
		contPan.setBackground(Color.WHITE);
		contPan.add(noP);
		contPan.add(idP);
		contPan.add(nameP);
		contPan.add(mailP);
		contPan.add(telP);
		contPan.add(anoP);
		contPan.add(genP);
		contPan.add(joinP);
		
		cPan.add(contPan, BorderLayout.CENTER);
		
	}
	
	public MemberUI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbtn = new JButton("회원리스트");
		qbtn = new JButton("작업 종료");
		
		
		blout = new BorderLayout();
		
//		MemberEvent mEvt = new MemberEvent(this);
//		lbtn.addActionListener(mEvt);
//		qbtn.addActionListener(mEvt);
		
		JPanel bPan = new JPanel(new GridLayout(1, 2));
		bPan.setPreferredSize(new Dimension(450, 30));
		bPan.add(lbtn);
		bPan.add(qbtn);
		
		mPan = new JPanel(new BorderLayout());
		mPan.setPreferredSize(new Dimension(430, 320));
		welcome = new JLabel("*** 2강의장에 오시것을 환영합니다. ***");
		welcome.setFont(new Font("gulim", Font.BOLD, 24));
		welcome.setHorizontalAlignment(JLabel.CENTER);
		
		tPan = new JPanel(new BorderLayout());
		tPan.setAlignmentY(JComponent.CENTER_ALIGNMENT);
		tPan.setPreferredSize(new Dimension(450, 50));
		tPan.setBackground(Color.white);
		ttl = new JLabel("회원 정보");
		ttl.setFont(new Font("gulim", Font.BOLD, 20));
		ttl.setForeground(Color.DARK_GRAY);
		ttl.setHorizontalAlignment(JLabel.CENTER);
		JPanel hGrd = new JPanel();
		hGrd.setBackground(Color.LIGHT_GRAY);
		hGrd.setPreferredSize(new Dimension(450, 2));
		tPan.add(ttl, BorderLayout.CENTER);
		tPan.add(hGrd, BorderLayout.SOUTH);
		
		// avatar icon
		wPan = new JPanel(new BorderLayout());
		wPan.setPreferredSize(new Dimension(200, 250));
		wPan.setBackground(Color.white);
		
		icon = new ImageIcon("src/day27/img/avatar/noImage.jpg");
		img = icon.getImage();
		picPan = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(img, 20, 45, 160, 160, null);
			}
		};
		
		wPan.add(picPan);
		wPan.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		wPan.setAlignmentY(JPanel.CENTER_ALIGNMENT);
		
		cPan = new JPanel(new BorderLayout());
		cPan.setPreferredSize(new Dimension(250, 160));
		cPan.setBackground(Color.WHITE);
		
		// 공백용 패
		JPanel tgap = new JPanel();
		JPanel bgap = new JPanel();
		tgap.setPreferredSize(new Dimension(250, 20));
		bgap.setPreferredSize(new Dimension(250, 20));
		tgap.setBackground(Color.WHITE);
		bgap.setBackground(Color.WHITE);
		
		setCont();
		
		cPan.add(tgap, BorderLayout.NORTH);
		cPan.add(bgap, BorderLayout.SOUTH);
		
		mPan.setBackground(Color.WHITE);
		
		mPan.add(welcome);
		span = new JScrollPane(mPan);
		
		add(span, BorderLayout.CENTER);
		add(bPan, BorderLayout.SOUTH);
		
		this.setSize(450, 350);
		this.pack();
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public static void main(String[] args) {
		new MemberUI();
	}

}
