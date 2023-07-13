package sec02.ex05;

public class InterruptMethodTest1  {

	public static void main(String[] args) throws InterruptedException {
		VideoThread videoThread = new VideoThread();
		videoThread.start();
		
		System.out.println("videoThread 상태: " + videoThread.getState());
		
		//interrupt() 메소드 호출
		videoThread.interrupt(); //메소드 호출 후 실제 예외 발생까지 시간이 걸립니다.
		System.out.println("videoThread 상태: " + videoThread.getState());
		
		Thread.sleep(100);
		System.out.println("videoThread 상태: " + videoThread.getState());

		System.out.println("메인 스레드 종료");
	}

}
