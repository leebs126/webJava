package sec01.ex03;

public class FlagTest1 {
	public static void main(String[] args) {
		White white = new White();
		Blue blue = new Blue();
		
		Thread t = new Thread(white); //Runnable 인터페이스를 구현한 클래스를 생성자 인자로 전달합니다.
		Thread t2 = new Thread(blue);
		t.start();
		t2.start();
		
		//Runnable 인터페이스를 이용해서 익명 스레드 객체로 파일 업로드  기능을 사용합니다. 
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000000; i++) {
					System.out.println("파일 업로드 중입니다.");
				}
			}
		}).start();
	}

}
