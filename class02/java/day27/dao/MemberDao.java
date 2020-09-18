package day27.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import day27.sql.MemberSQL;
import day27.vo.MemberVO;
import db.MyJDBC;

public class MemberDao {

	private MyJDBC db;
	private MemberSQL mSQL;
	private Connection conn;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet rs;

	public MemberDao() {
		db = new MyJDBC();
		mSQL = new MemberSQL();
	}

	public int addMember(MemberVO mVO) throws SQLException {
		int cnt = 0;
		conn = db.getConnection("hello", "hello");
		String sql = mSQL.getSQL(mSQL.ADD_MEMB);
		psmt = db.getPreparedStatement(conn, sql);

		psmt.setString(1, mVO.getId());
		psmt.setString(2, mVO.getName());
		psmt.setString(3, mVO.getPw());
		psmt.setString(4, mVO.getMail());
		psmt.setString(5, mVO.getTel());
		psmt.setString(6, mVO.getGen());
		psmt.setInt(7, mVO.getAvt());
		cnt = psmt.executeUpdate();
		
		return cnt;
	}

	public int idCount(String id) {
		conn = db.getConnection("hello", "hello");
		int cnt = 0;
		String sql = mSQL.getSQL(mSQL.SEL_ID_CNT);
		psmt = db.getPreparedStatement(conn, sql);
		try {
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			rs.next();
			cnt = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	private void close() {
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
