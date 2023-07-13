package sec02.ex04;

public class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println("run 메소드 시작");
		first();
	}

	private void first() {
		System.out.println("first() 메소드 호출");
		second();
	}

	private void second() {
		System.out.println("second() 메소드 호출");
	}

}
