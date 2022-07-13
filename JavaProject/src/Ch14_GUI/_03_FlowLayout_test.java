/**
 * 	GUI 연습용 파일
 *  FlowLaout 연습
 * 
 */

package Ch14_GUI;

import java.awt.*;
import javax.swing.*;

public class _03_FlowLayout_test {

	public static void main(String[] args) {

		JFrame frame = new JFrame();

		Container cont = frame.getContentPane();

		cont.setLayout(new FlowLayout());

		cont.add(new JButton("white"));
		cont.add(new JButton("green"));
		cont.add(new JButton("red"));
		cont.add(new JButton("yello"));
		cont.add(new JButton("black"));

		frame.pack();
		frame.setVisible(true);
	}

}
