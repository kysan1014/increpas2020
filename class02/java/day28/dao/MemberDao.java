package day28.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import day28.sql.MemberSQL;
import day28.vo.MemberVO;
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
	
	public ArrayList<MemberVO> getList() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		System.out.println("시작");
		conn = db.getConnection("hello", "hello");
		stmt = db.getStatement(conn);
		String sql = mSQL.getSQL(mSQL.SEL_MEMB_LIST);
		try {
			rs = stmt.executeQuery(sql);
			System.out.println(rs);
			while (rs.next()) {
				MemberVO mVO = new MemberVO();
				mVO.setMno(rs.getInt("mno"));
				mVO.setId(rs.getString("id"));
				mVO.setName(rs.getString("name"));
				mVO.setEmail(rs.getString("mail"));
				list.add(mVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				db.close(rs);
			db.close(stmt);
			db.close(conn);
		}
		return list;
	}
	
	public int idCount(String id) {
		int cnt = 0;
		conn = db.getConnection("hello", "hello");
		
		psmt = db.getPreparedStatement(conn, mSQL.getSQL(mSQL.SEL_MEMB_CNT));
		try {
			psmt.setString(1, id);
			
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				cnt = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				db.close(rs);
			db.close(psmt);
			db.close(conn);
		}
		
		return cnt;
	}

	public int joinMember(MemberVO mVO) {
		int cnt = 0;
		conn = db.getConnection("hello", "hello");
		
		psmt = db.getPreparedStatement(conn, mSQL.getSQL(mSQL.INSERT_MEMB));
		try {
			psmt.setString(1, mVO.getId());
			psmt.setString(2, mVO.getPw());
			psmt.setString(3, mVO.getName());
			psmt.setString(4, mVO.getEmail());
			psmt.setString(5, mVO.getTel());
			psmt.setString(6, mVO.getGen());
			psmt.setInt(7, mVO.getAno());
			
			cnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close(psmt);
			db.close(conn);
		}
		
		return cnt;
	}

}
