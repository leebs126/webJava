package sec05.ex01;

public class ButtonEventHandler {
	Button button = new Button();
	
	 ButtonEventListener listener = new ButtonEventListener() {
		@Override
		public void btnClicked(String btnName) {
			System.out.println(btnName + " 버튼을 클릭합니다.");
		}
	 };
	 
	 ButtonEventHandler(){
		 button.addButtonEventListener(listener);
	 }
}
