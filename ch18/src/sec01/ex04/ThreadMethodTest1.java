package sec01.ex04;

public class ThreadMethodTest1 {

	public static void main(String[] args) {
		Thread curThread = Thread.currentThread();
		System.out.println("현재 실행 중인 쓰레드 객체 이름: " + curThread.getName());
		System.out.println("실행 중인 스레드 수:" + Thread.activeCount());
		

		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					int i = 0;
					while (true) {
						if (i ==1) {
							break;
						}
						i++;
						System.out.println("현재 실행 중인 스레드 객체 이름: " + Thread.currentThread().getName());
						System.out.println("실행 중인 스레드 수: " + Thread.activeCount());

					}

				}
			});
			thread.setName("스레드-" + i);
			thread.start();
					
		}


	}

}
