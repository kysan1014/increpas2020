package chatting.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.MyJDBC;

public class MemberDao {

	MyJDBC db;
	final String ID = "hello";
	final String PW = "hello";
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	public MemberDao() {
		db = new MyJDBC();
	}
	
	public int getLogin(String id, String pw) {
		int cnt = 0;
		
		conn = db.getConnection(ID, PW);
		String sql = "SELECT COUNT(*) cnt FROM member WHERE id = ? AND pw = ? AND isshow = 'Y'";
		psmt = db.getPreparedStatement(conn, sql);
		
		try {
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs = psmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(psmt);
			db.close(conn);
		}
		
		return cnt;
	}

}
