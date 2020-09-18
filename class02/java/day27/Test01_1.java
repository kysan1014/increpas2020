package day27;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import day27.dao.Test01_1Dao;
import day27.vo.Employee;

public class Test01_1 {

	private Test01_1Dao dao;
	private Connection conn;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet rs;

	private JFrame frame;
	private JPanel pan1;
	private JPanel pan2;
	private JScrollPane scroll;
	private JTextArea area;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;

	public Test01_1() {
		dao = new Test01_1Dao();
		setUI();
	}

	private void setUI() {
		frame = new JFrame("회원 조회 서비스");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pan1 = new JPanel(new BorderLayout());
		pan1.setPreferredSize(new Dimension(300, 400));
		frame.add(pan1, BorderLayout.CENTER);

		area = new JTextArea();
		scroll = new JScrollPane(area);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		pan1.add(scroll, BorderLayout.CENTER);

		pan2 = new JPanel(new GridLayout(1, 3));
		pan2.setPreferredSize(new Dimension(300, 30));
		frame.add(pan2, BorderLayout.SOUTH);

		btn1 = new JButton("조회");
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ArrayList<Employee> idList = dao.getList();
				StringBuffer buff = new StringBuffer();
				for (Employee emp : idList) {
					buff.append("==================================\n");
					buff.append("사원번호 : " + emp.getEmpno() + "\n");
					buff.append("사원이름 : " + emp.getEname() + "\n");
					buff.append("사원직급 : " + emp.getJob() + "\n");
					buff.append("상사번호 : " + emp.getMgr() + "\n");
					buff.append("입사일자 : " + emp.getHiredate() + "\n");
					buff.append("급     여 : " + emp.getSal() + "\n");
					buff.append("보 너 스 : " + emp.getComm() + "\n");
					buff.append("부서번호 : " + emp.getDeptno() + "\n");
					
				}
				buff.append("==================================\n");
				area.setText(buff.toString());

			}
		});
		pan2.add(btn1);

		btn2 = new JButton("정보");
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("조회할 사원이름 입력");
				ArrayList<Employee> info = dao.getInfo(name);
				StringBuffer buff = new StringBuffer();
				for (Employee emp : info) {
					buff.append("==================================\n");
					buff.append("사원번호 : " + emp.getEmpno() + "\n");
					buff.append("사원이름 : " + emp.getEname() + "\n");
					buff.append("사원직급 : " + emp.getJob() + "\n");
					buff.append("상사번호 : " + emp.getMgr() + "\n");
					buff.append("입사일자 : " + emp.getHiredate() + "\n");
					buff.append("급     여 : " + emp.getSal() + "\n");
					buff.append("보 너 스 : " + emp.getComm() + "\n");
					buff.append("부서번호 : " + emp.getDeptno() + "\n");
					
				}
				buff.append("==================================\n");
				area.setText(buff.toString());
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

	public static void main(String[] args) {
		new Test01_1();
	}
}
