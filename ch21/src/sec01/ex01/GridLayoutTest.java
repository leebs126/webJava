package sec01.ex01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.GridLayout;



public class GridLayoutTest {
	public static void main(String[] args) {
		Frame frame;
		Button button1, button2, button3;
		TextField tf1,tf2,tf3;
		
		frame = new Frame("GridLayout 예제");
		button1 = new Button("button1");
		button2 = new Button("button2");
		button3 = new Button("button3");
		
		tf1 = new TextField("입력창1입니다.");
		tf2 = new TextField("입력창2입니다.");
		tf3 = new TextField("입력창3입니다.");

		frame.setLayout (new GridLayout(2,0));
//		frame.setLayout (new GridLayout(3,0));
		frame.add(button1);
		frame.add(tf1);
		frame.add(button2);
		frame.add(tf2);
		frame.add(button3);
		frame.add(tf3);
		

//		frame.pack();  //frame의 크기를 컴포넌트와 일치하게 합니다.
		frame.setVisible(true);
	}

}
