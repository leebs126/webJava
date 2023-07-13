package sec01.ex04;

import javax.swing.*;
import java.awt.*;

public class JMenuTest extends JFrame {
	JFrame frame;
	JMenuBar menuBar;
	JMenu carMenu, memberMenu, rentMenu, helpMenu;
	JMenuItem carMenu11, carMenu12, carMenu13, carMenu14;
	JMenuItem memMenu21, memMenu22, memMenu23, memMenu24;
	JMenuItem helpMenu41;
	JPanel jPanel;
	JLabel lCarName;
	JTextField tf;
	JButton searchBtn;

	public JMenuTest() {
		frame = new JFrame("렌터카 예약 시스템");
		menuBar = new JMenuBar();
		carMenu = new JMenu("차량 관리");
		memberMenu = new JMenu("회원관리");
		rentMenu = new JMenu("예약관리");
		helpMenu = new JMenu("도움말");
	}

	public void createFrame() {
		frame.setJMenuBar(menuBar);
		menuBar.add(carMenu);
		carMenu.add(carMenu11 = new JMenuItem("챠량등록"));
		carMenu.add(carMenu12 = new JMenuItem("차량조회"));
		carMenu.addSeparator(); // 분리선 설정하기
		carMenu.add(carMenu13 = new JMenuItem("차량수정"));
		carMenu.add(carMenu14 = new JMenuItem("차량삭제"));
		menuBar.add(memberMenu);
		memberMenu.add(memMenu21 = new JMenuItem("회원등록"));
		memberMenu.add(memMenu22 = new JMenuItem("회원조회"));
		memberMenu.addSeparator();
		memberMenu.add(memMenu23 = new JMenuItem("회원수정"));
		memberMenu.add(memMenu24 = new JMenuItem("회원삭제"));
		menuBar.add(helpMenu);
		helpMenu.add(helpMenu41 = new JMenuItem("버전"));
		jPanel = new JPanel();
		lCarName = new JLabel("차량명");
		tf = new JTextField(10);
		searchBtn = new JButton("차량 조회하기");
		jPanel.add(lCarName);

		jPanel.add(tf);
		jPanel.add(searchBtn);
		Container con = frame.getContentPane();
		con.add(jPanel, BorderLayout.NORTH);
		
		frame.setLocation(200, 100);
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		JMenuTest test = new JMenuTest();
		test.createFrame();

	}

}
