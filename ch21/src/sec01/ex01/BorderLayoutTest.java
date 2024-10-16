package sec01.ex01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.BorderLayout;

public class BorderLayoutTest {

	public static void main(String[] args) {
		Frame frame;
		Button center, west, east, south;
		TextField tf1;

		frame = new Frame("BorderLayout 예제");
		south = new Button("button1");
		west = new Button("button2");
		east = new Button("button3");
		center = new Button("button4");
		tf1 = new TextField("입력창입니다.");

		//컴포넌트들을 Frame의 영역에 배치합니다. 
		frame.add(tf1, BorderLayout.NORTH);
		frame.add(south, BorderLayout.SOUTH);
		frame.add(west, BorderLayout.WEST);
		frame.add(east, BorderLayout.EAST);
		frame.add(center, BorderLayout.CENTER);
		frame.setSize(400, 400);
		
		frame.setVisible(true); //Frame을 보이게 설정합니다.

	}

}
