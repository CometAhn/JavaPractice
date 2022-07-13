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

		frame.pack();// 컨테이너 안에 들어간 컴포넌트의 크기에 맞추어 크기를 자동으로 조정.
		frame.setVisible(true);
	}

}
