package sec01.ex02;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteDataReadTest3 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\test\\test1.txt");
			byte[] buffer = new byte[5];
			while (true) {
//				int count = fis.read(buffer, 0, 5); // 5개씩 읽어들인 후 배열 1번째 요소부터 저장합니다.
				int count = fis.read(buffer, 2, 3); // 3개씩 읽어들인 후 배열 3번째 요소부터 저장합니다.
				if (count == -1) break;

				for (int i = 0; i < count; i++) {
					System.out.print((char) buffer[i]);
				}
				
				System.out.print("\t count: " + count);
				System.out.println();
			}

			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
