package sec01.ex05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JDialogTest extends JFrame  {
	JLabel label = new JLabel("다이얼로그 테스트");
	JButton btn1 = new JButton("첫번째 다이얼로그 띄우기");
	JButton btn2 = new JButton("두번째 다이얼로그 띄우기");

	public JDialogTest() {
		setTitle("다이얼로그 테스트!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 0));

		getContentPane().add(label);
		getContentPane().add(btn1);
		getContentPane().add(btn2);
		
		setLocation(200, 200);
		setSize(500, 300);
		setVisible(true);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Dialog1(e.getActionCommand() + " 버튼을 누르셨군요!");
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				new Dialog2(this, label, "두번째 다이얼로그창입니다.");
				new Dialog2(label, "두번째 다이얼로그창입니다.");
			}
			
		});

	}

	public static void main(String[] args) {
		new JDialogTest();

	}


}

class Dialog1 extends JDialog {
	ImageIcon icon1;
	JLabel dlb = new JLabel("");

	public Dialog1(String title) {
		getContentPane().add(dlb);
		icon1 = new ImageIcon("src\\sec01\\ex05\\flowers.jpg");
		dlb.setIcon(icon1);
		setTitle(title);
		setLocation(200, 200);
		setSize(400, 400);
		setModal(true);
		setVisible(true);
	}
}

class Dialog2 extends JDialog {
	JTextField tf = new JTextField(10);
	JButton okButton = new JButton("OK");

	public Dialog2(JLabel label, String title) {
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setTitle(title);
		setLocation(200, 200);
		setSize(400, 100);
		setVisible(true);
		setModal(true);
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				label.setText(text);
				dispose();
			}
		});
	}
}
