package sec03.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class FileClientTest2 {

	public static void main(String[] args) {
		OutputStream os = null;
		PrintWriter writer = null;

		try {
			Class<FileClientTest2> clazz = FileClientTest2.class;
			String path = clazz.getResource("flowers.jpg").getPath();
//			System.out.println(path);

			File file = new File(path);
			System.out.println("파일 크기는:" + file.length());
			String fileName = file.getName();
			System.out.println(fileName);
			FileInputStream fis = new FileInputStream(file);
			
			Socket socket = new Socket("localhost", 9999);
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
			writer.close();
			os.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
