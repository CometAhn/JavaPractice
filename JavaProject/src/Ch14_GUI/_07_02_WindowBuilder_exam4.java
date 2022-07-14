/**
 * 
 * 프레임 
 * 타이틀 : 바탕색 선택
 * 사이즈 : 240,100
 * 
 * 라디오체크 버튼 세 개(그룹)
 * 이벤트 : 클릭 시 프레임 색 변경
 */
package Ch14_GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class _07_02_WindowBuilder_exam4 extends JFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public _07_02_WindowBuilder_exam4() {
		getContentPane().setFont(new Font("나눔고딕", Font.PLAIN, 12));
		setTitle("바탕색 선택");
		setSize(240, 100);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 224, 62);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("화면의 바탕색을 선택하세요!");
		lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblNewLabel.setBounds(32, 9, 156, 15);
		panel.add(lblNewLabel);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("노랑");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setBackground(Color.YELLOW);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(32, 30, 49, 23);
		panel.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("파랑");
		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setBackground(Color.blue);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(85, 30, 49, 23);
		panel.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("빨강");
		rdbtnNewRadioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setBackground(Color.red);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBounds(138, 30, 49, 23);
		panel.add(rdbtnNewRadioButton_2);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		_07_02_WindowBuilder_exam4 a = new _07_02_WindowBuilder_exam4();

	}

}
