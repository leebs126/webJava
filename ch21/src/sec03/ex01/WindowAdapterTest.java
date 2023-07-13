package sec03.ex01;

import java.awt.*;
import java.awt.event.*;

public class WindowAdapterTest {
	private Frame frame;
	private Button button1;
	private Button button2;
	private Button button3;

	public WindowAdapterTest() {
		button1 = new Button("Ok");
		button2 = new Button("Open");
		button3 = new Button("Close");

		frame = new Frame("Adaper 클래스 사용 전 예제");
		frame.addWindowListener(new WindowHandler());
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(300, 100);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		WindowAdapterTest test = new WindowAdapterTest();
	}

	public class WindowHandler extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("프로그램 종료");
			System.exit(0);
		}
	}

}
