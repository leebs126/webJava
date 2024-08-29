package sec02.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyTest3 {
	public static void main(String[] args) {
		long start, end, time; 
		start = System.currentTimeMillis();
		
		try {
			
			FileInputStream fis = new FileInputStream("src\\sec02\\ex02\\flowers.jpg");
			BufferedInputStream bis  = new BufferedInputStream(fis);
//			BufferedInputStream bis  = new BufferedInputStream(fis, 1024);

			FileOutputStream fos = new FileOutputStream("src\\sec02\\ex02\\flowers_copy3.jpg");
			BufferedOutputStream bos= new  BufferedOutputStream(fos);
//			BufferedOutputStream bos= new  BufferedOutputStream(fos, 1024);
			while (true) {
				int count = bis.read();
				if (count == -1)  break;
				bos.write(count);
			}

			bis.close();
			bos.close();
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
