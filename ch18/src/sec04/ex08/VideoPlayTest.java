package sec04.ex08;

public class VideoPlayTest {
	public static void main(String[] args) {
		Thread videoThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i< 5;i++) {
					System.out.println("동영상을 재생합니다.");
				}
				System.out.println("동영상 재생 종료");
			}
		});
		
		videoThread.start();

	}

}
