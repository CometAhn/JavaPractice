/**
 *  GUI 연습용 파일
 *  JPanel 연습.
 *  
 */

package Ch14_GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class _02_Panel extends JFrame {

	public _02_Panel() {
		setTitle("test");
		setSize(20, 400);
		setLocation(800, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JLabel prompt = new JLabel("이름을 입력하세요");
		JButton ok = new JButton("확인");
		JButton cancel = new JButton("취소");
		JCheckBox hold = new JCheckBox("글자가");
		JCheckBox italic = new JCheckBox("안보여");
		JRadioButton radio1 = new JRadioButton("1학년");
		JRadioButton radio2 = new JRadioButton("2학년");
		JRadioButton radio3 = new JRadioButton("3학년");
		JRadioButton radio4 = new JRadioButton("4학년");
		String[] pet = { "개", "고양이", "새", "토끼" };
		JComboBox petlist = new JComboBox(pet);
		petlist.setSelectedIndex(1);

		/**
		 * String으로 배열을 만든 후 배열을 JComboBox에 넣는다.
		 * 
		 * String[] pet = { "개", "고양이", "새", "토끼" };
		 * 
		 * JComboBox petlist = new JComboBox(pet);
		 * 
		 * petlist.SetSelectedIndex(배열번호);로 기본 설정을 변경한다.
		 */

		radio4.setSelected(true); // 실행 시 체크true

		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		group.add(radio4);

		/**
		 * RadioBox는 그룹으로 묶는다.
		 * 
		 * ButtonGroup group = new ButtonGroup();
		 * 
		 * add로 버튼을 추가한다. group.add(radio1); group.add(radio2);
		 * 
		 */
		this.setLayout(new FlowLayout(FlowLayout.CENTER));

		this.add(prompt);
		this.add(ok);
		this.add(cancel);
		add(hold);
		add(italic);
		add(radio1);
		add(radio2);
		add(radio3);
		add(radio4);
		add(petlist);

	}

	public static void main(String[] args) {

		_02_Panel myframe = new _02_Panel();
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
