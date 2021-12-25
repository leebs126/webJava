package sec03.ex01;

public class ClockTest {

	public static void main(String[] args) {

		for (int hour = 1; hour <= 12; hour++) {
			for (int min = 0; min < 60; min += 10) {
				System.out.println(hour + "시 " + min + "분");
			}
			System.out.println();
		}

	}

}
