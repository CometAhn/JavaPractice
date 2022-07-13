package Ch14_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * GUI 연습용 파일 Mouse Event 연습
 * 
 */
public class _04_02_Mouse_Event extends JFrame {
	JPanel Jp = new JPanel();
	JLabel la;

	_04_02_Mouse_Event() {
		setTitle("Mouse 이벤트 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(Jp);
		Jp.addMouseListener(new MouseListener1());
		Jp.addMouseMotionListener(new MouseListener1());
		la = new JLabel("마우스를 이 위에 올려보세요.");
		Jp.add(la);
		setSize(300, 300);
		setVisible(true);
	}

	class MouseListener1 implements MouseListener, MouseMotionListener {

		public void mousePressed(MouseEvent e) { // 마우스를 누르고 있을 때

		}

		public void mouseReleased(MouseEvent e) { // 행동을 취하지 않을 때

		}

		public void mouseClicked(MouseEvent e) { // 클릭할 때
			la.setText("마우스클릭 횟수 : " + e.getClickCount());
		}

		public void mouseEntered(MouseEvent e) { // 커서가 컴포넌트 위에 올라와 있을 때
			JPanel p = (JPanel) e.getSource();
			p.setBackground(Color.red);
		}

		public void mouseExited(MouseEvent e) { // 커서가 컴포넌트를 벗어날 때
			JPanel p = (JPanel) e.getSource();
			p.setBackground(Color.yellow);
		}

		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged (" + e.getX() + ", " + e.getY() + ")");
		}

		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved (" + e.getX() + ", " + e.getY() + ")");
		}

	}

	public static void main(String[] args) {
		new _04_02_Mouse_Event();
	}

}
