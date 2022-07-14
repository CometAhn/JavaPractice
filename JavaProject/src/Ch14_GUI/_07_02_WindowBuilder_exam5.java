/**
 * 
 * 프레임 
 * 타이틀 : 3의 배수 확인
 * 사이즈 : ?,?
 * 
 * 레이블1 : 점수값을 입력하세요
 * 텍스트필드1 : 정수 입력 필드
 * 버튼1 : 이벤트 실행 레이블2 값 변경
 * 레이블2 : 텍스트필드1%3==0, 3의 배수입니다 else 아닙니다.
 */

package Ch14_GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class _07_02_WindowBuilder_exam5 extends JFrame {
	private JTextField tfnum;

	public _07_02_WindowBuilder_exam5() {
		getContentPane().setFont(new Font("나눔고딕", Font.PLAIN, 12));
		setTitle("3의 배수 확인");
		setSize(250, 120);
		getContentPane().setLayout(null);

		JLabel lbl1 = new JLabel("정수 값을 입력하세요");
		lbl1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lbl1.setBounds(12, 22, 130, 15);
		getContentPane().add(lbl1);

		tfnum = new JTextField();
		tfnum.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		tfnum.setBounds(133, 19, 89, 21);
		getContentPane().add(tfnum);
		tfnum.setColumns(10);

		JButton btnOk = new JButton("검사");

		btnOk.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		btnOk.setBounds(12, 47, 57, 23);
		getContentPane().add(btnOk);

		JLabel lblOutput = new JLabel("");
		lblOutput.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblOutput.setBounds(81, 50, 137, 15);
		getContentPane().add(lblOutput);

		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a = Integer.parseInt(tfnum.getText());
				if (a % 3 == 0) {
					lblOutput.setText("3의 배수입니다.");
				} else {
					lblOutput.setText("3의 배수가 아닙니다.");

				}
			}
		});

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		_07_02_WindowBuilder_exam5 a = new _07_02_WindowBuilder_exam5();
	}

}
