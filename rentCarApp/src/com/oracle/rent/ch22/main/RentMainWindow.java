package com.oracle.rent.ch22.main;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.oracle.rent.ch22.car.Car;
import com.oracle.rent.ch22.car.CarImpl;
import com.oracle.rent.ch22.car.RegCarDialog;
import com.oracle.rent.ch22.car.SearchCarDialog;
import com.oracle.rent.ch22.member.Member;
import com.oracle.rent.ch22.member.MemberException;
import com.oracle.rent.ch22.member.MemberImpl;
import com.oracle.rent.ch22.member.RegMemDialog;
import com.oracle.rent.ch22.member.SearchMemDialog;
import com.oracle.rent.ch22.res.Reserve;


public class RentMainWindow extends JFrame {
	JFrame frame;
	JMenuBar menuBar;
	JMenu carMenu, memberMenu, resMenu, helpMenu; // 메인 메뉴 항목
	// 서브 메뉴 항목
	JMenuItem carMenu11, carMenu12, carMenu13, carMenu14;
	JMenuItem memMenu21, memMenu22, memMenu23, memMenu24;
	JMenuItem resMenu31, resMenu32, resMenu33, resMenu34;
	JMenuItem helpMenu41;
	JPanel jPanel;
	JLabel lCarName;
	JTextField tf;
	JButton btnSearch;
	JComboBox comboBox;  //검색 조건 설정 콤포박스
	
	Member memberController;
	Car carController;
	Reserve resController;
	

	public RentMainWindow() {
		frame = new JFrame("렌트카 조회/예약 시스템");
		menuBar = new JMenuBar();
		// 메인 메뉴 항목 객체 생성
		carMenu = new JMenu("차량 관리");
		memberMenu = new JMenu("회원관리");
		resMenu = new JMenu("예약관리");
		helpMenu = new JMenu("도움말");
	}

	// 서브메뉴 생성 메소드
	protected void startFrame() throws MemberException, IOException {
		frame.setJMenuBar(menuBar); // Frame에 메뉴바를 단다.
		menuBar.add(memberMenu); // 메뉴바에 "회원관리"항목을 단다.
		// 회원 관리 메뉴 관련 서브 메뉴 항목
		memberMenu.add(memMenu21 = new JMenuItem("회원등록"));
		memberMenu.add(memMenu22 = new JMenuItem("회원조회"));
		memberMenu.addSeparator(); // 분리선 설정하기
		memberMenu.add(memMenu23 = new JMenuItem("회원수정"));
		memberMenu.add(memMenu24 = new JMenuItem("회원삭제"));
		
		menuBar.add(carMenu); // 메뉴바에 "파일"항목을 단다.
		// 파일 메뉴 관련 서브 메뉴 항목
		carMenu.add(carMenu11 = new JMenuItem("챠량등록"));
		carMenu.add(carMenu12 = new JMenuItem("차량조회"));
		carMenu.addSeparator(); // 분리선 설정하기
		carMenu.add(carMenu13 = new JMenuItem("차량수정"));
		carMenu.add(carMenu14 = new JMenuItem("차량삭제"));
		
		menuBar.add(resMenu); // 메뉴바에 "파일"항목을 단다.
		// 파일 메뉴 관련 서브 메뉴 항목
		resMenu.add(resMenu31 = new JMenuItem("예약등록"));
		resMenu.add(resMenu32 = new JMenuItem("예약조회"));
		resMenu.addSeparator(); // 분리선 설정하기
		resMenu.add(resMenu33 = new JMenuItem("예약수정"));
		resMenu.add(resMenu34 = new JMenuItem("예약취소"));

		menuBar.add(helpMenu);
		helpMenu.add(helpMenu41 = new JMenuItem("버전"));

		jPanel = new JPanel();
		lCarName = new JLabel("차번호");
		tf = new JTextField(10);
		comboBox = new JComboBox();
		comboBox.addItem("차번호");
		comboBox.addItem("차이름");
		comboBox.addItem("차색상");
		comboBox.addItem("배기량");
		comboBox.addItem("제조사");
		
		
		btnSearch = new JButton("차량 조회하기");
		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SearchCarDialog(carController, "차 정보 조회");
				
			}
			
		});

		jPanel.add(lCarName);
		jPanel.add(tf);
		jPanel.add(comboBox);
		jPanel.add(btnSearch);

		Container con = frame.getContentPane(); // contentPane 을 가지고 올 때 사용하는 메소드
		con.add(jPanel, "North");

		frame.setLocation(200, 100);
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 메뉴 항목 선택 이벤트와 이벤트 리스너를 연결한다.
		carMenu11.addActionListener(new CarHandler());
		carMenu12.addActionListener(new CarHandler());
		carMenu13.addActionListener(new CarHandler());
		carMenu14.addActionListener(new CarHandler());

		memMenu21.addActionListener(new MemberHandler());
		memMenu22.addActionListener(new MemberHandler());
		memMenu23.addActionListener(new MemberHandler());
		memMenu24.addActionListener(new MemberHandler());
		
		resMenu31.addActionListener(new ResHandler());
		resMenu32.addActionListener(new ResHandler());
		resMenu33.addActionListener(new ResHandler());
		resMenu34.addActionListener(new ResHandler());


		helpMenu41.addActionListener(new HelpHandler());

		//컨트롤러 생성
		memberController = new MemberImpl();
		carController = new CarImpl();
		
		
	}
	
	 class MemberHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				System.out.println(e.getActionCommand());
				if (e.getSource() == memMenu21) {
					new RegMemDialog(memberController, "회원 등록창");
					
				} else if (e.getSource() == memMenu22) {
					new SearchMemDialog(memberController,"회원 조회창");
					
				} else if (e.getSource() == memMenu23) {
					
				}
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	

	 class CarHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			if (e.getSource() == carMenu11) {
				new RegCarDialog("차량등록창");
				
			} else if (e.getSource() == carMenu12) {
				new SearchCarDialog(carController, "차량조회창");
				
			} else if (e.getSource() == carMenu13) {
			}
		}
	}
	
	 class ResHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// 예약 기능 구현 실습
			System.out.println("이곳에 구현해 주세요");
		}
		
	}

	

	 class HelpHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			version();
		}
	}

	// 버전 메뉴 클릭 시 수행하는 메소드
	public void version() { // 버전관리창 생성
		final JDialog d = new JDialog(this, "버전관리");
		JLabel jbver = new JLabel("       버전1.1");
		JLabel jbdate = new JLabel("       2024.11.11");
		JLabel jbauthor = new JLabel("       제작 : 웹 자바");

		d.setLayout(new FlowLayout());
		d.add(jbver);
		d.add(jbdate);
		d.add(jbauthor);

		d.setLocation(250, 230);
		d.setSize(200, 100);
		d.setVisible(true);

		d.addWindowListener(new WindowAdapter() { // 버전관리창 종료
			public void windowClosing(WindowEvent e) {
				d.dispose();
			}
		});
	}
	

	public static void main(String[] args) {
		RentMainWindow test = new RentMainWindow();
		try {
			test.startFrame();
		} catch (MemberException | IOException e) {
			e.printStackTrace();
		}
	}
}
