package sec04.ex07;

public class Horse extends Thread {
	@Override
	public void run() {
		String horseName = getName();
		try {
			while (true) {
				System.out.println(horseName + " 달립니다.");
				sleep(1);
			}
		} catch (InterruptedException e) {
				System.out.println("인터럽트로 경마를 멈춥니다.");
		}

	}
		
}
