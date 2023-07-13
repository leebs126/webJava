package sec05.ex01;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileClientTest {
	public static void main(String[] args)  {
		Socket socket = null;
		InputStream is = null;
		FileOutputStream fos = null;
		
		try {
			socket = new Socket("121.168.202.151", 9999);

			is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String fileName = br.readLine();
			System.out.println(fileName);

//			fos = new FileOutputStream("c:\\test\\" + fileName);
			fos = new FileOutputStream("c:\\test\\" + "test.jpg");

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
			System.out.println("다운로드 시간 :" + (end - begin) + "ms입니다.");

			br.close();
			fos.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
