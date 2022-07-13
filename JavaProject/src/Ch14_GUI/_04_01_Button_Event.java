package Ch14_GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;

class Listener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		JButton button1 = (JButton) e.getSource();
		button.setText("버튼을 클릭하셨습니다.");
		button1.setText("버튼을 클릭하셨습니다.");
	}

}

class AddFrame2 extends JFrame {
	public AddFrame2() {
		setTitle("JFrame");
		setSize(300, 300);

		JButton button = new JButton("Button");
		JButton button1 = new JButton("Button");
		button.addActionListener(new Listener1()); // 액션 불러옴
		JCheckBox box = new JCheckBox("체크박스");
		JSlider slide = new JSlider();
		JTextField tf = new JTextField("Text입력", 20);
		this.setLayout(new FlowLayout());

		this.add(button);
		this.add(button1);
		this.add(box);
		this.add(slide);
		this.add(tf);
		setVisible(true);

		// swing에만있는 x버튼 클릭 시 종료
	}

}

public class _04_01_Button_Event {

	public static void main(String[] args) {
		AddFrame2 a = new AddFrame2();
	}

}
