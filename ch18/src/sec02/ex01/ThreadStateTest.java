package sec02.ex01;

public class ThreadStateTest {
	public static void main(String[] args) {
		Thread.State state;
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				int i = 0; 
				while(true) {
					if(i > 100000) { 
						break;
					}
					i++;
				}
			}
		};
		
		state = thread.getState();
		System.out.println("스레드 상태: " + state);  //NEW
		
		thread.start();
		state = thread.getState(); 
		System.out.println("스레드 상태: " + state);  //RUNNABLE
		
		thread.interrupt();  //스레드를 강제 종료 시킵니다.
		
		//interrute() 메서드 호출 시 일단 대기 상태로 전환해서 종료합니다. 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		state = thread.getState();
		System.out.println("스레드 상태: " + state);  // TERMINATED
		
		System.out.println("메인 스레드 종료");

	}

}
