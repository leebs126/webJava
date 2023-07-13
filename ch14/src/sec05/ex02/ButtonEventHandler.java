package sec05.ex02;

public class ButtonEventHandler {
	public void calculate(final int a, final int b) {
		final int sum = 0;
		
		ButtonEventListener listener = new ButtonEventListener() {
			@Override
			public void btnClicked(String btnName) {
//				a = 100;
//				b = 100;
//				sum = a + b;
				
				System.out.println(btnName + " 버튼을 클릭합니다.");
				System.out.println("합 : " + sum);
			}
		 };

		
	}
	 
	 
}
