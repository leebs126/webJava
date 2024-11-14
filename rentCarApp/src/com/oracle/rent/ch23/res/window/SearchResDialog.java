package com.oracle.rent.ch23.res.window;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import com.oracle.rent.ch23.res.controller.ResController;
import com.oracle.rent.ch23.res.vo.ResVO;

public class SearchResDialog extends JDialog {
	JPanel panelSearch, panelBtn;
	JLabel lResNumber;
	JTextField tfResNumber;
	JButton btnResSearch;
	JButton btnResReg;
	JButton btnResModify;
	JButton btnResDelete;

	JTable resTable;
	RentTableModel rentTableModel;
	String[] columnNames = { "예약번호", "예약차번호", "예약일자", "렌터카이용시작일자", "렌터카반납일자", "예약자아이디" };

	Object[][] resItems = new String[0][6]; // 테이블에 표시될 회원 정보 저장 2차원 배열
	int rowIdx = 0, colIdx = 0; // 테이블 수정 시 선택한 행과 열 인덱스 저장

	ResController resController;

	public SearchResDialog(ResController resController, String str) {
		this.resController = resController;
		setTitle(str);
		init();

	}

	private void init() {
		resTable = new JTable();
		ListSelectionModel rowSel = resTable.getSelectionModel();
		rowSel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		rowSel.addListSelectionListener(new ListRowSelectionHandler()); // 테이블 행 클릭 시 이벤트 처리

		ListSelectionModel colSel = resTable.getColumnModel().getSelectionModel();
		colSel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		colSel.addListSelectionListener(new ListColSelectionHandler());

		panelSearch = new JPanel();
		panelBtn = new JPanel();

		lResNumber = new JLabel("예약번호");
	
		tfResNumber = new JTextField("예약번호를 입력하세요.");
		btnResSearch = new JButton("조회하기");
		btnResSearch.addActionListener(new ResBtnHandler());

		panelSearch.add(lResNumber);
		panelSearch.add(tfResNumber);
		panelSearch.add(btnResSearch);

		btnResReg = new JButton("렌터카 예약하기");
		btnResModify = new JButton("수정하기");
		btnResDelete = new JButton("삭제하기");

		btnResReg.addActionListener(new ResBtnHandler());
		btnResModify.addActionListener(new ResBtnHandler());
		btnResDelete.addActionListener(new ResBtnHandler());

		panelBtn.add(btnResReg);
		panelBtn.add(btnResModify);
		panelBtn.add(btnResDelete);

		add(panelSearch, BorderLayout.NORTH);
		add(panelBtn, BorderLayout.SOUTH);

		rentTableModel = new RentTableModel(resItems, columnNames);
		resTable.setModel(rentTableModel);
		add(new JScrollPane(resTable), BorderLayout.CENTER);

		setLocation(300, 100);// 다이얼로그 출력 위치를 정한다.
		setSize(600, 600);
		setModal(true); // 항상 부모창 위에 보이게 한다.
		setVisible(true);
	}

	private void loadTableData(List<ResVO> resList) {
		if (resList != null && resList.size() != 0) {
			resItems = new String[resList.size()][6];
			for (int i = 0; i < resList.size(); i++) {
				ResVO resVO = resList.get(i);
				resItems[i][0] = resVO.getResNumber();
				resItems[i][1] = resVO.getResCarNumber();
				resItems[i][2] = resVO.getResDate();
				resItems[i][3] = resVO.getUseBeginDate();
				resItems[i][4] = resVO.getReturnDate();
				resItems[i][5] = resVO.getResUserId();
			}

			rentTableModel = new RentTableModel(resItems, columnNames);
			resTable.setModel(rentTableModel);
		} else {
			showMessage("조회한 정보가 없습니다.");
			resItems = new Object[0][6];
			rentTableModel = new RentTableModel(resItems, columnNames);
			resTable.setModel(rentTableModel);
		}
	}

	private void showMessage(String msg) {
		JOptionPane.showMessageDialog(this, msg, "메지지박스", JOptionPane.INFORMATION_MESSAGE);
	}

	class ResBtnHandler implements ActionListener {
		String resNumber = null, resCarNumber = null, resDate = null, useBeginDate = null, returnDate = null, resUserId = null;
		List<ResVO> resList = null;

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnResSearch) {
				String resNumber = tfResNumber.getText().trim();
				resList = new ArrayList<ResVO>();
				ResVO resVO = new ResVO();

				//회원 검색창에 이름을 입력한 경우와 입력하지 않은 경우를 처리하는 조건문
				if (resNumber != null && resNumber.length() != 0) {
					resVO.setResNumber(resNumber);
					List<ResVO> resList = resController.listResInfo(resVO);
					if (resList != null && resList.size() != 0) {
						loadTableData(resList);
					} else {
						loadTableData(null);
					}

				} else {
					resList = resController.listResInfo(resVO);
					loadTableData(resList);
				}
				return;

			} else if (e.getSource() == btnResDelete) {
				resNumber = (String) resItems[rowIdx][0];
				resCarNumber = (String) resItems[rowIdx][1];
				resDate = (String) resItems[rowIdx][2];
				useBeginDate = (String) resItems[rowIdx][3];
				returnDate = (String) resItems[rowIdx][4];
				resUserId = (String) resItems[rowIdx][5];
				ResVO resVO = new ResVO(resNumber, resCarNumber, resDate, useBeginDate, returnDate, resUserId);

				resController.cancelResInfo(resVO);

			} else if (e.getSource() == btnResModify) {
				resNumber = (String) resItems[rowIdx][0];
				resCarNumber = (String) resItems[rowIdx][1];
				resDate = (String) resItems[rowIdx][2];
				useBeginDate = (String) resItems[rowIdx][3];
				returnDate = (String) resItems[rowIdx][4];
				resUserId = (String) resItems[rowIdx][5];
				ResVO resVO = new ResVO(resNumber, resCarNumber, resDate, useBeginDate, returnDate, resUserId);

				resController.modResInfo(resVO);
			} else if(e.getSource() == btnResReg) {
				new RegResDialog(resController, "예약 등록창");
				return;
			}

			List<ResVO> resList = new ArrayList<ResVO>();
			ResVO resVO = new ResVO();
			resList = resController.listResInfo(resVO);
			loadTableData(resList);

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
