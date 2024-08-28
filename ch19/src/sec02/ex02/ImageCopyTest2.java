package sec02.ex02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyTest2 {
	public static void main(String[] args) {
		long start, end, time; 
		start = System.currentTimeMillis();
		
		try {
			FileInputStream fis = new FileInputStream("src\\sec02\\ex02\\flowers.jpg");
			FileOutputStream fos = new FileOutputStream("src\\sec02\\ex02\\flowers_copy2.jpg");
			byte[] buffer = new byte[1024];
			
			while (true) {
				int count = fis.read(buffer);
				if (count == -1)  break;
				fos.write(buffer, 0, count);
			}

			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		end = System.currentTimeMillis();
		time = end - start;
		System.out.println("복사 시간:" + time +"ms");

	}

}
