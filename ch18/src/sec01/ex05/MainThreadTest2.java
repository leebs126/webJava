package sec01.ex05;

public class MainThreadTest2 {

	public static void main(String[] args) {
		Thread curThread = Thread.currentThread();
		System.out.println("현재 실행 중인 쓰레드 객체 이름: " + curThread.getName());
		System.out.println("실행 중인 스레드 수:" + Thread.activeCount());
		System.out.println("메인 스레드 이름 : " + curThread.getName());
		
		int priority = curThread.getPriority();
		System.out.println("메인 스레드 우선 순위 : " + priority);
	}

}
