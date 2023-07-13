package sec04.ex06;



class   FileDownload implements Runnable{
	@Override
	public void run() {
		for(int i=0; i< 5; i++) {
			System.out.println("파일을 다운로드합니다.");
		}
		System.out.println("파일을 다운로드 받았습니다.");
		
	}
}

public class FileDownloadTest {
	public static void main(String[] args) {
		Thread thread = new Thread(new FileDownload());
		thread.start();
		
	}

}