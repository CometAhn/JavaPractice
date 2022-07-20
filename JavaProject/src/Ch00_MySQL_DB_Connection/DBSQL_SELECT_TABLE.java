
/**
 *  조회된 데이터 테이블로 만들기.
 *  
 *  Jtable이나 JtextPane을 이용해서 만들어 보자.
 *  일단 오늘은 여기까지.
 */
package Ch00_MySQL_DB_Connection;

import javax.swing.*;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;

class sqldb {
}

public class DBSQL_SELECT_TABLE extends JFrame {
	private JTextField memid1;
	private JTextField memname1;
	private JTextField memnumber1;
	private JTextField addr1;
	private String iid[] = new String[100];
	private String iname[] = new String[100];
	private String inumber[] = new String[100];
	private String iaddr[] = new String[100];
	private JTextField memid2;
	private JTextField memname2;
	private JTextField memnumber2;
	private JTextField addr2;
	private JTextField memid3;
	private JTextField memname3;
	private JTextField memnumber3;
	private JTextField addr3;
	private JTextField memid4;
	private JTextField memname4;
	private JTextField memnumber4;
	private JTextField addr4;
	private int j = 0;
	private JTable table;

	void sqldb() {
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

			int i = 0;
			while (rs.next()) {
				String[] id = new String[100];
				String[] name = new String[100];
				int[] number = new int[100];
				String[] addr = new String[100];
				id[i] = rs.getString("mem_id");
				name[i] = rs.getString("mem_name");
				number[i] = rs.getInt("mem_number");
				addr[i] = rs.getString("addr");
				iid[i] = id[i];
				iname[i] = name[i];
				inumber[i] = Integer.toString(number[i]);
				iaddr[i] = addr[i];

				// System.out.printf("%s %6s %2s %s\n", id, name, number, addr);
				i++;
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

	public DBSQL_SELECT_TABLE() {
		sqldb();
		getContentPane().setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
		setSize(550, 252);
		setTitle("대충 표");
		/*
				getContentPane().setLayout(null);
		
				memid1 = new JTextField();
				memid1.setHorizontalAlignment(SwingConstants.CENTER);
				memid1.setText(iid[0]);
				memid1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				memid1.setBounds(12, 57, 116, 21);
				getContentPane().add(memid1);
				memid1.setColumns(10);
		
				memname1 = new JTextField();
				memname1.setHorizontalAlignment(SwingConstants.CENTER);
				memname1.setText(iname[0]);
				memname1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				memname1.setBounds(142, 57, 116, 21);
				getContentPane().add(memname1);
				memname1.setColumns(10);
		
				memnumber1 = new JTextField();
				memnumber1.setHorizontalAlignment(SwingConstants.CENTER);
				memnumber1.setText(inumber[0]);
				memnumber1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				memnumber1.setBounds(270, 57, 116, 21);
				getContentPane().add(memnumber1);
				memnumber1.setColumns(10);
		
				addr1 = new JTextField();
				addr1.setHorizontalAlignment(SwingConstants.CENTER);
				addr1.setText(iaddr[0]);
				addr1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				addr1.setBounds(398, 57, 116, 21);
				getContentPane().add(addr1);
				addr1.setColumns(10);
		
				memid2 = new JTextField();
				memid2.setText(iid[1]);
				memid2.setHorizontalAlignment(SwingConstants.CENTER);
				memid2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				memid2.setColumns(10);
				memid2.setBounds(12, 88, 116, 21);
				getContentPane().add(memid2);
		
				memname2 = new JTextField();
				memname2.setText(iname[1]);
				memname2.setHorizontalAlignment(SwingConstants.CENTER);
				memname2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				memname2.setColumns(10);
				memname2.setBounds(142, 88, 116, 21);
				getContentPane().add(memname2);
		
				memnumber2 = new JTextField();
				memnumber2.setText(inumber[1]);
				memnumber2.setHorizontalAlignment(SwingConstants.CENTER);
				memnumber2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				memnumber2.setColumns(10);
				memnumber2.setBounds(270, 88, 116, 21);
				getContentPane().add(memnumber2);
		
				addr2 = new JTextField();
				addr2.setText(iaddr[1]);
				addr2.setHorizontalAlignment(SwingConstants.CENTER);
				addr2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				addr2.setColumns(10);
				addr2.setBounds(398, 88, 116, 21);
				getContentPane().add(addr2);
		
				memid3 = new JTextField();
				memid3.setText(iid[2]);
				memid3.setHorizontalAlignment(SwingConstants.CENTER);
				memid3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				memid3.setColumns(10);
				memid3.setBounds(12, 119, 116, 21);
				getContentPane().add(memid3);
		
				memname3 = new JTextField();
				memname3.setText(iname[2]);
				memname3.setHorizontalAlignment(SwingConstants.CENTER);
				memname3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				memname3.setColumns(10);
				memname3.setBounds(142, 119, 116, 21);
				getContentPane().add(memname3);
		
				memnumber3 = new JTextField();
				memnumber3.setText(inumber[2]);
				memnumber3.setHorizontalAlignment(SwingConstants.CENTER);
				memnumber3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				memnumber3.setColumns(10);
				memnumber3.setBounds(270, 119, 116, 21);
				getContentPane().add(memnumber3);
		
				addr3 = new JTextField();
				addr3.setText(iaddr[2]);
				addr3.setHorizontalAlignment(SwingConstants.CENTER);
				addr3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				addr3.setColumns(10);
				addr3.setBounds(398, 119, 116, 21);
				getContentPane().add(addr3);
		
				memid4 = new JTextField();
				memid4.setText(iid[3]);
				memid4.setHorizontalAlignment(SwingConstants.CENTER);
				memid4.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				memid4.setColumns(10);
				memid4.setBounds(12, 150, 116, 21);
				getContentPane().add(memid4);
		
				memname4 = new JTextField();
				memname4.setText(iname[3]);
				memname4.setHorizontalAlignment(SwingConstants.CENTER);
				memname4.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				memname4.setColumns(10);
				memname4.setBounds(142, 150, 116, 21);
				getContentPane().add(memname4);
		
				memnumber4 = new JTextField();
				memnumber4.setText(inumber[3]);
				memnumber4.setHorizontalAlignment(SwingConstants.CENTER);
				memnumber4.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				memnumber4.setColumns(10);
				memnumber4.setBounds(270, 150, 116, 21);
				getContentPane().add(memnumber4);
		
				addr4 = new JTextField();
				addr4.setText(iaddr[3]);
				addr4.setHorizontalAlignment(SwingConstants.CENTER);
				addr4.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 12));
				addr4.setColumns(10);
				addr4.setBounds(398, 150, 116, 21);
				getContentPane().add(addr4);
		*/
		getContentPane().setLayout(null);
		JButton btnNext = new JButton("다음");

		btnNext.setBounds(330, 164, 97, 23);
		getContentPane().add(btnNext);

		JButton BtnPre = new JButton("이전");
		BtnPre.setBounds(72, 158, 97, 23);
		getContentPane().add(BtnPre);

		table = new JTable();
		table.setBounds(65, 10, 397, 144);
		getContentPane().add(table);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		DBSQL_SELECT_TABLE a = new DBSQL_SELECT_TABLE();

	}
}
