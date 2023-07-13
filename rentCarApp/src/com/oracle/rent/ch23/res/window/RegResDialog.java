package com.oracle.rent.ch23.res.window;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.oracle.rent.ch23.common.RentTableModel;
import com.oracle.rent.ch23.res.controller.ResController;
import com.oracle.rent.ch23.res.controller.ResControllerImpl;
import com.oracle.rent.ch23.res.vo.ResVO;

public class RegResDialog  extends JDialog{
	JPanel jPanel;
	JLabel lResNum, lResCarNum, lResDate,lUseBeginDate,lReturnDate, lResUserId;
	JTextField tfResNum,tfResCarNum, tfResDate, tfUseBeginDate, tfReturnDate, tfResUserId  ;
    JButton btnResReg;
    
    ResController resController;
    String[][] resItems = new String[0][5];;
	JTable rentTable;
	RentTableModel rentTableModel;
	String[] columnNames = { "예약번호", "예약차번호", "예약날짜", "렌터카사용시작일자", "렌터카반납일자", "예약자아이디" };

	Object[][] memData = null; // 테이블에 표시될 회원 정보 저장 2차원 배열
	int rowIdx = 0, colIdx = 0; // 테이블 수정 시 선택한 행과 열 인덱스 저장

	String carNumber;  //렌터카 조회 화면에서 예약 버튼 클릭 시 넘어온 예약차번호 저장  
	
	public RegResDialog(String carNumber) {
		this(new ResControllerImpl(), carNumber, "렌터카 예약창");
	}
    
    public RegResDialog(ResController resController, String str) {
    	this.resController = resController;
    	setTitle(str);
    	init();
    }
    
    public RegResDialog(ResController resController, String carNumber, String str) {
    	this.resController = resController;
    	this.carNumber = carNumber;
    	setTitle(str);
    	init();
    }
    
    private void init() {
    	
    	lResNum = new JLabel("예약번호");
    	lResCarNum = new JLabel("예약차번호");
    	lResDate= new JLabel("예약날짜");
    	lUseBeginDate = new JLabel("렌터카사용시작일자");
    	lReturnDate = new JLabel("렌터카반납일자");
    	lResUserId = new JLabel("예약자아이디");
    	
    	
    	tfResNum = new JTextField(20);
    	tfResCarNum = new JTextField(20);
    	tfResDate = new JTextField(20);
    	tfUseBeginDate = new JTextField(20);
    	tfReturnDate = new JTextField(20);
    	tfResUserId = new JTextField(20);
    	
    	if(carNumber != null && carNumber.length() != 0 ) {  //차량 조회 화면에서 예약 시 차번호를 미리 표시합니다.
    		tfResCarNum.setText(carNumber);
    		tfResCarNum.setEditable(false);;
    	}
    	
    	
    	
    	btnResReg=new JButton("등록하기");
    	btnResReg.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String resNum = tfResNum.getText().trim();
				String resCarNum = tfResCarNum.getText().trim();
				String resDate = tfResDate.getText().trim();
				String useBeginDate = tfUseBeginDate.getText().trim();
				String returnDate = tfReturnDate.getText().trim();
				String resUserId = tfResUserId.getText().trim();
				
				ResVO resVO=new ResVO(resNum, resCarNum, resDate, useBeginDate, returnDate, resUserId);
				resController.regResInfo(resVO);
				
				showMessage("새 예약을 등록했습니다.");
				tfResNum.setText("");
				tfResCarNum.setText("");
				tfResDate.setText("");
				tfUseBeginDate.setText("");
				tfReturnDate.setText("");
				tfResUserId.setText("");
				
			}
        });
    	
    	
    	jPanel=new JPanel(new GridLayout(0,2));
    	jPanel.add(lResNum);
    	jPanel.add(tfResNum);
    	
    	jPanel.add(lResCarNum);
    	jPanel.add(tfResCarNum);
    	
    	jPanel.add(lResDate);
    	jPanel.add(tfResDate);
    	
    	jPanel.add(lUseBeginDate);
    	jPanel.add(tfUseBeginDate);
    	
    	jPanel.add(lReturnDate);
    	jPanel.add(tfReturnDate);
    	
    	jPanel.add(lResUserId);
    	jPanel.add(tfResUserId);
    	
    	add(jPanel,BorderLayout.NORTH);
    	add(btnResReg,BorderLayout.SOUTH);
    	
        setLocation(400, 200);
        setSize(400,400);
        setModal(true); //항상 부모창 위에 보이게 합니다.
        setVisible(true);
    }
    
    private void showMessage(String msg){
    	JOptionPane.showMessageDialog(this,
    			msg, 
    			"메지지박스",
               JOptionPane.INFORMATION_MESSAGE);
    }
    

}
