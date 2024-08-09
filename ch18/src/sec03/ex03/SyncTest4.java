package sec03.ex03;

public class SyncTest4 {
	Object  objKey = new Object();  
	
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



	
	public synchronized void method1() {
		System.out.println("\n method1() 메소드");

		System.out.println("실행 스레드: " + Thread.currentThread().getName());
		System.out.println("thread1: " + t1.getState());
		System.out.println("thread2: " + t2.getState());
		for (long j = 0; j < 100000000000L; j++) {}
	}


	public void method2() {
		synchronized(objKey) {
			System.out.println("\n method2() 메소드");
			System.out.println("실행 스레드: " + Thread.currentThread().getName());
			System.out.println("thread1: " + t1.getState());
			System.out.println("thread2: " + t2.getState());
			for (long j = 0; j < 100000000000L; j++) {}
		}
	}

	

	void startAll() {
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		SyncTest4 st = new SyncTest4();
		st.startAll();
	}

}
