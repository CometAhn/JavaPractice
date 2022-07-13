/**
 * 	GUI 연습용 파일
 *  BorderLayout 연습
 * 
 */

package Ch14_GUI;

import javax.swing.*;
import java.awt.*;

public class _03_2_BordLayout_test {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		Container cont = frame.getContentPane();

		cont.setLayout(new BorderLayout());

		cont.add(new JButton("white"), BorderLayout.SOUTH);
		cont.add(new JButton("green"), BorderLayout.WEST);
		cont.add(new JButton("red"), BorderLayout.EAST);
		cont.add(new JButton("yello"), BorderLayout.NORTH);
		cont.add(new JButton("black"), BorderLayout.CENTER);

		frame.pack();
		frame.setVisible(true);
	}

}
