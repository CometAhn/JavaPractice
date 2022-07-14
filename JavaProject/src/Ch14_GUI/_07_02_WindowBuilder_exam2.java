/**
 * 텍스트에 입력한 값을 enter 이벤트 시 달러로 변경해서 알려주는 예제.
 * 변수 : money(환전 금액 입력 - 최대 10자의 문자열을 입력), inputLAbel, outputLabel, resultLabel(환전금액 표시)
 * 1$ = 1200Won
 * 
 * 오류 기록 : NumberFormatExcetion
 * Money 기본값이 ' '로 지정되어있어 int값 변환 오류.
 * 잘 확인하자.
 */
package Ch14_GUI;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class _07_02_WindowBuilder_exam2 extends JFrame {
	private JTextField money;

	public _07_02_WindowBuilder_exam2() {
		getContentPane().setFont(new Font("나눔고딕", Font.PLAIN, 12));
		setType(Type.POPUP);
		setTitle("환전기");
		setSize(450, 90);

		getContentPane().setLayout(null);

		money = new JTextField();
		money.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		money.setBounds(219, 7, 192, 21);
		getContentPane().add(money);
		money.setColumns(10);

		JLabel iniputLabel = new JLabel("환전금액(원화)를 입력하세요 : ");
		iniputLabel.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		iniputLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		iniputLabel.setBounds(30, 10, 190, 15);
		getContentPane().add(iniputLabel);

		JLabel outputLabel = new JLabel("환전받을 금액(달러화) : $");
		outputLabel.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		outputLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		outputLabel.setBounds(95, 30, 148, 15);
		getContentPane().add(outputLabel);

		JLabel resultLabel = new JLabel("");
		resultLabel.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		resultLabel.setBounds(245, 30, 184, 15);
		getContentPane().add(resultLabel);

		money.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();

				if (key == KeyEvent.VK_ENTER) {
					try {
						String str = money.getText().replace(" ", "");
						if (Integer.parseInt(str) >= 1200) {
							int a = Integer.parseInt(str) / 1200;
							String b = Integer.toString(a);
							resultLabel.setText(b);
							resultLabel.setForeground(Color.black);
						} else {
							resultLabel.setForeground(Color.red);
							resultLabel.setText("1200이상 입력하세요.(Error)");
						}
					} catch (Exception ea) {
						ea.printStackTrace();
					} finally {
					}

				}
			}
		});

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		_07_02_WindowBuilder_exam2 a = new _07_02_WindowBuilder_exam2();
	}
}
