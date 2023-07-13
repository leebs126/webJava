package sec02.ex07;

public class VideoThread extends Thread {
	public boolean stopped = false;

	public void run() {
		while(!stopped) {
			System.out.println("동영상을 재생합니다.");	
		}
		
		System.out.println("동영상 재생 강제 종료");
		
		
	}

	public void setStopped(boolean stopped) {
		this.stopped = stopped;
	}
}
