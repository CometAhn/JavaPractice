/**
 * 	GUI 연습용 파일
 *  GriedLayout 연습
 * 
 */
package Ch14_GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _03_3_GridLayout_test {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Container cont = frame.getContentPane();

		cont.setLayout(new GridLayout(2, 3));

		cont.add(new JButton("white"));
		cont.add(new JButton("green"));
		cont.add(new JButton("red"));
		cont.add(new JButton("yello"));
		cont.add(new JButton("black"));

		frame.pack();
		frame.setVisible(true);
	}

}
