package Ch00_MySQL_DB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSQL_Start {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		String driver = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/market_db";
		String user = "root";
		String pw = "0000";

		String SQL = "Select mem_id, mem_name, mem_number, addr from member";

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pw);
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			while (rs.next()) {
				String id = rs.getString("mem_id");
				String name = rs.getString("mem_name");
				int number = rs.getInt("mem_number");
				String addr = rs.getString("addr");

				System.out.printf("%s	%6s	%2s	%s\n", id, name, number, addr);
			}
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e.getMessage());
		} catch (ClassNotFoundException e1) {
			System.out.println("JDBC Connector Driver Error : " + e1.getMessage());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
