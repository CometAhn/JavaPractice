package Ch00_MySQL_DB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement; // 파라미터를 이용한 데이터 전달

public class DBSQL_INSERT {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/market_db";
		String user = "root";
		String pw = "0000";

		String SQL = "insert into hongong1(toy_id, toy_name, age) values(?, ?, ?)";

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pw);

			pstmt = con.prepareStatement(SQL);

			pstmt.setInt(1, 4);
			pstmt.setString(2, "루이");
			pstmt.setInt(3, 30);

			int r = pstmt.executeUpdate();

			System.out.println("변경된 row : " + r);
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e.getMessage());
		} catch (ClassNotFoundException e1) {
			System.out.println("JDBC Connector Driver Error : " + e1.getMessage());
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
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
