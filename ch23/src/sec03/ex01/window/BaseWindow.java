package sec03.ex01.window;

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
import sec03.ex01.controller.MemberControllerImpl;
import sec03.ex01.vo.MemberVO;



public class BaseWindow extends JDialog {
	protected  JFrame frame;
	protected  JPanel p1, p2;
	protected  JPanel part1,part2,part3,part4,part5;
	
	protected JTextField tId,tName,tHeight,tWeight,tAge;
	protected  JButton btnSearch, btnInsert,btnUpdate,btnDelete;
	protected  JLabel lId,lName,lHeight,lWeight,lAge;
	
	protected JTable memTable;
	protected Object[][] memItems = new String[0][5]; // 테이블에 표시될 회원 정보 저장 2차원 배열
	protected MemTableModel memTableModel;
	protected String[] columnNames = { "아이디", "이름", "키", "몸무게", "나이" };
	
	protected MemberController memberController;	
	protected int rowIdx = 0, colIdx = 0; // 테이블 수정 시 선택한 행과 열 인덱스 저장
	
	public BaseWindow(){
		memberController =new MemberControllerImpl();
	}
	
	
	public void initTable(){
		memTable=new JTable();
		ListSelectionModel rowSel = memTable.getSelectionModel();
		rowSel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		rowSel.addListSelectionListener(new ListRowSelectionHandler()); // 테이블 행 클릭 시 이벤트 처리

		ListSelectionModel colSel = memTable.getColumnModel().getSelectionModel();
		colSel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		colSel.addListSelectionListener(new ListColSelectionHandler());
		
		List<MemberVO> memList = new  ArrayList<MemberVO>();
		MemberVO memVO = new MemberVO();
		memList = memberController.listMember(memVO); 
		loadTableData(memList);  //최초 시작 시 DB에서 회원정보 조회후 테이블에 표시합니다.
		
	}
	
	
	protected void loadTableData(List<MemberVO> memList)  {
		if (memList != null  && memList.size() != 0) {
			memItems = new String[memList.size()][5];
			for (int i = 0; i < memList.size(); i++) {
				MemberVO memVO = memList.get(i);
	    		memItems[i][0] = memVO.getId();
	    		memItems[i][1] = memVO.getName();
	    		memItems[i][2] = Integer.toString(memVO.getHeight());
	    		memItems[i][3] = Integer.toString(memVO.getWeight());
	    		memItems[i][4] = Integer.toString(memVO.getAge());
			}
			
			memTableModel = new MemTableModel(memItems, columnNames);
			memTable.setModel(memTableModel);
		} else {
			message("조회한 정보가 없습니다.");
			memItems = new Object[10][10];
			memTableModel = new MemTableModel(memItems, columnNames);
			memTable.setModel(memTableModel);
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
