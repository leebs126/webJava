package sec05.ex01;

public class Button {
	ButtonEventListener listener;
	
	public void addButtonEventListener(ButtonEventListener listener) {
		this.listener = listener;
	}
	
	public void btnClicked(String btnName) {
		listener.btnClicked(btnName);
	}

}
