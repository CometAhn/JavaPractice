/**
 * 	GUI 연습용 파일
 *  Menu 연습
 * 
 */
package Ch14_GUI;

import javax.swing.*;

public class _05_01_Menu extends JFrame {
	_05_01_Menu() {
		setTitle("Menu 만들어보기");
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}

	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("메뉴바 1");

		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("EXit"));

		mb.add(screenMenu);
		mb.add(new JMenu("편집"));
		mb.add(new JMenu("실행"));
		mb.add(new JMenu("도움말"));
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new _05_01_Menu();
	}

}
