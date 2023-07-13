package sec04.ex01;

public class ButtonEventHandler  implements Button.ButtonEventListener {

	@Override
	public void btnClicked(String btnName) {
		System.out.println(btnName + " 버튼을 클릭합니다.");
	}

}
