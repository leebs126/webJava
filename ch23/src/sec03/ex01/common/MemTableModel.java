package sec03.ex01.common;

import javax.swing.table.*;

public class MemTableModel extends AbstractTableModel {
	String[] columnNames;
	Object[][] data = { { " ", " ", " ", " " } };
	
	//테이블의 첫번째 열의 값들은 수정할 수 없습니다.
	boolean[] columnEditables = new boolean[] { false, true, true,true, true };
	
	public MemTableModel( Object[][] data,String[] columnNames) {
		this.columnNames=columnNames;
		this.data = data;
	}


	//테이블의 행의 수를 지정합니다.
	@Override
	public int getRowCount() {
		return data.length;
	}

	//테이블의 열의 수를 지정합니다.
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	//각 셀의 값을 지정합니다.
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	//컬럼명을 얻습니다.
	public String getColumnName(int rowIndex) {
		return columnNames[rowIndex];
	}

	//각 셀의 편집 가능 여부를 지정합니다.
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return columnEditables[columnIndex];
	}

	//셀의 데이터 수정 시 수정된 데이터를 반영합니다.
	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		data[rowIndex][columnIndex] = value;
		fireTableCellUpdated(rowIndex, columnIndex);
	}

}
