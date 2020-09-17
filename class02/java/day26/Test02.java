package day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test02 {

	Connection conn;
	Statement stmt;
	
	public Test02() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("Driver Loaded");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String u_id = "hello";
			String u_pw = "hello";
			conn = DriverManager.getConnection(url, u_id, u_pw);
			
			System.out.println("Database Connected");
			
			stmt = conn.createStatement();
			
			StringBuffer buff = new StringBuffer();
			buff.append("INSERT INTO ");
			buff.append("		member01 (mno, id, name, mail, tel, gen, avt)");
			buff.append("VALUES ( ");
			buff.append("			( ");
			buff.append("				SELECT NVL(MAX(mno), 100) + 1");
			buff.append("				FROM member01");
			buff.append("			), ");
			buff.append("			'jiwoo', '이지우', 'jiwoo@increpas.com', ");
			buff.append("			'010-3333-3333', 'M', 13");
			buff.append("		)");
			
			int cnt = stmt.executeUpdate(buff.toString());
			
			String msg = "Data Insertion Completed";
			if (cnt != 1) {
				msg = "Data Insertion Failed";
			}
			System.out.println(msg);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
				System.out.println("Resource Returned");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		new Test02();
	}
}
