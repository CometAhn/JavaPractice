/**
 * 사칙 연산을 푸는 문제
 * 1. 문제 = 8+4
 * 2. 문제 = 8-4
 * 3. 문제 = 8*4
 * 4. 문제 - 8/4
 * 
 * 계산 버튼을 누르면 맞는지 아닌지 레이블로 표시
 * 맞았습니다. 틀렸습니다.(다음 문제로 넘어가면 레이블은 숨김.)
 * 
 */

package Ch14_GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;

public class _07_02_WindowBuilder_exam7 extends JFrame {
	private JTextField textValue;
	protected int i;

	public _07_02_WindowBuilder_exam7() {
		getContentPane().setFont(new Font("나눔고딕", Font.PLAIN, 12));
		int a = 8;
		int b = 4;
		int[] asnwer = { a + b, a - b, a * b, a / b, };
		String[] question = { a + " + " + b + " = ", a + " - " + b + " = ", a + " * " + b + " = ",
				a + " / " + b + " = " };

		setTitle("사칙연산");
		setSize(300, 135);

		getContentPane().setLayout(null);

		JLabel lblQuestion = new JLabel(question[0]);
		lblQuestion.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblQuestion.setBounds(64, 15, 42, 15);
		getContentPane().add(lblQuestion);

		textValue = new JTextField();
		textValue.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		textValue.setBounds(108, 12, 116, 21);
		getContentPane().add(textValue);
		textValue.setColumns(10);

		JButton btnCalc = new JButton("계산");
		btnCalc.setFont(new Font("나눔고딕", Font.PLAIN, 12));

		btnCalc.setBounds(27, 40, 97, 23);
		getContentPane().add(btnCalc);

		JButton btnNext = new JButton("다음 문제");
		btnNext.setFont(new Font("나눔고딕", Font.PLAIN, 12));

		btnNext.setBounds(136, 40, 97, 23);
		getContentPane().add(btnNext);

		JLabel lblComplete = new JLabel("");
		lblComplete.setHorizontalAlignment(SwingConstants.CENTER);
		lblComplete.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblComplete.setBounds(85, 75, 97, 15);
		getContentPane().add(lblComplete);
		btnNext.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				if (i != 3) {
					i++;
					lblQuestion.setText(question[i]);
					lblComplete.setText("");
					textValue.setText("");
				} else {
					i = 0;
					lblQuestion.setText(question[0]);
					lblComplete.setText("");
				}
			}
		});
		btnCalc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (asnwer[i] == Integer.parseInt(textValue.getText())) {

					lblComplete.setText("맞았습니다.");

				} else {
					lblComplete.setText("틀렸습니다.");
				}
			}
		});

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		_07_02_WindowBuilder_exam7 a = new _07_02_WindowBuilder_exam7();
	}
}
