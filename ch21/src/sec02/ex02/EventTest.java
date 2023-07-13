package sec02.ex02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest {
	private Frame frame;
	private Button btn1, btn2, btn3, btn4, btn5;
	
	public EventTest() {
		frame = new Frame("이벤트 핸들러예제");
		btn1 = new Button("btn1");
		btn2 = new Button("btn2");
		btn3 = new Button("btn3");
		btn4 = new Button("btn4");
		btn5 = new Button("btn5");

	}
	
	public static void main(String[] args) {
		EventTest test = new EventTest();
		test.startFrame();
	}
	
	public void startFrame() {
		btn1.addActionListener(new InnerHandler());
		btn2.addActionListener(new InnerHandler());
		btn3.addActionListener(new InnerHandler());
		btn4.addActionListener(new InnerHandler());
		btn5.addActionListener(new InnerHandler());
		
		frame.add(btn1, BorderLayout.NORTH);
		frame.add(btn2, BorderLayout.SOUTH);
		frame.add(btn3, BorderLayout.WEST);
		frame.add(btn4, BorderLayout.EAST);
		frame.add(btn5, BorderLayout.CENTER);
		
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	public class InnerHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn1) {
				System.out.println("버튼1 클릭");
				System.out.println(e.getActionCommand()); //버튼 이름을 얻습니다.
				
			} else if (e.getSource() == btn2) {
				System.out.println("버튼2 클릭");
				
			} else if (e.getSource() == btn3) {
				System.out.println("버튼3 클릭");
				
			} else if (e.getSource() == btn4) {
				System.out.println("버튼4 클릭");
				
			} else if (e.getSource() == btn5) {
				System.out.println("버튼5 클릭");
			}
			
		}
		
	}
	

}


