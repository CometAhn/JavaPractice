package Ch14_GUI;

import java.awt.FlowLayout;

import javax.swing.JFrame;

class AddFrame extends JFrame {
	public AddFrame() {
		setTitle("Title");
		setSize(300, 300);
		setVisible(true);

		this.setLayout(new FlowLayout());

		// x 버튼 클릭 시 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class _01_Swing_Frame {

	public static void main(String[] args) {
		AddFrame a = new AddFrame();
	}

}
