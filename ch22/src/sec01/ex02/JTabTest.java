package sec01.ex02;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import sec01.ex01.JFrameTest;

public class JTabTest {
	JFrame jFrame;
	JTabbedPane jtab;
	ImageIcon icon1, tabicon;
	JButton btn1, btn2;
	JLabel jlab;
	JPanel jpan;
	JTextField tf1;
	JTextArea tArea;
	
	public void createFrame() {
		jFrame = new JFrame("JTab 테스트");
		icon1 = new ImageIcon("src\\sec01\\ex02\\flowers.jpg"); //첫번째 탭 이미지
		jlab = new JLabel(icon1);  
		
		tabicon = new ImageIcon("src\\sec01\\ex02\\rabbit.png"); //탭아이콘 이미지
		jpan = new JPanel();
		tf1 = new JTextField("테스트입니다.");
		btn1 = new JButton("전송");
		jpan.add(tf1);
		jpan.add(btn1);
		tArea=new JTextArea(7,20);
		tArea.setText("내용을 입력하세요.");

		jtab = new JTabbedPane();
		jtab.addTab("탭1", jlab);
		jtab.addTab("탭2", new JPanel().add(tArea));
		jtab.addTab("탭3", tabicon, jpan, "세 번째 탭입니다.");
		jFrame.add(jtab);
		
		jFrame.setPreferredSize(new Dimension(500, 500)); // 프레임의 너비와 높이 지정		
		jFrame.pack();		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame 종료		
		jFrame.setVisible(true);
	}

	public static void main(String[] args) {
		JTabTest test = new JTabTest();
		test.createFrame();

	}

}
