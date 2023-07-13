package sec03.ex04;

public class Chef extends Thread {
	Food food;

	public Chef(Food food) {
		this.food = food;
	}

	@Override
	public void run() {
	
		//Waitor 스레드가 먼저 시작하도록 약간 딜레이를 줍니다. 
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		
		while (true) {
			food.makeFood();

		}
	}
}
