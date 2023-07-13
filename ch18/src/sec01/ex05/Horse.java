package sec01.ex05;

public class Horse extends Thread{
	private int horseNum;

	public Horse(int horseNum) {
		this.horseNum = horseNum;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(horseNum + "번 경마  우선 순위 : " + getPriority());
		}
		System.out.println(horseNum + "번 경마 " + "결승선 도착");
	}

}
