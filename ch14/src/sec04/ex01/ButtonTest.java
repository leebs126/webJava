package sec04.ex01;

public class ButtonTest {
	public static void main(String[] args) {
		Button button  = new Button();
		button.addButtonEventListener(new ButtonEventHandler());
		
		button.btnClicked("등록하기");
		button.btnClicked("수정하기");
	}
}
