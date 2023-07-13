package sec01.ex03;

public class Blue implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println("청기 올려!!");
		}
	}
}
