/**
 * 	GUI 연습용 파일
 * JFrame 연습
 * 
 */

package Ch14_GUI;

import java.awt.FlowLayout;

import javax.swing.*;

class AddFrame extends JFrame {
	public AddFrame() {
		setTitle("Title"); // 타이틀 이름
		setSize(300, 300); // 프레임 사이즈
		setLocation(50, 50); // 창을 좌측 상단으로부터 x, y 만큼 띄운다.

		// 컴포넌트 객체 생성
		JButton button = new JButton("Button"); // Button이라는 이름의 버튼
		JCheckBox box = new JCheckBox("체크박스"); // 체크박스라는 이름의 체크박스
		JSlider slide = new JSlider(); // slide라는 이름의 슬라이드
		JTextField tf = new JTextField("Text입력", 20); // tf라는 text입력이 입력된 길이 20의 텍스트 필드
		this.setLayout(new FlowLayout()); // 컴포넌트 보이게. 없을 경우 text필드는 필드는 안 보이고 텍스트만 보임.

		// 컴포넌트 객체 추가.
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		setVisible(true); // 없을 시 프레임이 안 보임.

		// x 버튼 클릭 시 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class _01_Swing_Frame {

	public static void main(String[] args) {
		AddFrame a = new AddFrame();
	}

}
