/**
 * 정기예금의 월이자(단리)를 계산하는 GUI 프로그램 설계
 * 프레임 
 * 타이틀 : 3의 배수 확인
 * 사이즈 : ?,?
 * 
 * 레이블1 : 원금
 * 텍스트필드1 : 100000000
 * 레이블2 : 연이율
 * 텍스트필드2 : 0.06
 * 레이블3 : 월이자 = 
 * 버튼1 : 확인, 이벤트 실행 레이블4 값 변경, 원금 * 연이율 / 12
 * 레이블4 : 값 나타남
 */
package Ch14_GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class _07_02_WindowBuilder_exam6 extends JFrame {
	private JTextField TFprincipal;
	private JTextField TFinterest;

	public _07_02_WindowBuilder_exam6() {
		getContentPane().setFont(new Font("나눔고딕", Font.PLAIN, 12));
		setTitle("이자 구하기");
		setSize(185, 174);

		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("원금");
		lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblNewLabel.setBounds(12, 31, 22, 15);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("연이율");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(12, 56, 57, 15);
		getContentPane().add(lblNewLabel_1);

		TFprincipal = new JTextField();
		TFprincipal.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		TFprincipal.setBounds(46, 28, 116, 21);
		getContentPane().add(TFprincipal);
		TFprincipal.setColumns(10);

		TFinterest = new JTextField();
		TFinterest.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		TFinterest.setBounds(46, 53, 116, 21);
		getContentPane().add(TFinterest);
		TFinterest.setColumns(10);

		JButton btnOk = new JButton("확인");
		btnOk.setFont(new Font("나눔고딕", Font.PLAIN, 12));

		btnOk.setBounds(32, 103, 97, 23);
		getContentPane().add(btnOk);

		JLabel lbloutput = new JLabel("");
		lbloutput.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lbloutput.setBounds(76, 84, 57, 15);
		getContentPane().add(lbloutput);

		JLabel lblNewLabel_2 = new JLabel("월이자 : ");
		lblNewLabel_2.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(32, 84, 57, 15);
		getContentPane().add(lblNewLabel_2);

		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a = (int) (Integer.parseInt(TFprincipal.getText()) * Double.parseDouble(TFinterest.getText()) / 12);
				String b = Integer.toString(a);

				lbloutput.setText(b);

			}
		});
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		_07_02_WindowBuilder_exam6 a = new _07_02_WindowBuilder_exam6();
	}

}
