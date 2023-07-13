package sec04.ex01;

import java.awt.*;
import java.awt.event.*;

public class MemberWindow {
	public Frame frame;
	public List guiList;
	public Panel p1, p2;

	public Panel part1, part2, part3, part4, part5;
	public TextField tId, tName, tHeight, tWeight, tAge;
	public Button btnSearch, btnInsert, btnUpdate, btnDelete;
	public Label lId, lName, lHeight, lWeight, lAge;

	public MemberWindow() {
		frame = new Frame("회원 관리 창");
		
		//Label  생성
		lId = new Label("아이디", Label.RIGHT);
		lName = new Label("이름", Label.RIGHT);
		lHeight = new Label("키", Label.RIGHT);
		lWeight = new Label("몸무게", Label.RIGHT);
		lAge = new Label("나이", Label.RIGHT);
		lId.setAlignment(Label.CENTER);
		lName.setAlignment(Label.CENTER);
		lHeight.setAlignment(Label.CENTER);
		lWeight.setAlignment(Label.CENTER);
		lAge.setAlignment(Label.CENTER);
		
		//TextField 생성
		tId = new TextField();
		tName = new TextField();
		tHeight = new TextField();
		tWeight = new TextField();
		tAge = new TextField();
		
		//List 생성
		guiList = new List(2, false);
		guiList.setBackground(Color.green);
		
		//Button 생성
		btnSearch = new Button("조회");
		btnInsert = new Button("추가");
		btnUpdate = new Button("수정");
		btnDelete = new Button("삭제");

	}

	public static void main(String[] args) {
		MemberWindow window = new MemberWindow();
		window.startFrame();

	}

	public void startFrame() {
		//첫번째 Panel 설정
		part1 = new Panel();
		part1.setLayout(new GridLayout(1, 0));
		part1.add(lId);
		part1.add(tId);
		
		//두번째 Panel 설정
		part2 = new Panel();
		part2.setLayout(new GridLayout(1, 0));
		part2.add(lName);
		part2.add(tName);
		
		//세번째 Panel 설정
		part3 = new Panel();
		part3.setLayout(new GridLayout(1, 0));
		part3.add(lHeight);
		part3.add(tHeight);
		
		//네 번재 Panel 설정
		part4 = new Panel();
		part4.setLayout(new GridLayout(1, 0));
		part4.add(lWeight);
		part4.add(tWeight);
		
		//다섯번째 Panel 설정
		part5 = new Panel();
		part5.setLayout(new GridLayout(1, 0));
		part5.add(lAge);
		part5.add(tAge);
		
		
		//회원 정보 입력 Panel
		p1 = new Panel();
		p1.setLayout(new GridLayout(0, 1));
		p1.add(part1);
		p1.add(part2);
		p1.add(part3);
		p1.add(part4);
		p1.add(part5);
		
		//버튼 Panel 
		p2 = new Panel();
		p2.add(btnSearch);
		p2.add(btnInsert);
		p2.add(btnUpdate);
		p2.add(btnDelete);
		
		//Panel들을 프레임의 각각의 위치에 배치 
		frame.add(p1, "North");
		frame.add(guiList, "Center");
		frame.add(p2, "South");
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
