package sec02.ex06;

public class InterruptMethodTest2  {

	public static void main(String[] args)  {
		VideoThread videoThread = new VideoThread();
		videoThread.start();
		
		System.out.println("videoThread 상태: " + videoThread.getState());
		
		//interrupt() 메소드 호출
		videoThread.interrupt(); //메소드 호출 후 실제 예외 발생까지 시간이 걸립니다.
		System.out.println("videoThread 상태: " + videoThread.getState());
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		System.out.println("videoThread 상태: " + videoThread.getState());

		System.out.println("메인 스레드 종료");
	}

}
