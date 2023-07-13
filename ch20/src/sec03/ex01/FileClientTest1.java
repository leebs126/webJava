package sec03.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class FileClientTest1 {

	public static void main(String[] args) {
		OutputStream os = null;
		PrintWriter writer = null;

		try {
			Class<FileClientTest1> clazz = FileClientTest1.class;
			String path = clazz.getResource("flowers.jpg").getPath();
//			System.out.println(path);

			File file = new File(path);
			System.out.println("파일 크기는:" + file.length());
			String fileName = file.getName();
//			System.out.println(fileName);
			FileInputStream fis = new FileInputStream(file);
			
			Socket socket = new Socket("localhost", 9999);
			os = socket.getOutputStream();
			
			writer = new PrintWriter(os, true);
			writer.println(fileName);
			

			while (true) {
				int data = fis.read(); // 버퍼에 읽어들인 문자개수
				if (data == -1)
					break;

				os.write(data);
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
