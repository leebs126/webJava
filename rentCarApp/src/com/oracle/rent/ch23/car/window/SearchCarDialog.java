package com.oracle.rent.ch23.car.window;

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

import com.oracle.rent.ch23.car.controller.CarController;
import com.oracle.rent.ch23.car.vo.CarVO;
import com.oracle.rent.ch23.common.RentTableModel;
import com.oracle.rent.ch23.res.window.RegResDialog;

public class SearchCarDialog extends JDialog {
	JPanel panelSearch, panelBtn;
	JLabel lCarName;
	JTextField tf;
	JButton btnSearch;
	JButton btnReg;
	JButton btnModify;
	JButton btnDelete;
	
	JButton btnResReg; // 렌터카 예약하기 버튼 

	JTable carTable;
	RentTableModel rentTableModel;
	String[] columnNames = { "차번호", "차이름", "차색상", "배기량", "차제조사" };
	Object[][] carItems;
	int rowIdx = 0, colIdx = 0; // 테이블 수정 시 선택한 행과 열 인덱스 저장

	CarController carController;

	public SearchCarDialog(CarController carController, String str) {
		this.carController = carController;
		setTitle(str);
		init();
		

	}

	private void init() {
		carTable = new JTable();
		ListSelectionModel rowSel = carTable.getSelectionModel();
		rowSel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		rowSel.addListSelectionListener(new ListRowSelectionHandler()); // 테이블 행 클릭 시 이벤트 처리

		ListSelectionModel colSel = carTable.getColumnModel().getSelectionModel();
		colSel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		colSel.addListSelectionListener(new ListColSelectionHandler());
		
		panelSearch = new JPanel();
		panelBtn = new JPanel();

		lCarName = new JLabel("차번호");
		tf = new JTextField("차번호을 입력하세요.");
		btnSearch = new JButton("조회하기");
		btnSearch.addActionListener(new CarBtnHandler());

		panelSearch.add(lCarName);
		panelSearch.add(tf);
		panelSearch.add(btnSearch);
		
		btnReg = new JButton("렌터카등록하기");
		btnModify = new JButton("수정하기");
		btnDelete = new JButton("삭제하기");
		btnResReg = new JButton("렌터카 예약하기");
		
		btnReg.addActionListener(new CarBtnHandler());
		btnModify.addActionListener(new CarBtnHandler());
		btnDelete.addActionListener(new CarBtnHandler());
		btnResReg.addActionListener(new ResBtnHandler());

		panelBtn.add(btnReg);
		panelBtn.add(btnModify);
		panelBtn.add(btnDelete);
		panelBtn.add(btnResReg);

		add(panelSearch, BorderLayout.NORTH);
		add(panelBtn, BorderLayout.SOUTH);

		carItems = new String[0][5];
		rentTableModel = new RentTableModel(carItems, columnNames);
		carTable.setModel(rentTableModel);
		add(new JScrollPane(carTable), BorderLayout.CENTER);

		setLocation(300, 100);// 다이얼로그 출력 위치를 정한다.
		setSize(600, 600);
		setModal(true); // 항상 부모창 위에 보이게 한다.
		setVisible(true);
	}

	private void loadTableData(List<CarVO> carList) {
		if (carList != null && carList.size() != 0) {
			carItems = new String[carList.size()][5];

			for (int i = 0; i < carList.size(); i++) {
				CarVO carVO = carList.get(i);
				carItems[i][0] = carVO.getCarNumber();
				carItems[i][1] = carVO.getCarName();
				carItems[i][2] = carVO.getCarColor();
				carItems[i][3] = Integer.toString(carVO.getCarSize());
				carItems[i][4] = carVO.getCarMaker();
			}

			rentTableModel = new RentTableModel(carItems, columnNames);
			carTable.setModel(rentTableModel);
		} else {
			message("조회한 정보가 없습니다.");
			carItems = new Object[0][5];
			rentTableModel = new RentTableModel(carItems, columnNames);
			carTable.setModel(rentTableModel);
		}
	}

	private void message(String msg) {
		JOptionPane.showMessageDialog(this, msg, "메지지박스", JOptionPane.INFORMATION_MESSAGE);
	}

	class CarBtnHandler implements ActionListener {
		String carNumber = null, carName = null, carColor = null, carMaker = null;
		int carSize = 0;
		List<CarVO> carList = null;

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnSearch) {
				String carNumber = tf.getText().trim();
				carList = new ArrayList<CarVO>();
				CarVO carVO = new CarVO();
				
				//차량 검색창에 차번호를 입력한 경우와 입력하지 않은 경우를 처리하는 조건문
				if (carNumber != null && carNumber.length() != 0) {
					carVO.setCarNumber(carNumber);
					List<CarVO> carList = carController.listCarInfo(carVO);
					if (carList != null && carList.size() != 0) {
						loadTableData(carList);
					} else {
						loadTableData(null);
					}

				} else {
					//모든 차량 정보 조회
					carList = carController.listCarInfo(carVO);
					loadTableData(carList);
				}
				return;

			} else if (e.getSource() == btnDelete) {
				carNumber = (String) carItems[rowIdx][0];
				carName = (String) carItems[rowIdx][1];
				carColor = (String) carItems[rowIdx][2];
				carSize = Integer.parseInt((String) carItems[rowIdx][3]);
				carMaker = (String) carItems[rowIdx][4];
				CarVO carVO = new CarVO(carNumber, carName, carColor, carSize, carMaker);

				carController.removeCarInfo(carVO);

			} else if (e.getSource() == btnModify) {
				carNumber = (String) carItems[rowIdx][0];
				carName = (String) carItems[rowIdx][1];
				carColor = (String) carItems[rowIdx][2];
				carSize = Integer.parseInt((String) carItems[rowIdx][3]);
				carMaker = (String) carItems[rowIdx][4];
				CarVO carVO = new CarVO(carNumber, carName, carColor, carSize, carMaker);

				carController.modCarInfo(carVO);

			}else if(e.getSource() == btnReg) {
				new RegCarDialog(carController, "차량 등록창");
				return;
			}

			List<CarVO> carList = new ArrayList<CarVO>();
			CarVO carVO = new CarVO();
			carList = carController.listCarInfo(carVO);
			loadTableData(carList);

		} // end actionPerformed

	}// end CarBtnHandler
	
	
	class ResBtnHandler implements ActionListener {
		String carNumber = null, carName = null, carColor = null, carMaker = null;
		int carSize = 0;
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnResReg) {
				carNumber = (String) carItems[rowIdx][0];
				System.out.println("차번호 : " + carNumber);
				
//				carName = (String) carItems[rowIdx][1];
//				carColor = (String) carItems[rowIdx][2];
//				carSize = Integer.parseInt((String) carItems[rowIdx][3]);
//				carMaker = (String) carItems[rowIdx][4];
//				CarVO carVO = new CarVO(carNumber, carName, carColor, carSize, carMaker);
				
				new RegResDialog(carNumber);
			}
			
		}
		
	}

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
			colIdx = lsm.getMinSelectionIndex();
			if (!e.getValueIsAdjusting()) {
				System.out.println(rowIdx + " 번째 행, " + colIdx + "열 선택됨...");
//			System.out.println(carData[rowIdx][colIdx]);
			}
		}

	}

}
