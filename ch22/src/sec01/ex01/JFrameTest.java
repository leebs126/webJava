package sec01.ex01;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameTest {
	JFrame jFrame;
	JButton btn1, btn2, btn3, btn4;
	JTextField tf1;
	
	public void createFrame() {
		jFrame = new JFrame("JFrame 테스트");
		btn1 = new JButton("button1");
		btn2 = new JButton("button2");
		btn3 = new JButton("button3");
		btn4 = new JButton("button4");
		tf1 = new JTextField("내용을 입력하세요.");
		
		//Frame에 컴포넌트 추가
		jFrame.add(tf1, BorderLayout.NORTH);
		jFrame.add(btn1, BorderLayout.SOUTH);
		jFrame.add(btn2, BorderLayout.WEST);
		jFrame.add(btn3, BorderLayout.EAST);
		jFrame.add(btn4, BorderLayout.CENTER);
		
		jFrame.setPreferredSize(new Dimension(500,500)); // Frame의 너비와 높이 지정		
		jFrame.pack();		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame 종료		
		jFrame.setVisible(true);
	}

	public static void main(String[] args) {
		JFrameTest test = new JFrameTest();
		test.createFrame();
	}

}
