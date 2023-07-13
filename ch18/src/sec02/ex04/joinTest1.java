package sec02.ex04;

public class joinTest1 {

	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		
		Runnable r = new MyThread();
		Thread myThread = new Thread(r);
		myThread.start();
		
		System.out.println("메인 스레드 종료");

	}

}
