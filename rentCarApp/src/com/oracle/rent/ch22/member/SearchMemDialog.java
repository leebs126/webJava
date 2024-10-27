package com.oracle.rent.ch22.member;

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

import com.oracle.rent.ch22.car.CarVO;
import com.oracle.rent.ch22.common.RentTableModel;

public class SearchMemDialog extends JDialog {
	JPanel panelSearch, panelBtn;
	JLabel lMemName;
	JTextField tf;
	JButton btnSearch;
	JButton btnModify;
	JButton btnDelete;

	
	JTable memTable;
	RentTableModel rentTableModel;
	String[] columnNames = { "아이디", "비밀번호", "이름", "주소", "전화번호" };

	Object[][] memItems = new String[0][5]; // 테이블에 표시될 회원 정보 저장 2차원 배열 
	int rowIdx = 0, colIdx = 0;             // 테이블 수정 시 선택한 행과 열 인덱스 저장
	
	Member memberController;

	public SearchMemDialog(Member memberController, String str) {
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
		colSel.addListSelectionListener(new ListColSelectionHandler());     // 테이블 열 클릭 시 이벤트 처리

		panelSearch = new JPanel();
		panelBtn = new JPanel();

		lMemName = new JLabel("아이디");
		tf = new JTextField("회원 아이디를 입력하세요");
		btnSearch = new JButton("조회하기");
		btnSearch.addActionListener(new MemberBtnHandler());

		panelSearch.add(lMemName);
		panelSearch.add(tf);
		panelSearch.add(btnSearch);

		btnModify = new JButton("수정하기");
		btnDelete = new JButton("삭제하기");
		btnModify.addActionListener(new MemberBtnHandler());
		btnDelete.addActionListener(new MemberBtnHandler());

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

	private void loadTableData(List<MemberVO> memList) throws MemberException, IOException {
		if (memList != null  && memList.size() != 0) {
			memItems = new String[memList.size()][5];
			for (int i = 0; i < memList.size(); i++) {
				MemberVO memVO = memList.get(i);
	    		memItems[i][0]=memVO.getId();
	    		memItems[i][1]=memVO.getPassword();
	    		memItems[i][2]=memVO.getName();
	    		memItems[i][3]=memVO.getAddress();
	    		memItems[i][4]=memVO.getPhoneNum();
			}
			
			rentTableModel = new RentTableModel(memItems, columnNames);
			memTable.setModel(rentTableModel);
		} else {
			message("조회한 정보가 없습니다.");
			memItems = new Object[0][5];
			rentTableModel = new RentTableModel(memItems, columnNames);
			memTable.setModel(rentTableModel);
		}
	}

	private void message(String msg) {
		JOptionPane.showMessageDialog(this, msg, "메지지박스", JOptionPane.INFORMATION_MESSAGE);
	}

	class MemberBtnHandler implements ActionListener {
		String id = null, password = null, name = null, address = null, phoneNum = null;
		List<MemberVO> memList = null;

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnSearch) {
				String id = tf.getText().trim();
				memList = new ArrayList<MemberVO>();
				
				if (id != null && id.length() != 0) {
					try {
						MemberVO memVO = new MemberVO();
						memVO.setId(id);
						MemberVO result = memberController.viewMember(memVO);
						if(result != null) {
							memList.add(result);
							loadTableData(memList);
						}else {
							loadTableData(null);
						}
						
						

					} catch (MemberException | IOException e1) {
						e1.printStackTrace();
					}
				} else {
					try {

						memList = memberController.listMember();
						loadTableData(memList);

					} catch (MemberException | IOException e1) {
						e1.printStackTrace();
					}
				}

			} else if (e.getSource() == btnDelete) {
				id = (String) memItems[rowIdx][0];
				password = (String) memItems[rowIdx][1];
				name = (String) memItems[rowIdx][2];
				address = (String) memItems[rowIdx][3];
				phoneNum = (String) memItems[rowIdx][4];
				MemberVO memVO = new MemberVO(id, password, name, address, phoneNum);
				
				try {
					memberController.delMember(memVO);
					memList = memberController.listMember();
					loadTableData(memList);

				} catch (MemberException | IOException e1) {
					e1.printStackTrace();
				}

			}else if (e.getSource() == btnModify) {
				id = (String) memItems[rowIdx][0];
				password = (String) memItems[rowIdx][1];
				name = (String) memItems[rowIdx][2];
				address = (String) memItems[rowIdx][3];
				phoneNum = (String) memItems[rowIdx][4];
				MemberVO memVO = new MemberVO(id, password, name, address, phoneNum);
				
				try {
					memberController.modMember(memVO);
					memList = memberController.listMember();
					loadTableData(memList);

				} catch (MemberException | IOException e1) {
					e1.printStackTrace();
				}

				
				
			}

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
			}
		}
	}

	class ListColSelectionHandler implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			ListSelectionModel lsm = (ListSelectionModel)e.getSource( );
			colIdx=lsm.getMinSelectionIndex(); //클릭한 열 인덱스를 얻습니다.
			if (!e.getValueIsAdjusting()){
			System.out.println(rowIdx + " 번째 행, " + colIdx + "열 선택됨...");
			}
		}

	}

}
