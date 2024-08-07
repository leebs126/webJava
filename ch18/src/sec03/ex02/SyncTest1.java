package sec03.ex02;

public class SyncTest1 {
	Thread t1 = new Thread("thread1") {
		@Override
		public void run() {
			method1();
		}
	};
	Thread t2 = new Thread("thread2") {
		@Override
		public void run() {
			method2();
		}
	};

	Thread t3 = new Thread("thread3") {
		@Override
		public void run() {
			method3();
		}
	};

	public synchronized void method1() {
		System.out.println("method1() 메서드");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		System.out.println("실행 스레드: " + Thread.currentThread().getName());
		System.out.println("thread1: " + t1.getState());
		System.out.println("thread2: " + t2.getState());
		System.out.println("thread3: " + t3.getState());
		for (long  i = 0; i < 100000000000L; i++) {
		} // 시간 지연
	}

	public synchronized void method2() {
		System.out.println("method2() 메서드");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		System.out.println("실행 스레드: " + Thread.currentThread().getName());
		System.out.println("thread1: " + t1.getState());
		System.out.println("thread2: " + t2.getState());
		System.out.println("thread3: " + t3.getState());
		for (long i = 0; i < 100000000000L; i++) {
		} // 시간 지연
	}

	public synchronized void method3() {
		System.out.println("method3() 메서드");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		System.out.println("실행 스레드: " + Thread.currentThread().getName());
		System.out.println("thread1: " + t1.getState());
		System.out.println("thread2: " + t2.getState());
		System.out.println("thread3: " + t3.getState());
		for (long i = 0; i < 100000000000L; i++) {
		} // 시간 지연
	}

	void startAll() {
		t1.start();
		t2.start();
		t3.start();
	}

	public static void main(String[] args) {
		SyncTest1 st = new SyncTest1();
		st.startAll();

	}

}
