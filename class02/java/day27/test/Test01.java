package day27.test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class Test01 {

	private Connection conn;
	private PreparedStatement psmt;
	private Random rand = new Random();
	private PrintWriter pw;

	public Test01() {
		try {
			getConnection();
			pw = new PrintWriter("D:\\git\\repository\\class02\\java\\day27\\test\\test.txt");
			insertIntoScores();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			close();
		}
	}

	private void insertIntoScores() throws SQLException {
		String sql = "insert into scores (pid, kor, math, hist, sci, eng, testdate) values(?, ?, ?, ?, ?, ?, sysdate - 10)";
		Random rand = new Random();
		int kor = rand.nextInt(40) + 1 + 60;
		int math = rand.nextInt(40) + 1 + 60;
		int hist = rand.nextInt(40) + 1 + 60;
		int sci = rand.nextInt(40) + 1 + 60;
		int eng = rand.nextInt(40) + 1 + 60;

		for (int index = 1; index < 21; index++) {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, index + 10);
			psmt.setInt(2, kor);
			psmt.setInt(3, math);
			psmt.setInt(4, hist);
			psmt.setInt(5, sci);
			psmt.setInt(6, eng);

			int cnt = psmt.executeUpdate();
			if (cnt == 1) {
				String txt = "insert into scores (pid, kor, math, hist, sci, eng, testdate) values(" + (index + 10) + ", " + kor
						+ ", " + math + ", " + hist + ", " + sci + ", " + eng + ", sysdate);";
				pw.write(txt + '\n');
			}
		}
	}

	private void close() {
		try {
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String u_id = "ex11";
		String u_pw = "ex11";
		conn = DriverManager.getConnection(url, u_id, u_pw);
	}

	public static void main(String[] args) {
		new Test01();
	}
}
