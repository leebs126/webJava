package com.oracle.rent.ch22.common;


import javax.swing.table.AbstractTableModel;

public  class RentTableModel extends AbstractTableModel {
	
	String[] columnNames;

	Object[][] data;

	public RentTableModel( Object[][] data,String[] columnNames) {
		this.columnNames=columnNames;
		this.data = data;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return data.length;
	}

	@Override
	public Object getValueAt(int row, int column) {
		return data[row][column];
	}
	
	public String getColumnName(int column){
		return columnNames[column];
	}

	 boolean[] columnEditables = new boolean[] {
            false, true, true, true, true
       };

     public boolean isCellEditable(int row, int column) {
            return columnEditables[column];
     }
     
  
     public void setValueAt(Object value,int row,int column){
    	 data[row][column]=value;
 		fireTableCellUpdated(row, column);
 	}
}
