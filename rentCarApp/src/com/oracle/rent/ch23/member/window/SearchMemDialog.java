package com.oracle.rent.ch23.member.window;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.oracle.rent.ch23.common.RentTableModel;
import com.oracle.rent.ch23.member.controller.MemberController;
import com.oracle.rent.ch23.member.exception.MemberException;
import com.oracle.rent.ch23.member.vo.MemberVO;

public class SearchMemDialog extends JDialog {
	JPanel panelSearch, panelBtn;
	JLabel lMemName;
	JTextField tf;
	JButton btnSearch;
	JButton btnReg;
	JButton btnModify;
	JButton btnDelete;

	JTable memTable;
	RentTableModel rentTableModel;
	String[] columnNames = { "아이디", "비밀번호", "이름", "주소", "전화번호" };

	Object[][] memItems = new String[0][5]; // 테이블에 표시될 회원 정보 저장 2차원 배열
	int rowIdx = 0, colIdx = 0; // 테이블 수정 시 선택한 행과 열 인덱스 저장

	MemberController memberController;

	public SearchMemDialog(MemberController memberController, String str) {
		this.memberController = memberController;
		setTitle(str);
		init();

	}

	private void init() {
		memTable = new JTable();
		ListSelectionModel rowSel = memTable.getSelectionModel();
		rowSel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		rowSel.addListSelectionListener(new ListRowSelectionHandler()); // 테이블 행 클릭 시 이벤트 처리

		ListSelectionModel colSel = memTable.getColumnModel().getSelectionModel();
		colSel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		colSel.addListSelectionListener(new ListColSelectionHandler());

		panelSearch = new JPanel();
		panelBtn = new JPanel();

		lMemName = new JLabel("이름");
		tf = new JTextField("회원 이름을 입력하세요");
		btnSearch = new JButton("조회하기");
		btnSearch.addActionListener(new MemberBtnHandler());

		panelSearch.add(lMemName);
		panelSearch.add(tf);
		panelSearch.add(btnSearch);

		btnReg = new JButton("회원등록하기");
		btnModify = new JButton("수정하기");
		btnDelete = new JButton("삭제하기");

		btnReg.addActionListener(new MemberBtnHandler());
		btnModify.addActionListener(new MemberBtnHandler());
		btnDelete.addActionListener(new MemberBtnHandler());

		panelBtn.add(btnReg);
		panelBtn.add(btnModify);
		panelBtn.add(btnDelete);

		add(panelSearch, BorderLayout.NORTH);
		add(panelBtn, BorderLayout.SOUTH);

		rentTableModel = new RentTableModel(memItems, columnNames);
		memTable.setModel(rentTableModel);
		add(new JScrollPane(memTable), BorderLayout.CENTER);

		setLocation(300, 100);// 다이얼로그 출력 위치를 정한다.
		setSize(600, 600);
		setModal(true); // 항상 부모창 위에 보이게 한다.
		setVisible(true);
	}

	private void loadTableData(List<MemberVO> memList) {
		if (memList != null && memList.size() != 0) {
			memItems = new String[memList.size()][5];
			for (int i = 0; i < memList.size(); i++) {
				MemberVO memVO = memList.get(i);
				memItems[i][0] = memVO.getMemId();
				memItems[i][1] = memVO.getMemPassword();
				memItems[i][2] = memVO.getMemName();
				memItems[i][3] = memVO.getMemAddress();
				memItems[i][4] = memVO.getMemPhoneNum();
			}

			rentTableModel = new RentTableModel(memItems, columnNames);
			memTable.setModel(rentTableModel);
		} else {
			message("조회한 정보가 없습니다.");
			memItems = new Object[10][10];
			rentTableModel = new RentTableModel(memItems, columnNames);
			memTable.setModel(rentTableModel);
		}
	}

	private void message(String msg) {
		JOptionPane.showMessageDialog(this, msg, "메지지박스", JOptionPane.INFORMATION_MESSAGE);
	}

	class MemberBtnHandler implements ActionListener {
		String memId = null, memPassword = null, memName = null, memAddress = null, memPhoneNum = null;
		List<MemberVO> memList = null;

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnSearch) {
				String name = tf.getText().trim();
				memList = new ArrayList<MemberVO>();
				MemberVO memVO = new MemberVO();

				//회원 검색창에 이름을 입력한 경우와 입력하지 않은 경우를 처리하는 조건문
				if (name != null && name.length() != 0) {
					memVO.setMemName(name);
					List<MemberVO> memList = memberController.listMember(memVO);
					if (memList != null && memList.size() != 0) {
						loadTableData(memList);
					} else {
						loadTableData(null);
					}

				} else {

					memList = memberController.listMember(memVO);
					loadTableData(memList);
				}
				return;

			} else if (e.getSource() == btnDelete) {
				memId = (String) memItems[rowIdx][0];
				memPassword = (String) memItems[rowIdx][1];
				memName = (String) memItems[rowIdx][2];
				memAddress = (String) memItems[rowIdx][3];
				memPhoneNum = (String) memItems[rowIdx][4];
				MemberVO memVO = new MemberVO(memId, memPassword, memName, memAddress, memPhoneNum);

				memberController.removeMember(memVO);

			} else if (e.getSource() == btnModify) {
				memId = (String) memItems[rowIdx][0];
				memPassword = (String) memItems[rowIdx][1];
				memName = (String) memItems[rowIdx][2];
				memAddress = (String) memItems[rowIdx][3];
				memPhoneNum = (String) memItems[rowIdx][4];
				MemberVO memVO = new MemberVO(memId, memPassword, memName, memAddress, memPhoneNum);

				memberController.modMember(memVO);
			} else if (e.getSource() == btnReg) {
					new RegMemDialog(memberController, "회원 등록창");
					return;
			}

			List<MemberVO> memList = new ArrayList<MemberVO>();
			MemberVO memVO = new MemberVO();
			memList = memberController.listMember(memVO);
			loadTableData(memList);

		} // end actionPerformed

	}// end MemberBtnHandler

	// 테이블의 행 클릭 시 이벤트 처리
	class ListRowSelectionHandler implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			if (!e.getValueIsAdjusting()) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				rowIdx = lsm.getMinSelectionIndex();
				System.out.println(rowIdx + " 번째 행이 선택됨...");
//				System.out.println(memData[rowIdx][colIdx]);
			}
		}
	}

	class ListColSelectionHandler implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			ListSelectionModel lsm = (ListSelectionModel) e.getSource();
			colIdx = lsm.getMinSelectionIndex(); // 클릭한 열 인덱스를 얻습니다.
			if (!e.getValueIsAdjusting()) {
				System.out.println(rowIdx + " 번째 행, " + colIdx + "열 선택됨...");
//			System.out.println(memData[rowIdx][colIdx]);
			}
		}

	}

}
