package sec01.ex01;

import java.util.Map;
import java.util.Set;

public class ThreadGroupTest1 {
	public static void main(String[] args) {
		TestThread testThread = new TestThread();
		testThread.setName("testThread");
		testThread.setDaemon(true);
		testThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		
		for(Thread t : threads) {
			System.out.println("스레드이름: " + t.getName());
			System.out.println("소속그룹: " + t.getThreadGroup().getName());
			System.out.println();
		}
	}

}
