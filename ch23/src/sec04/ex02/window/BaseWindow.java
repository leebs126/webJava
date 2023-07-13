package sec04.ex02.window;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import sec03.ex01.common.MemTableModel;
import sec03.ex01.controller.MemberController;
import sec03.ex01.vo.MemberVO;
import sec04.ex02.controller.ProdControllerImpl;
import sec04.ex02.vo.ProdVO;



public class BaseWindow extends JDialog {
	protected  JFrame frame;
	protected  JPanel p1, p2;
	protected  JPanel part1,part2,part3,part4;
	
	protected  JLabel lProdCode, lProdName,lProdColor,lProdQty;
	protected JTextField tProdCode,tProdName,tProdColor, tProdQty;
	protected  JButton btnSearch, btnInsert,btnUpdate,btnDelete;
	
	
	protected JTable prodTable;
	protected Object[][] prodItems = new String[0][4]; // 테이블에 표시될 회원 정보 저장 2차원 배열
	protected ProdTableModel prodTableModel;
	protected String[] columnNames = { "제품번호", "제품이름", "제품색상", "제품수량"};
	
	protected ProdControllerImpl prodController;	
	protected int rowIdx = 0, colIdx = 0; // 테이블 수정 시 선택한 행과 열 인덱스 저장
	
	public BaseWindow(){
		prodController =new ProdControllerImpl();
	}
	
	
	public void initTable(){
		prodTable=new JTable();
		ListSelectionModel rowSel = prodTable.getSelectionModel();
		rowSel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		rowSel.addListSelectionListener(new ListRowSelectionHandler()); // 테이블 행 클릭 시 이벤트 처리

		ListSelectionModel colSel = prodTable.getColumnModel().getSelectionModel();
		colSel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		colSel.addListSelectionListener(new ListColSelectionHandler());
		
		List<ProdVO> prodList = new  ArrayList<ProdVO>();
		ProdVO prodVO = new ProdVO();
		prodList = prodController.listProd(prodVO); 
		loadTableData(prodList);  //최초 시작 시 DB에서 회원정보 조회후 테이블에 표시합니다.
		
	}
	
	
	protected void loadTableData(List<ProdVO> prodList)  {
		if (prodList != null  && prodList.size() != 0) {
			prodItems = new String[prodList.size()][4];
			for (int i = 0; i < prodList.size(); i++) {
				ProdVO prodVO = prodList.get(i);
	    		prodItems[i][0] = prodVO.getProdCode();
	    		prodItems[i][1] = prodVO.getProdName();
	    		prodItems[i][2] = prodVO.getProdColor();
	    		prodItems[i][3] = Integer.toString(prodVO.getProdQty());
			}
			
			prodTableModel = new ProdTableModel(prodItems, columnNames);
			prodTable.setModel(prodTableModel);
		} else {
			message("조회한 정보가 없습니다.");
			prodItems = new Object[10][10];
			prodTableModel = new ProdTableModel(prodItems, columnNames);
			prodTable.setModel(prodTableModel);
		}
	}
	
	
	// 테이블의 행 클릭 시 이벤트 처리
		class ListRowSelectionHandler implements ListSelectionListener {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					ListSelectionModel lsm = (ListSelectionModel) e.getSource();
					rowIdx = lsm.getMinSelectionIndex();
//					System.out.println(rowIdx + " 번째 행이 선택됨...");
//					System.out.println(memData[rowIdx][colIdx]);
				}
			}
		}

		class ListColSelectionHandler implements ListSelectionListener {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel)e.getSource( );
//				rowIdx = lsm.getMinSelectionIndex();
				colIdx=lsm.getMinSelectionIndex(); //클릭한 열 인덱스를 얻습니다.
				if (!e.getValueIsAdjusting()){
//				System.out.println(rowIdx + " 번째 행, " + colIdx + "열 선택됨...");
//				System.out.println(memData[rowIdx][colIdx]);
				}
			}

		}
		
		
	
	private void message(String msg) {
		JOptionPane.showMessageDialog(this, msg, "메지지박스", JOptionPane.INFORMATION_MESSAGE);
	}
}
