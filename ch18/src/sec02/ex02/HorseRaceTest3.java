package sec02.ex02;

public class HorseRaceTest3 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread horse = new Horse(i+1);
			horse.start();
		}
		System.out.println("메인 스레드 종료");
	}

}
