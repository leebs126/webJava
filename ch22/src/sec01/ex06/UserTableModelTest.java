package sec01.ex06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserTableModelTest extends JFrame {
	JPanel searchPanel;
	JPanel bPanel;
	JList memberJList;
	JLabel lCondition;
	JTextField tCondition;
	JButton searchBtn;
	JComboBox combo;
	JTable memTable;

	JButton updateBtn, deleteBtn;
	Object[][] emp  = new Object[0][4];

	public UserTableModelTest() {

		initTableModel();
		setTitle("사용자 정의 테이블 실습");
		setLayout(new BorderLayout());
		Container c = getContentPane();
		c.add(searchPanel, "North");
		c.add(new JScrollPane(memTable), "Center");
		c.add(bPanel, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200);
		pack();
		setVisible(true);
	}

	

	private void initTableModel(){
		searchPanel=new JPanel( );
		tCondition=new JTextField(10);
		lCondition=new JLabel("입력창");
		memberJList=new JList( );
		memberJList.setBackground(Color.GREEN);
		memTable=new JTable();
		memTable.setModel(new UserTableModel(emp));
		
		searchBtn=new JButton("조회하기");
		searchBtn.addActionListener(new ActionListener( ) {
		public void actionPerformed(ActionEvent e) {
			Object[][] data={{"220000","박길동","총무부"},
			                {"220001","홍길동","관리부"},
			                {"220002","이순신","회계부"},
			                {"220003","임꺽정","개발부"},
			                {"220004","박지성","관리부"}
			                };
	
		
			memTable.setModel(new UserTableModel(data));
			}
		});
		searchPanel.add(lCondition);
		searchPanel.add(tCondition);
		searchPanel.add(searchBtn);
		
		bPanel = new JPanel();
		updateBtn = new JButton("수정하기");
		deleteBtn = new JButton("삭제하기");
		bPanel.add(updateBtn);
		bPanel.add(deleteBtn);
	}

	public static void main(String[] args) {
		new UserTableModelTest();

	}

}	
