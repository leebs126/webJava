package sec02.ex04;

public class joinTest2 {

	public static void main(String[] args) {
		System.out.println("메인 메소드 시작");

		Runnable r = new MyThread();
		Thread myThread = new Thread(r);
		myThread.start();

		try {myThread.join(1000);} catch (InterruptedException e) {}
//		try {myThread.join();} catch (InterruptedException e) {}

		System.out.println("메인 메소드 종료");

	}

}
