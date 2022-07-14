/**
 * 
 * 프레임 
 * 타이틀 : 바탕색 바꾸기
 * 사이즈 : 240,100
 * 
 * 버튼 세 개, 적색 흰색 남색.
 * 이벤트 : 클릭 시 프레임 색 변경
 */

package Ch14_GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JPanel;

public class _07_02_WindowBuilder_exam3 extends JFrame {
	public _07_02_WindowBuilder_exam3() {
		setBackground(new Color(102, 102, 0));
		setType(Type.POPUP);
		getContentPane().setFont(new Font("나눔고딕", Font.PLAIN, 12));
		getContentPane().setForeground(new Color(153, 0, 51));
		setTitle("바탕색 바꾸기");
		setSize(240, 100);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 224, 58);
		getContentPane().add(panel);

		JButton btnRed = new JButton("적색");
		panel.add(btnRed);

		btnRed.setFont(new Font("나눔고딕", Font.PLAIN, 12));

		JButton btnWhite = new JButton("흰색");

		btnWhite.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		panel.add(btnWhite);

		JButton btnNewButton = new JButton("남색");

		btnNewButton.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		panel.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("바탕색을 바꾸기 위해 단추를 누르세요.");
		lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblNewLabel.setEnabled(true);
		panel.add(lblNewLabel);
		btnRed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setBackground(new Color(255, 0, 0));
				lblNewLabel.setVisible(false);
			}
		});
		btnWhite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setBackground(new Color(255, 255, 255));
				lblNewLabel.setVisible(false);
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setBackground(new Color(100, 50, 255));
				lblNewLabel.setVisible(false);
			}
		});
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		_07_02_WindowBuilder_exam3 a = new _07_02_WindowBuilder_exam3();
	}
}
