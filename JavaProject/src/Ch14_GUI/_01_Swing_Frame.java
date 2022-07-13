package Ch14_GUI;

import java.awt.FlowLayout;

import javax.swing.*;

class AddFrame extends JFrame {
	public AddFrame() {
		setTitle("Title");
		setSize(300, 300);

		// 컴포넌트 객체 생성
		JButton button = new JButton("Button");
		JCheckBox box = new JCheckBox("체크박스");
		JSlider slide = new JSlider();
		JTextField tf = new JTextField("Text입력", 20);
		this.setLayout(new FlowLayout());

		// 컴포넌트 객체 추가.
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		setVisible(true);

		// x 버튼 클릭 시 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class _01_Swing_Frame {

	public static void main(String[] args) {
		AddFrame a = new AddFrame();
	}

}
