package sec05.ex01;

public class ButtonTest {
	public static void main(String[] args) {
		ButtonEventHandler handler = new ButtonEventHandler();
		
		handler.button.btnClicked("등록하기");
		handler.button.btnClicked("수정하기");

	}

}
