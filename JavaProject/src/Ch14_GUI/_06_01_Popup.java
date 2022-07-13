/**
 * 	GUI 연습용 파일
 *  Popup 연습
 * 
 */
package Ch14_GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.monitor.MonitorSettingException;
import javax.swing.*;

class MenuActionListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		// 사용자가 Load 메뉴 아이템을 선택하는 경우 처리할 작업 구현
		JOptionPane.showMessageDialog(null, "팝업");

	}
}

public class _06_01_Popup extends JFrame {

	_06_01_Popup() {
		setTitle("Menu 만들어보기");
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}

	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("메뉴바 1");

		screenMenu.add(new JMenuItem("팝업"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("EXit"));

		mb.add(screenMenu);
		mb.add(new JMenu("편집"));
		mb.add(new JMenu("실행"));
		mb.add(new JMenu("도움말"));
		setJMenuBar(mb);

		JMenuItem item = new JMenuItem("팝업");
		item.addActionListener(new MenuActionListener());
		// 메뉴아이템에 Action 리스너 설정
		screenMenu.add(item);
		mb.add(item);

	}

	public static void main(String[] args) {
		new _06_01_Popup();

	}

}
