package sec03.ex02;

public class Waitor extends Thread {
	Food food;

	public Waitor(Food food) {
		this.food=food;
	}

	@Override
	public void run() {
		while (true) {
			food.receiveOrder();
		}
	}
}
