/**
 * 1. JDBC Driver Class 로딩
 * - MySQL의 JDBC Driver Class를 로딩한다.
 * - Class.forName(driver);를 이용해서 Driver Class를 로딩하면객체가 생성되고, DriverManager에 등록된다.
 * - Driver 클래스를 찾지 못할 경우, ClassNotFoundException 예외가 발생한다.
 * 
 * 2. Connection 생성
 * - Connection : 데이터 베이스와 연결하는 개체
 * - DriverManager.getConnection(연결문자열, DB_ID, DB_PW)으로 Connection 객체를 생성한다.
 * - 연결문자열(Connection String) : "jdbc:Driver 종류 : // IP:포트번호/DB명"
 * - DB_ID : MySQL 아이디
 * = DB_PW : MySQL 비밀번호
 * 
 * 2.1 DriverManager 클래스
 * - DriverManager 클래스는 JDBC 드라이버를 통하여 Connection을 만드는 역할
 * - DriverManager는 Class.ForName() 메소드를 통해서 생성된다.
 */
package Ch00_MySQL_DB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

class connect {

	public void connect(String iip, String iport, String idbname, String iuser, String ipw) {
		String ip = iip;
		String port = iport;
		String dbname = idbname;
		String user = iuser;
		String pw = ipw;
		// 데이터베이스 연결하는 객체
		Connection con = null;

		// jdbc 드라이버 호출
		String driver = "com.mysql.cj.jdbc.Driver";

		// database에 연결하기 위한 정보
		String url = "jdbc:mysql://" + ip + ":" + port + "/" + dbname;

		try {
			// 1. JDBC 드라이버 로딩
			Class.forName(driver);
			// 2. Connection 생성
			con = DriverManager.getConnection(url, user, pw);

			System.out.println("데이터베이스 연결 성공!");
		} catch (SQLException e) {
			System.out.println("SQL ERROR : " + e.getMessage());

		} catch (ClassNotFoundException e1) {
			System.out.println("JDBC Connector Driver Error : " + e1.getMessage());
		} finally {
			// Connection 사용후 Close
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class DBConnect_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("접속할 IP 주소 : ");
		String iip = sc.next();
		System.out.print("접속할 포트 번호 : ");
		String iport = sc.next();
		System.out.print("접속할 DB명 : ");
		String idbname = sc.next();
		System.out.print("접속할 아이디 : ");
		String iuser = sc.next();
		System.out.print("접속할 비밀번호 : ");
		String ipw = sc.next();

		connect a = new connect();

		a.connect(iip, iport, idbname, iuser, ipw);
	}

}
