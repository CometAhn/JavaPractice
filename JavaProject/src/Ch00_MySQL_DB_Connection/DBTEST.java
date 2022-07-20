package Ch00_MySQL_DB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class sqltest {
	void createdatabase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 데이터베이스명을 입력하세요. : ");
		String database = sc.next();

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String pw = "0000";

		String SQL = "create database " + database + ";";

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pw);

			pstmt = con.prepareStatement(SQL);

			int r = pstmt.executeUpdate();

			System.out.println(database + " 생성 완료 ");
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

	void createtable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용할 데이터베이스를 입력하세요 : ");
		String database = sc.next();
		System.out.println("생성할 테이블명을 입력하세요 : ");
		String table = sc.next();

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/" + database;
		String user = "root";
		String pw = "0000";

		String SQL = "create table " + table + "( id char(8), name char(8));";

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pw);

			pstmt = con.prepareStatement(SQL);

			int r = pstmt.executeUpdate();

			System.out.println(table + " 생성 완료 ");
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

	void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용할 데이터베이스를 입력하세요 : ");
		String database = sc.next();
		System.out.println("사용할 테이블명을 입력하세요 : ");
		String table = sc.next();

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/" + database;
		String user = "root";
		String pw = "0000";

		String SQL = "insert into " + table + " values('1', 'name2');";

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pw);

			pstmt = con.prepareStatement(SQL);

			int r = pstmt.executeUpdate();

			System.out.println("추가 완료");
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

	void select() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		String driver = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pw = "0000";

		String SQL = "select * from usertable;";

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pw);
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");

				System.out.printf("%s	%6s\n", id, name);
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

	void update() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용할 데이터베이스를 입력하세요 : ");
		String database = sc.next();
		System.out.println("사용할 테이블명을 입력하세요 : ");
		String table = sc.next();

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/" + database;
		String user = "root";
		String pw = "0000";

		String SQL = "update usertable set name = 'name3', id = 3 where id = 1;";

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pw);

			pstmt = con.prepareStatement(SQL);

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

	void deletetable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용할 데이터베이스를 입력하세요 : ");
		String database = sc.next();
		System.out.println("삭제할 테이블명을 입력하세요 : ");
		String table = sc.next();

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/" + database;
		String user = "root";
		String pw = "0000";

		String SQL = "drop table " + table + ";";

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pw);

			pstmt = con.prepareStatement(SQL);

			int r = pstmt.executeUpdate();

			System.out.println(table + " 삭제 완료 ");
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

	void deletedatabase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 데이터베이스를 입력하세요 : ");
		String database = sc.next();

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String pw = "0000";

		String SQL = "drop database " + database + ";";

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pw);

			pstmt = con.prepareStatement(SQL);

			int r = pstmt.executeUpdate();

			System.out.println(database + " 삭제 완료 ");
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

public class DBTEST {

	public static void main(String[] args) {
		sqltest sql = new sqltest();

		char retry = '0';

		Scanner sc1 = new Scanner(System.in);
		System.out.println("원하는 기능을 입력하세요 : ");
		System.out.println("1. 데이터베이스 생성.");
		System.out.println("2. 테이블 생성.");
		System.out.println("3. 테이블 데이터 삽입.");
		System.out.println("4. 테이블 데이터 조회.");
		System.out.println("5. 테이블 데이터 변경.");
		System.out.println("6. 테이블 삭제.");
		System.out.println("7. 데이터베이스 삭제.\n");

		while (true) {
			char input = sc1.next().charAt(0);

			if (input == '1') {
				sql.createdatabase();

				System.out.println("계속 하시겠습니까?(계속 : 1, 그만 : 0)");
				retry = sc1.next().charAt(0);

				if (retry == '1') {
					continue;
				} else {
					break;
				}
			}
			if (input == '2') {
				sql.createtable();

				System.out.println("계속 하시겠습니까?(계속 : 1, 그만 : 0)");
				retry = sc1.next().charAt(0);

				if (retry == '1') {
					continue;
				} else {
					break;
				}
			}
			if (input == '3') {
				sql.insert();

				System.out.println("계속 하시겠습니까?(계속 : 1, 그만 : 0)");
				retry = sc1.next().charAt(0);

				if (retry == '1') {
					continue;
				} else {
					break;
				}
			}
			if (input == '4') {
				sql.select();

				System.out.println("계속 하시겠습니까?(계속 : 1, 그만 : 0)");
				retry = sc1.next().charAt(0);

				if (retry == '1') {
					continue;
				} else {
					break;
				}
			}
			if (input == '5') {
				sql.update();

				System.out.println("계속 하시겠습니까?(계속 : 1, 그만 : 0)");
				retry = sc1.next().charAt(0);

				if (retry == '1') {
					continue;
				} else {
					break;
				}
			}
			if (input == '6') {
				sql.deletetable();

				System.out.println("계속 하시겠습니까?(계속 : 1, 그만 : 0)");
				retry = sc1.next().charAt(0);

				if (retry == '1') {
					continue;
				} else {
					break;
				}
			}
			if (input == '7') {
				sql.deletedatabase();

				System.out.println("계속 하시겠습니까?(계속 : 1, 그만 : 0)");
				retry = sc1.next().charAt(0);

				if (retry == '1') {
					continue;
				} else {
					break;
				}
			}
			System.out.println("종료합니다.");
		}

	}
}