package day27;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import day27.dao.MemberDao;
import day27.vo.MemberVO;

public class Test02 {
	private JFrame frame;
	private JTextArea area;
	private JTextField id, name, pw, mail, tel, gen, avt;
	private JButton btn1, btn2;

	private MemberDao mDao;

	public Test02() {
		setUI();
		mDao = new MemberDao();
	}

	public void setUI() {
		frame = new JFrame("회원가입");

//		title 설정
		JLabel title = new JLabel("*** 회원가입 ***");
		title.setFont(new Font("Gulim", Font.BOLD, 22));
		JPanel pan1 = new JPanel();
		pan1.add(title);
		pan1.setPreferredSize(new Dimension(450, 40));
		pan1.setBackground(Color.ORANGE);

//		입력폼 만들기
		// id
		JPanel idPan = new JPanel(new BorderLayout());
		idPan.setPreferredSize(new Dimension(420, 30));
		JLabel lid = new JLabel("I D : ");
		lid.setFont(new Font("gulim", Font.BOLD, 18));
		lid.setHorizontalAlignment(JLabel.RIGHT);
		lid.setPreferredSize(new Dimension(80, 30));
		id = new JTextField("아이디를 입력하세요.");
		id.setForeground(Color.ORANGE);
		idPan.add(lid, BorderLayout.WEST);
		idPan.add(id, BorderLayout.CENTER);

		// name
		JPanel namePan = new JPanel(new BorderLayout());
		namePan.setPreferredSize(new Dimension(420, 30));
		JLabel lname = new JLabel("NAME : ");
		lname.setFont(new Font("gulim", Font.BOLD, 18));
		lname.setHorizontalAlignment(JLabel.RIGHT);
		lname.setPreferredSize(new Dimension(80, 30));
		name = new JTextField("이름을 입력하세요.");
		name.setForeground(Color.ORANGE);
		namePan.add(lname, BorderLayout.WEST);
		namePan.add(name, BorderLayout.CENTER);

		// 비밀번호
		JPanel pwPan = new JPanel(new BorderLayout());
		pwPan.setPreferredSize(new Dimension(420, 30));
		JLabel lpw = new JLabel("P W : ");
		lpw.setFont(new Font("gulim", Font.BOLD, 18));
		lpw.setHorizontalAlignment(JLabel.RIGHT);
		lpw.setPreferredSize(new Dimension(80, 30));
		pw = new JTextField("비밀번호를 입력하세요.");
		pw.setForeground(Color.ORANGE);
		pwPan.add(lpw, BorderLayout.WEST);
		pwPan.add(pw, BorderLayout.CENTER);

		// mail
		JPanel mailPan = new JPanel(new BorderLayout());
		mailPan.setPreferredSize(new Dimension(420, 30));
		JLabel lmail = new JLabel("MAIL : ");
		lmail.setFont(new Font("gulim", Font.BOLD, 18));
		lmail.setHorizontalAlignment(JLabel.RIGHT);
		lmail.setPreferredSize(new Dimension(80, 30));
		mail = new JTextField("메일을 입력하세요.");
		mail.setForeground(Color.ORANGE);
		mailPan.add(lmail, BorderLayout.WEST);
		mailPan.add(mail, BorderLayout.CENTER);

		// tel
		JPanel telPan = new JPanel(new BorderLayout());
		telPan.setPreferredSize(new Dimension(420, 30));
		JLabel ltel = new JLabel("TEL : ");
		ltel.setFont(new Font("gulim", Font.BOLD, 18));
		ltel.setHorizontalAlignment(JLabel.RIGHT);
		ltel.setPreferredSize(new Dimension(80, 30));
		tel = new JTextField("전화번호를 입력하세요. 예 ] 010-1234-9876");
		tel.setForeground(Color.ORANGE);
		telPan.add(ltel, BorderLayout.WEST);
		telPan.add(tel, BorderLayout.CENTER);

		// 성별
		JPanel genPan = new JPanel(new BorderLayout());
		genPan.setPreferredSize(new Dimension(420, 30));
		JLabel lgen = new JLabel("성 별 : ");
		lgen.setFont(new Font("gulim", Font.BOLD, 18));
		lgen.setHorizontalAlignment(JLabel.RIGHT);
		lgen.setPreferredSize(new Dimension(80, 30));
		gen = new JTextField("성별을 입력하세요. 예 ] M");
		gen.setForeground(Color.ORANGE);
		genPan.add(lgen, BorderLayout.WEST);
		genPan.add(gen, BorderLayout.CENTER);

		// 아바타
		JPanel avtPan = new JPanel(new BorderLayout());
		avtPan.setPreferredSize(new Dimension(420, 30));
		JLabel lavt = new JLabel("아바타 : ");
		lavt.setFont(new Font("gulim", Font.BOLD, 18));
		lavt.setHorizontalAlignment(JLabel.RIGHT);
		lavt.setPreferredSize(new Dimension(80, 30));
		avt = new JTextField("아바타번호를 입력하세요.");
		avt.setForeground(Color.ORANGE);
		avtPan.add(lavt, BorderLayout.WEST);
		avtPan.add(avt, BorderLayout.CENTER);

		JPanel mainPan = new JPanel();
		mainPan.add(idPan);
		mainPan.add(namePan);
		mainPan.add(pwPan);
		mainPan.add(mailPan);
		mainPan.add(telPan);
		mainPan.add(genPan);
		mainPan.add(avtPan);

		// 버튼
		btn1 = new JButton("가입");
		btn2 = new JButton("종료");

		btn1.setPreferredSize(new Dimension(225, 30));
		btn2.setPreferredSize(new Dimension(225, 30));

		joinEvt();

		JPanel btnPan = new JPanel(new GridLayout(1, 2));
		btnPan.add(btn1);
		btnPan.add(btn2);

		frame.add(pan1, BorderLayout.NORTH);
		frame.add(mainPan, BorderLayout.CENTER);
		frame.add(btnPan, BorderLayout.SOUTH);
		frame.setSize(450, 370);
		frame.setVisible(true);
	}

	private void joinEvt() {
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String sid = id.getText().trim();
				int cnt = mDao.idCount(sid);
				if (cnt == 1) {
					id.setText("");
					JOptionPane.showMessageDialog(null, sid + "는 이미 사용중인 아이디 입니다.");
				} else {
//					JOptionPane.showMessageDialog(null, "<html><h2 style=\"color:blue\">" + sid + "는 사용가능한 아이디입니다.</h2></html>");
					try {
						MemberVO mem = new MemberVO();
						mem.setId(id.getText().trim());
						mem.setName(name.getText().trim());
						mem.setPw(pw.getText().trim());
						mem.setMail(mail.getText().trim());
						mem.setTel(tel.getText().trim());
						mem.setGen(gen.getText().trim());
						mem.setAvt(Integer.parseInt(avt.getText().trim()));
						cnt = mDao.addMember(mem);
						if (cnt == 1) JOptionPane.showMessageDialog(null, "<html><h2 style=\"color:blue\">성공적으로 가입되었습니다.</h2></html>");
					} catch (NumberFormatException nfe) {
						nfe.printStackTrace();
						JOptionPane.showMessageDialog(null, "<html><h2 style=\"color:blue\">잘못된 데이터 형식으로 입력하셨습니다.</h2></html>");
					} catch (NullPointerException npe) {
						npe.printStackTrace();
						JOptionPane.showMessageDialog(null, "<html><h2 style=\"color:blue\">누락된 데이터가 존재합니다.</h2></html>");
					} catch (SQLException se) {
						se.printStackTrace();
						JOptionPane.showMessageDialog(null, "<html><h2 style=\"color:blue\">잘못된 데이터 형식으로 입력하셨습니다.</h2></html>");
					}
				}
			}
		});
	}

	public static void main(String[] args) {
		new Test02();
	}

}
