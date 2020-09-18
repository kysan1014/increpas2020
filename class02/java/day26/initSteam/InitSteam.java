package day26.initSteam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

public class InitSteam {

	private Connection conn;
	private PreparedStatement psmt;
	private Random rand = new Random();
	private PrintWriter pw;
	private BufferedReader br;

	public InitSteam() {
		try {
			getConnection();
			pw = new PrintWriter("D:\\git\\repository\\class02\\java\\day26\\initSteam\\temp.txt");

//			insertIntoCountries();
//			insertIntoLanguages();
//			insertIntoLocations();
//			insertIntoUsers();
//			insertIntoAccounts();
			insertIntoGenre();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
	
	private void insertIntoAccounts() throws SQLException, ClassNotFoundException {
		String sql = "insert into accounts values(?, ?, ?, ?, ?, null)";
		int randPw = 0;
		int randCode = 0;
		for (int j = 1; j < 156010; j++) {
				if (j % 200 == 0) {
					close();
					getConnection();
				}
				randPw = rand.nextInt(10000);
				randCode = rand.nextInt(1000);
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, j);
				psmt.setInt(2, j);
				psmt.setString(3, String.format("%1$016d", j));
				psmt.setString(4, String.format("%1$04d", j + randPw));
				psmt.setString(5, String.format("%1$03d", j + randCode));
				
				int cnt = psmt.executeUpdate();
				if (cnt == 1) {
					String txt = "insert into accounts values (" + 
									j + ", " + 
									j + ", '" + 
									String.format("%1$016d", j) + "', '" + 
									String.format("%1$04d", randPw) + "', '" + 
									String.format("%1$03d", randCode) + 
									"');\n";
					System.out.println(txt);
					pw.write(txt);
				}
		}
	}
	
	private void insertIntoGenre() throws SQLException, ClassNotFoundException, IOException {
		br = new BufferedReader(new FileReader("D:\\git\\repository\\class02\\java\\day26\\initSteam\\genre_list.txt"));
		ArrayList<String> gnameList = new ArrayList<String>();
		String line = "";
		while ((line = br.readLine()) != null) {
			gnameList.add(line.trim());
		}
		br.close();
		
		String sql = "insert into genre values(?, ?)";

		for (int j = 0; j < gnameList.size(); j++) {
			if (j % 200 == 0) {
				close();
				getConnection();
			}
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, j + 1);
			psmt.setString(2, gnameList.get(j));

			
			int cnt = psmt.executeUpdate();
			if (cnt == 1) {
				String txt = "insert into genre values (" + 
						(j + 1) + ", '" + 
						gnameList.get(j) +
						"');\n";
				System.out.println(txt);
				pw.write(txt);
			}
		}
	}

	private void close() {
		try {
			if (psmt != null) psmt.close();
			if (conn != null) conn.close();
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
