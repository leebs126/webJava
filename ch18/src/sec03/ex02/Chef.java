package sec03.ex02;

public class Chef extends Thread {
	Food food;

	public Chef(Food food) {
		this.food = food;
	}

	@Override
	public void run() {
		while (true) {
			food.makeFood();
		}
	}
}
