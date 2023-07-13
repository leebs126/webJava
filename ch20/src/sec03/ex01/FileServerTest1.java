package sec03.ex01;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServerTest1 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		FileOutputStream fos = null;

		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("서버 실행 중...");

			while (true) {
				socket = serverSocket.accept();
				is = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));

				String fileName = br.readLine();
				System.out.println(fileName);

				fos = new FileOutputStream("c:\\test\\" + fileName);

				
				long begin = System.currentTimeMillis();

				while (true) {
					int data = is.read();  //1바이트씩 읽어와서 파일로 출력합니다. 
					if (data == -1) 
						break;
					fos.write(data);
					fos.flush();
				} // end while
				
				long end = System.currentTimeMillis();
				System.out.println("업로드 시간 :" + (end - begin) + "ms입니다.");

				br.close();
				fos.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
