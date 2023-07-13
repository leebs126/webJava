package sec08.ex03;

public class ButtonTest {

	public static void main(String[] args) {
		Button btnSave = new Button();
		
		//익명 객체를 람다식으로 구현
		btnSave.setClickListener(()->{
			System.out.println("저장 버튼을 클릭했습니다.");
			
		});
		
		btnSave.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(() ->{
			System.out.println("취소 버튼을 클릭했습니다.");
			
		});
		
		btnCancel.click();

	}

}
