package sec03.ex01.window;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import sec03.ex01.vo.MemberVO;

public class MemberWindow extends BaseWindow {
	public MemberWindow() {
		System.out.println("생성자 호출");

		frame = new JFrame("회원관리창");
		lId = new JLabel("아이디", Label.RIGHT);
		lName = new JLabel("이름", Label.RIGHT);
		lHeight = new JLabel("키", Label.RIGHT);
		lWeight = new JLabel("몸무게", Label.RIGHT);
		lAge = new JLabel("나이", Label.RIGHT);

		lId.setHorizontalAlignment(JLabel.CENTER);
		lName.setHorizontalAlignment(JLabel.CENTER);
		lHeight.setHorizontalAlignment(JLabel.CENTER);
		lWeight.setHorizontalAlignment(JLabel.CENTER);
		lAge.setHorizontalAlignment(JLabel.CENTER);

		tId = new JTextField();
		tName = new JTextField();
		tHeight = new JTextField();
		tWeight = new JTextField();
		tAge = new JTextField();

		btnSearch = new JButton("조회");
		btnInsert = new JButton("추가");
		btnUpdate = new JButton("수정");
		btnDelete = new JButton("삭제");

	}

	// 회원 관리 화면을 구성한다.
	public void createGUI() {
		part1 = new JPanel();
		part1.setLayout(new GridLayout(1, 0));
		part1.add(lId);
		part1.add(tId);

		part2 = new JPanel();
		part2.setLayout(new GridLayout(1, 0));
		part2.add(lName);
		part2.add(tName);

		part3 = new JPanel();
		part3.setLayout(new GridLayout(1, 0));
		part3.add(lHeight);
		part3.add(tHeight);

		part4 = new JPanel();
		part4.setLayout(new GridLayout(1, 0));
		part4.add(lWeight);
		part4.add(tWeight);

		part5 = new JPanel();
		part5.setLayout(new GridLayout(1, 0));
		part5.add(lAge);
		part5.add(tAge);

		p1 = new JPanel();
		p1.setLayout(new GridLayout(0, 1));
		p1.add(part1);
		p1.add(part2);
		p1.add(part3);
		p1.add(part4);
		p1.add(part5);

		p2 = new JPanel();
		p2.add(btnSearch);
		p2.add(btnInsert);
		p2.add(btnUpdate);
		p2.add(btnDelete);

		// Listener를 등록합니다.
		btnSearch.addActionListener(new MemberHandler());
		btnInsert.addActionListener(new MemberHandler());
		btnUpdate.addActionListener(new MemberHandler());
		btnDelete.addActionListener(new MemberHandler());

		initTable(); // 최초 실행 시 DB와 연동해서 회원 데이터 조회 후,테이블을 초기화합니다.

		// 회원 정보 표시 테이블을 중앙에 위치시킵니다.
		frame.add(p1, BorderLayout.NORTH);
		frame.add(new JScrollPane(memTable), BorderLayout.CENTER);
		frame.add(p2, BorderLayout.SOUTH);

		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame 종료
		frame.setVisible(true);

	}

	public class MemberHandler implements ActionListener {
		String id = null, name = null;
		int height = 0, weight = 0, age = 0;

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnSearch) {
				String name = tName.getText();
				MemberVO memVO = new MemberVO();
				memVO.setName(name);
				List<MemberVO> memList = memberController.listMember(memVO);
				loadTableData(memList);

				return;

			} else if (e.getSource() == btnInsert) {

				// 사용자가 입력한 회원 정보를 가지고 온다.
				MemberVO memVO = new MemberVO();
				id = tId.getText();
				name = tName.getText();
				height = Integer.parseInt(tHeight.getText());
				weight = Integer.parseInt(tWeight.getText());
				age = Integer.parseInt(tAge.getText());

				memVO.setId(id);
				memVO.setName(name);
				memVO.setHeight(height);
				memVO.setWeight(weight);
				memVO.setAge(age);

				// 회원정보를 추가한다.
				memberController.addMember(memVO);
			} else if (e.getSource() == btnUpdate) {
				System.out.println("수정 버튼 클릭");

				id = (String) memItems[rowIdx][0];
				name = (String) memItems[rowIdx][1];
				height = Integer.parseInt((String) memItems[rowIdx][2]);
				weight = Integer.parseInt((String) memItems[rowIdx][3]);
				age = Integer.parseInt((String) memItems[rowIdx][4]);
				MemberVO memVO = new MemberVO(id, name, height, weight, age);
				memberController.modMember(memVO);

			} else if (e.getSource() == btnDelete) {
				System.out.println("삭제 버튼 클릭");
				id = (String) memItems[rowIdx][0];
				MemberVO memVO = new MemberVO(id, name, height, weight, age);
				memberController.removeMember(memVO);
			}

			// CRUD 작업 후 다시 테이블에 회원 정보를 로드합니다.
			List<MemberVO> memList = new ArrayList<MemberVO>();
			MemberVO memVO = new MemberVO();
			memList = memberController.listMember(memVO);
			loadTableData(memList);
		}

	}

	public static void main(String args[]) {
		MemberWindow memberWindow = new MemberWindow();
		memberWindow.createGUI();
	}

}
