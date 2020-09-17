package day26.initSteam;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class InitSteam {

	private Connection conn;
	private PreparedStatement psmt;
	private Random rand = new Random();
	private PrintWriter pw;

	public InitSteam() {
		try {
			getConnection();
			pw = new PrintWriter("D:\\git\\repository\\class02\\java\\day26\\initSteam\\temp.txt");

//			insertIntoCountries();
//			insertIntoLanguages();
//			insertIntoLocations();
			insertIntoUsers();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			close();
			pw.close();
		}
	}

	private void insertIntoCountries() throws SQLException {
		String sql = "insert into countries values(?,?)";

		for (int index = 1; index < 31; index++) {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, index);
			psmt.setString(2, String.format("Country%1$02d", index));

			int cnt = psmt.executeUpdate();
			if (cnt == 1) {
				System.out.println("insert into countries values (" + index + ", '"
						+ String.format("Country%1$02d", index) + "');");
			}
		}
	}

	private void insertIntoLanguages() throws SQLException {
		String sql = "insert into languages values(?, ?, ?)";

		for (int index = 1; index < 31; index++) {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, index);
			psmt.setString(2, String.format("Language%1$02d", index));
			psmt.setInt(3, index);

			int cnt = psmt.executeUpdate();
			if (cnt == 1) {
				System.out.println("insert into languages values (" + index + ", '"
						+ String.format("Language%1$02d", index) + "', " + index + ");");
			}
		}
	}

	private void insertIntoLocations() throws SQLException, ClassNotFoundException {
		String sql = "insert into locations values(?, ?, ?)";
		int n = 1;
		for (int j = 1; j < 31; j++) {
			for (int index = 1; index < rand.nextInt(7) + 4; index++) {
				if (n % 200 == 0) {
					close();
					getConnection();
				}
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, n);
				psmt.setString(2, String.format("City%1$03d", n));
				psmt.setInt(3, j);

				int cnt = psmt.executeUpdate();
				if (cnt == 1) {
					System.out.println("insert into locations values (" + n + ", '" + String.format("City%1$03d", n++)
							+ "', " + j + ");");
				}
			}
		}
	}

	private void insertIntoUsers() throws SQLException, ClassNotFoundException {
		String sql = "insert into users values(?, ?, ?, ?, default, null)";
		int n = 1;
		for (int j = 1; j < 151; j++) {
			for (int index = 1; index < rand.nextInt(1500) + 1000; index++) {
				if (n % 200 == 0) {
					close();
					getConnection();
				}
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, n);
				psmt.setString(2, String.format("User%1$06d@increpas.com", n));
				psmt.setString(3, String.format("User%1$06d", n));
				psmt.setInt(4, j);

				int cnt = psmt.executeUpdate();
				if (cnt == 1) {
					String txt = "insert into users values (" + n + ", '" + String.format("User%1$06d@increpas.com", n)
							+ "', '" + String.format("User%1$06d", n++) + "', " + j + ");\n";
					System.out.println(txt);
					pw.write(txt);
				}
			}
		}
	}

	private void close() {
		try {
			psmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String u_id = "steam";
		String u_pw = "steam";
		conn = DriverManager.getConnection(url, u_id, u_pw);
	}

	public static void main(String[] args) {
		new InitSteam();
	}
}
