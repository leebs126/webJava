package sec02.ex03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {

	public static void main(String[] args) {
		int data;
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			
			FileOutputStream fos = new FileOutputStream("src\\sec02\\ex03\\output.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "MS949");
			
			System.out.println("종료 하려면 q를 입력하세요");
			while(true) {
//				data = System.in.read();
				data = isr.read();
				if(data== 'q') break;
				osw.write(data);
				osw.flush();
				
			}
			
			osw.close();
			isr.close();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
