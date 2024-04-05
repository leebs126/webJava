package sec04.ex08;

public class HorseTest {
	public static void main(String[] args) {

		Horse horse1 = new Horse();
		horse1.setName("경마1");
		horse1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		horse1.interrupt();
	}

}
