package db;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJDBC {
	private final String DRIVER_PATH = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private Connection conn;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet rs;

	public MyJDBC() {
		try {
			Class.forName(DRIVER_PATH);

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}

	public MyJDBC(String ip) {
		try {
			Class.forName(DRIVER_PATH);

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}

		this.url = "jdbc:oracle:thin:@" + ip + ":1521:orcl";
	}

	public Connection getConnection(String u_id, String u_pw) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, u_id, u_pw);
			return conn;
		} catch (SQLException e) {
			System.out.println("데이터베이스 접속 실패");
			e.printStackTrace();
		}
		return conn;
	}

	public Connection getMemberConnection(String u_id, String u_pw) {
		try {
			conn = DriverManager.getConnection(url, u_id, u_pw);
		} catch (SQLException e) {
			System.out.println("데이터베이스 접속 실패");
			e.printStackTrace();
		}
		return conn;
	}

	public Statement getStatement(Connection conn) {
		Statement stmt = null;
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stmt;
	}

	public Statement getMemberStatement() {
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stmt;
	}

	public PreparedStatement getPreparedStatement(Connection conn, String sql) {
		PreparedStatement psmt = null;
		try {
			psmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return psmt;
	}

	public PreparedStatement getMemberPreparedStatement(String sql) {
		try {
			psmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return psmt;
	}

	public void close(Object obj) {
		try {
			if (obj instanceof Connection) {
				((Connection) obj).close();
			} else if (obj instanceof PreparedStatement) {
				((PreparedStatement) obj).close();
			} else if (obj instanceof Statement) {
				((Statement) obj).close();
			} else if (obj instanceof ResultSet) {
				((ResultSet) obj).close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeMembers() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
