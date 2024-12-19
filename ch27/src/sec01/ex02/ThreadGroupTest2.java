package sec01.ex02;



public class ThreadGroupTest2 {
	public static void main(String[] args) {
		ThreadGroup myThreadGroup = new ThreadGroup("myThreadGroup");
        TestThread testThread1 = new TestThread(myThreadGroup, "testThread1");
        TestThread testThread2 = new TestThread(myThreadGroup, "testThread2");

        testThread1.start();
        testThread2.start();
        
        System.out.println("[main 스레드 그룹 ]");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();

        try{Thread.sleep(2000);}catch (InterruptedException e){}
        

        myThreadGroup.interrupt(); //main 스레드 그룹의 하위 "myThreadGroup" 스레드 그룹에 인터럽트를 호출합니다.
        System.out.println();
        
        try {Thread.sleep(5000);} catch (InterruptedException e) {}
        System.out.println();

        System.out.println("5초 후 main 종료");
	}

}
