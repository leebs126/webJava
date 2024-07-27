package sec02.ex05;

public class VideoThread extends Thread {

	public VideoThread() {
	}

	public void run() {
		try {
			
			while(true) {
				System.out.println("동영상을 재생합니다.");
				Thread.sleep(1);
			}
			
		} catch (InterruptedException e) {
			System.out.println("interrupt() 호출에 의한 동영상 종료");
		}
	}
}
