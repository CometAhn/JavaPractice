/**
 *  GUI 연습용 파일
 *  JPanel 연습.
 *  
 */

package Ch14_GUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_Swing_Frame extends JFrame {

	public _02_Swing_Frame() {
		setTitle("test");
		setSize(600, 300);
		setLocation(800, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JLabel prompt = new JLabel("이름을 입력하세요");
		this.add(prompt);
	}

	public static void main(String[] args) {

		_02_Swing_Frame myframe = new _02_Swing_Frame();
		myframe.setVisible(true);

		JFrame frame = new JFrame();

		JPanel panel = new JPanel();

		panel.setBackground(Color.green);

		panel.setPreferredSize(new Dimension(200, 200));

		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}

}
