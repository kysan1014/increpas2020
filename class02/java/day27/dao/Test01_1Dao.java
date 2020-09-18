package day27.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import day27.vo.Employee;
import db.MyJDBC;

public class Test01_1Dao {

	MyJDBC db;
	Connection conn;
	Statement stmt;
	PreparedStatement psmt;
	ResultSet rs;
	Employee emp;
	ArrayList<Employee> elist;

	public Test01_1Dao() {
		db = new MyJDBC();
	}

	public ArrayList<Employee> getInfo(String name) {
		conn = db.getConnection("scott", "tiger");
		String sql = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp where ename = ?";
		psmt = db.getPreparedStatement(conn, sql);
		elist = new ArrayList<Employee>();
		try {
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			while (rs.next()) {
				elist.add(
							new Employee(
									rs.getInt("empno"), 
									rs.getString("ename"), 
									rs.getString("job"), 
									rs.getInt("mgr"),
									new SimpleDateFormat("yyyy.MM.dd").format(rs.getDate("hiredate")), 
									rs.getInt("sal"),
									rs.getInt("comm"), 
									rs.getInt("deptno")
									)
							);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return elist;
	}

	public ArrayList<Employee> getList() {
		conn = db.getConnection("scott", "tiger");
		String sql = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp";
		psmt = db.getPreparedStatement(conn, sql);
		elist = new ArrayList<Employee>();
		try {
			rs = psmt.executeQuery();
			while (rs.next()) {
				elist.add(
							new Employee(
									rs.getInt("empno"), 
									rs.getString("ename"), 
									rs.getString("job"), 
									rs.getInt("mgr"),
									new SimpleDateFormat("yyyy.MM.dd").format(rs.getDate("hiredate")), 
									rs.getInt("sal"),
									rs.getInt("comm"), 
									rs.getInt("deptno")
									)
							);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return elist;
	}

	public void close() {
		if (rs != null)
			db.close(rs);
		if (psmt != null)
			db.close(psmt);
		if (stmt != null)
			db.close(stmt);
		if (conn != null)
			db.close(conn);
	}

}
