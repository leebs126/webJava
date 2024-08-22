package sec01.ex03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest1 {

	public static void main(String[] args) {
		try {
			InputStream fis = new FileInputStream("C:\\test\\test1.txt");
			OutputStream fos = new FileOutputStream("C:\\test\\test1_copy.txt");
			byte[] buffer = new byte[5];
			while (true) {
				int count = fis.read(buffer); // 버퍼에 읽어들인 문자 개수

				if (count == -1)  break; // 버퍼의 마지막에 도달했는지 체크

				fos.write(buffer);
			}
			System.out.println("파일을 복사했습니다.");
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
