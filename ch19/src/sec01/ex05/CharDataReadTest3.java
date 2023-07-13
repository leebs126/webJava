package sec01.ex05;

import java.io.FileReader;
import java.io.IOException;

public class CharDataReadTest3 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:\\test\\test4.txt");
			char[] buffer = new char[5];
			
			while(true) {
//				int count = reader.read(buffer, 0, 5);
				int count = reader.read(buffer, 2, 3);
				
				if(count == -1) break;
				for(int i=0 ; i < count; i++) {
					System.out.print((char)buffer[i]);
					
				}
				System.out.print("\t count: " + count);
				System.out.println();
			}
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
