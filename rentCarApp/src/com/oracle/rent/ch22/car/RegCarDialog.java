package com.oracle.rent.ch22.car;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegCarDialog  extends JDialog{
	JPanel jPanel;
	JLabel lCarNum,lCarName,lSize,lColor,lMaker;
	JTextField tfCarNum,tfCarName,tfSize,tfColor,tfMaker ;
    JButton btnReg;
    
    Car carController;
    
    public RegCarDialog(String str){
    	setTitle(str);
    	init();
    }
    
    private void init(){
    	carController=new CarImpl();
    	lCarNum = new JLabel("차량번호");
    	lCarName = new JLabel("차량명");
    	lSize = new JLabel("배기량");
    	lColor = new JLabel("차색상");
    	lMaker = new JLabel("차제조사");
    	
    	
    	tfCarNum=new JTextField(20);
    	tfCarName=new JTextField(20);
    	tfSize=new JTextField(20);
    	tfColor=new JTextField(20);
    	tfMaker=new JTextField(20);
    	
    	btnReg=new JButton("등록하기");
    	
   	 	btnReg.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String carNum=tfCarNum.getText().trim();
				String carName=tfCarName.getText().trim();
				int carSize=Integer.parseInt(tfSize.getText().trim());
				String carColor=tfColor.getText().trim();
				String carMaker=tfMaker.getText().trim();
				
				CarVO vo=new CarVO(carNum,carName,carColor,carSize,carMaker);
				try {
					carController.regCarInfo(vo);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
				showMessage("차량을  등록했습니다.");
				tfCarNum.setText("");
				tfCarName.setText("");
				tfSize.setText("");
				tfColor.setText("");
				tfMaker.setText("");
			}
        });
    	
    	
    	jPanel=new JPanel(new GridLayout(0,2));
    	jPanel.add(lCarNum);
    	jPanel.add(tfCarNum);
    	
    	jPanel.add(lCarName);
    	jPanel.add(tfCarName);
    	
    	jPanel.add(lSize);
    	jPanel.add(tfSize);
    	
    	jPanel.add(lColor);
    	jPanel.add(tfColor);
    	
    	jPanel.add(lMaker);
    	jPanel.add(tfMaker);
    	
    	add(jPanel,BorderLayout.NORTH);
    	add(btnReg,BorderLayout.SOUTH);
    	
        setLocation(400, 200);
        setSize(400,400);
        setModal(true);    //항상 부모창 위에 보이게 한다.
        setVisible(true);
    }
    
    
    
    private void showMessage(String msg){
    	JOptionPane.showMessageDialog(this,
    			msg, 
    			"메지지박스",
               JOptionPane.INFORMATION_MESSAGE);
    }
}
