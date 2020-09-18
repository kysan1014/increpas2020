package day27;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import db.MyJDBC;

public class Test01 {

	private MyJDBC db;
	private Connection conn;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet rs;

	private JFrame frame;
	private JPanel pan1;
	private JPanel pan2;
	private JTextArea area;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;

	public Test01() {
		db = new MyJDBC();

		setUI();

	}

	private void setUI() {
		frame = new JFrame("회원 조회 서비스");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pan1 = new JPanel(new BorderLayout());
		pan1.setPreferredSize(new Dimension(300, 400));
		frame.add(pan1, BorderLayout.CENTER);

		area = new JTextArea();
		pan1.add(area, BorderLayout.CENTER);

		pan2 = new JPanel(new GridLayout(1, 3));
		pan2.setPreferredSize(new Dimension(300, 30));
		frame.add(pan2, BorderLayout.SOUTH);

		btn1 = new JButton("조회");
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ArrayList<String> idList = getList();
				StringBuffer buff = new StringBuffer();
				for (String id : idList) {
					buff.append(id + '\n');
				}
				area.setText(buff.toString());

			}
		});
		pan2.add(btn1);

		btn2 = new JButton("정보");
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String info = getInfo();
				area.setText(info);
			}
		});
		pan2.add(btn2);

		btn3 = new JButton("종료");
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		pan2.add(btn3);

		frame.setSize(300, 430);
		frame.setVisible(true);
		frame.setResizable(false);

	}

	private ArrayList<String> getList() {
		conn = db.getConnection("hello", "hello");
		stmt = db.getStatement(conn);
		String sql = "select id from member01 where isshow = 'Y'";
		ArrayList<String> idList = new ArrayList<String>();

		try {
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				idList.add(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(conn);
		}
		return idList;
	}

	private String getInfo() {
		String sid = JOptionPane.showInputDialog("조회할 아이디 입력");
		conn = db.getConnection("hello", "hello");
		String sql = "select id, name, mail, tel, gen, avt, joindate from member01 where id = ?";
		psmt = db.getPreparedStatement(conn, sql);
		StringBuffer buff = new StringBuffer();
		try {
			psmt.setString(1, sid);
			rs = psmt.executeQuery();
			if (rs.next()) {
				buff.append("회원번호 : " + rs.getString(1) + "\n");
				buff.append("회원이름 : " + rs.getString(2) + "\n");
				buff.append("회원메일 : " + rs.getString(3) + "\n");
				buff.append("전화번호 : " + rs.getString(4) + "\n");
				buff.append("회원성별 : " + rs.getString(5) + "\n");
				buff.append("아 바 타 : " + rs.getString(6) + "\n");
				SimpleDateFormat form1 = new SimpleDateFormat("yyyy년 MM월 dd일");
				SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
				buff.append("가입일자 : ");
				buff.append(form1.format(rs.getDate(7)) + " ");
				buff.append(form2.format(rs.getTime(7)) + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(conn);
		}
		return buff.toString();
	}

	public static void main(String[] args) {
		new Test01();
	}

}
