package sec01.ex02;

public class Blue extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("청기 올려!!");
		}
	}
}
