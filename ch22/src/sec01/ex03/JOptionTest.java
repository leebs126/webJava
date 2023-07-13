package sec01.ex03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionTest extends JFrame implements ActionListener {
	JButton btn1, btn2, btn3, btn4;
	String[] str = { "카드결제", "계좌이체" };

	public JOptionTest() {
		super("여러가지 메시지 박스 테스트");
		setLayout(new FlowLayout());

		btn1 = new JButton("출력 메시지 박스");
		btn2 = new JButton("확인 메시지 박스");
		btn3 = new JButton("입력 메시지 박스");
		btn4 = new JButton("선택 메시지 박스");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		pack();
		setLocation(300,300);
		setVisible(true);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource( )==btn1){
			JOptionPane.showMessageDialog(this,
				                             "출력 메시지 박스",
				                             "메시지",
				                              JOptionPane.INFORMATION_MESSAGE);
		}else if(e.getSource( )==btn2){
			JOptionPane.showMessageDialog(this,
				                              "확인 메시지 박스",
				                              "확인",
				                              JOptionPane.YES_NO_CANCEL_OPTION);
		}else if(e.getSource( )==btn3){
			String answer=JOptionPane.showInputDialog(this,
				                              "입력 메시지 박스",
				                              "입력",
				                              JOptionPane.YES_NO_OPTION);
			System.out.println("입력한 값은 : " +answer);
		}else if(e.getSource( )==btn4){
			JOptionPane.showOptionDialog(this,
						               "선택 메시지 박스",
						               "옵션",
						               JOptionPane.YES_NO_CANCEL_OPTION,
						               JOptionPane.INFORMATION_MESSAGE,
						               null,
						               str,
					               str[0]);

		}
	}

	public static void main(String[] args) {
		new JOptionTest();

	}

	

}
