package day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Test01 {
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public Test01() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String aid = "hello";
			String apw = "hello";
			conn = DriverManager.getConnection(url, aid, apw);
			
			stmt = conn.createStatement();
			
			String str = JOptionPane.showInputDialog("조회할 아이디를 입력하세요!");
			String sql = "SELECT name FROM member01 WHERE id = '" + str + "'";
			
			rs = stmt.executeQuery(sql);
			rs.next();
			String name = rs.getString("name");
			
			String msg = "<html><h2>입력한 아이디 " + str + "은 " + name + " 회원이 사용하고 있습니다.</h2></html>";
			JOptionPane.showMessageDialog(null, msg);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
				System.out.println("Closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test01();
	}
}
