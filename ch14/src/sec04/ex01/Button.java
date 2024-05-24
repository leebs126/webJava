package sec04.ex01;

public class Button {
	ButtonEventListener listener;
	
	public void addButtonEventListener(ButtonEventListener listener) {
		this.listener = listener;
	}
	
	public void btnClicked(String btnName) {
		listener.btnClicked(btnName);
	}
	
	//내부 인터페이스
	static interface ButtonEventListener{
		public void btnClicked(String btnName);
	}
}
