package sec02.ex03;

public class Horse extends Thread {
	private int horseNum;
	boolean yieldFlag;

	public Horse(int horseNum) {
		this.horseNum = horseNum;
	}

	public void run() {
		while (true) {
			if (yieldFlag) {
				
				System.out.println(horseNum +"번 경마가 지나갑니다.");
				try { Thread.sleep(1000); } catch (InterruptedException e) {}

				Thread.yield();  //실행 중인 스레드는 실행 대기로 전환됩니다.
				yieldFlag =false;
			} else {
				yieldFlag =true;
				for (int i = 0; i < 1000000000; i++) {}
				
			}
		}

	}

}
