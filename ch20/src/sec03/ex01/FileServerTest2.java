package sec03.ex01;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServerTest2 {
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

				byte[] buffer = new byte[1024 * 8];
				long begin = System.currentTimeMillis();

				while (true) {
					int count = is.read(buffer); // 버퍼에 읽어들인 문자개수
					if (count == -1) // 버퍼의 마지막에 도달했는지 체크
						break;
					fos.write(buffer, 0, count);
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
