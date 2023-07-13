package sec01.ex01;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameTest {
	JFrame jFrame = new JFrame("JFrame 테스트");
	JButton btn1, btn2, btn3, btn4;
	
	public void createFrame() {
		JButton btn1 = new JButton("button1");
		JButton btn2 = new JButton("button2");
		JButton btn3 = new JButton("button3");
		JButton btn4 = new JButton("button4");
		JTextField tf1 = new JTextField("내용을 입력하세요.");
		
		
		//프레임에 컴포넌트 추가
		jFrame.add(tf1, BorderLayout.NORTH);
		jFrame.add(btn1, BorderLayout.SOUTH);
		jFrame.add(btn2, BorderLayout.WEST);
		jFrame.add(btn3, BorderLayout.EAST);
		jFrame.add(btn4, BorderLayout.CENTER);
		
		jFrame.setPreferredSize(new Dimension(500,500)); // 프레임의 너비와 높이 지정		
		jFrame.pack();		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame 종료		
		jFrame.setVisible(true);
	}

	public static void main(String[] args) {
		JFrameTest test = new JFrameTest();
		test.createFrame();
	}

}
