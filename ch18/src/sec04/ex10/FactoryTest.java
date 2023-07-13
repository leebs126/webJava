package sec04.ex10;

public class FactoryTest {

	public static void main(String[] args) throws InterruptedException {
		Factory factory= new Factory();
		Thread producer = new Thread(factory);
		producer.setName("producer");
		
		Thread consumer = new Thread(factory);
		consumer.setName("consumner");

		producer.start();
		consumer.start();

	}

}
