package sec01.ex03;

public class FlagTest {
	public static void main(String[] args) {
		White white = new White();
		Blue blue = new Blue();
		
		Thread t = new Thread(white); //Runnable 인터페이스를 구현한 클래스를 생성자 인자로 전달합니다.
		Thread t2 = new Thread(blue);
		t.start();
		t2.start();
	}

}
