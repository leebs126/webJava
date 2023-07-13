package sec03.ex01;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class WindowHandlerTest {
	private Frame frame;
	private Button button1;
	private Button button2;
	private Button button3;
	
	public WindowHandlerTest() {
		button1 = new Button("Ok");
		button2 = new Button("Open");
		button3 = new Button("Close");
		
		frame = new Frame("Adaper 클래스 사용 전 예제");
		frame.addWindowListener(new WindowHandler());
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(300,100);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		WindowHandlerTest test = new WindowHandlerTest();

	}
	
	public class WindowHandler implements WindowListener{
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("프로그램 종료");
			System.exit(0);
		}
		

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}

}
