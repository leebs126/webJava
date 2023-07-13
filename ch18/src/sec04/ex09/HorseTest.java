package sec04.ex09;

public class HorseTest {
	public static void main(String[] args) throws InterruptedException {
		Horse horse1 = new Horse();
		horse1.setName("경마1");
		
		Horse horse2 = new Horse();
		horse2.setName("경마2");
		
		Horse horse3 = new Horse();
		horse3.setName("경마3");
		
		
		horse1.start();
		Thread.sleep(1000);
		horse2.start();
		Thread.sleep(1000);
		horse3.start();
		Thread.sleep(1000);
		
		
	}
	
}
