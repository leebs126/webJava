package sec01.ex01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.Color;

public class PanelTest {
	public static void main(String[] args) {
		Frame frame;
		Panel panel;
		Button btnOK, btnCancel;
		TextField tf1;

		frame = new Frame("Panel 예제");
		btnOK = new Button("OK");
		btnCancel = new Button("Cancel");
		tf1 = new TextField("입력창입니다.");
		panel = new Panel();

		frame.add(tf1, BorderLayout.NORTH);
		
		//Panel에 컴포넌트를 배치한 후, 다시  Panel을 Frame에 중앙에 배치합니다.
		panel.setBackground(Color.green);
		panel.add(btnOK);
		panel.add(btnCancel);
		frame.add(panel, BorderLayout.CENTER);  
				
		frame.setSize(400, 400);
		frame.setVisible(true);

	}

}
