package sec01.ex05;

public class HorseRaceTest2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread horse = new Horse(i);
			horse.start();
			
			if(i == 9) {
				horse.setPriority(Thread.MAX_PRIORITY);
			}
		}
		System.out.println("메인 스레드 종료");
	}

}
