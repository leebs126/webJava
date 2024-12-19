package sec01.ex02;

public class TestThread extends Thread {
	
	public TestThread(ThreadGroup threadGroup, String threadName) {
		 super(threadGroup, threadName); // 스레드 그룹과  스레드 이름 설정
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName()+ "스레드 인터럽트 발생");
				break;
			}
		}
		
		System.out.println(getName() + " 종료");
	}

}
