package sec01.ex06;

import javax.swing.*;

public class JTableTest extends JFrame{
	JTable table;
	Object [] columnNames={"사번","이름","근무부서" };
	String[][] data={{"220000","박길동","총무부"},
	                 {"220001","홍길동","관리부"},
	                 {"220002","이순신","회계부"},
	                 {"220003","임꺽정","개발부"},
	                 {"220004","박지성","관리부"},
	                 {"220005","제임스","총무부"},
	                 {"220006","이길동","총무부"},
	                 {"220007","차범근","개발부"},
	                 {"220008","박세리","회계부"},
	                 {"220009","차두리","영업부"},
	                 {"220010","홍명보","영업부"},
	                 {"220011","존슨","개발부"},
	                 {"220012","김유신","영업부"},
	                 {"220013","홍길순","회계부"}
	                 };
	
	public JTableTest() {
		table=new JTable(data,columnNames);
		table.setAutoResizeMode(table.AUTO_RESIZE_ALL_COLUMNS);
//		table.setAutoResizeMode(table.AUTO_RESIZE_LAST_COLUMN);
		//table.setAutoResizeMode(table.AUTO_RESIZE_NEXT_COLUMN);
		//table.setAutoResizeMode(table.AUTO_RESIZE_OFF);
		//table.setAutoResizeMode(table.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("사원 정보 테이블");
		add(new JScrollPane(table));
		pack();
		setVisible(true);
		
	}
	public static void main(String[] args) {
		JTableTest test =new JTableTest();
	}

}
