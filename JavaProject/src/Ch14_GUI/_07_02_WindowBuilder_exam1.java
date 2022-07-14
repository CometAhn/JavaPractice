/**
 * 버튼 클릭 시 레이블 텍스트 값을 바꾸는 예제.
 * 
 */

package Ch14_GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class _07_02_WindowBuilder_exam1 extends JFrame {
	public _07_02_WindowBuilder_exam1() {
		getContentPane().setFont(new Font("나눔고딕", Font.PLAIN, 12));
		setTitle("단추시험");
		setSize(190, 90);
		getContentPane().setLayout(null);

		JButton btnOK = new JButton("확인");
		btnOK.setFont(new Font("나눔고딕", Font.PLAIN, 12));

		btnOK.setBounds(20, 5, 60, 23);
		getContentPane().add(btnOK);

		JButton btnCancel = new JButton("취소");
		btnCancel.setFont(new Font("나눔고딕", Font.PLAIN, 12));

		btnCancel.setBounds(95, 5, 60, 23);
		getContentPane().add(btnCancel);

		JLabel lblOutput = new JLabel("New label");
		lblOutput.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(23, 27, 132, 25);
		getContentPane().add(lblOutput);

		btnOK.addMouseListener(new MouseAdapter() { // 확인 버튼 클릭 시
			@Override
			public void mouseClicked(MouseEvent e) {
				lblOutput.setText("확인 버튼이 눌러졌습니다.");
			}
		});
		btnCancel.addMouseListener(new MouseAdapter() { // 취소 버튼 클릭 시
			@Override
			public void mouseClicked(MouseEvent e) {
				lblOutput.setText("취소 버튼이 눌러졌습니다.");
			}
		});
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		_07_02_WindowBuilder_exam1 a = new _07_02_WindowBuilder_exam1();
	}
}
