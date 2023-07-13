package sec05.ex01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServerTest {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		OutputStream os = null;
		PrintWriter writer = null;

		serverSocket = new ServerSocket(9999);
		System.out.println("서버 실행 중...");
		
		while (true) {
			socket = serverSocket.accept();

			File file = new File("src\\sec05\\ex01\\flowers.jpg");
			System.out.println("파일 크기는:" + file.length());
			
			String fileName = file.getName();

			FileInputStream fis = new FileInputStream(file);

			os = socket.getOutputStream();

			writer = new PrintWriter(os, true);
			writer.println(fileName);

			byte[] buffer = new byte[1024 * 8];

			while (true) {
				int count = fis.read(buffer); // 버퍼에 읽어들인 문자개수
				if (count == -1)
					break;

				os.write(buffer, 0, count);
				os.flush();
			}

			System.out.println("파일을 전송했습니다.");
			fis.close();
//			writer.close();
			os.close();
//			socket.close();
		}

	}

}
