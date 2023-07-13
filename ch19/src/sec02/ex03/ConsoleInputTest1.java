package sec02.ex03;

import java.io.IOException;

public class ConsoleInputTest1 {

	public static void main(String[] args) {
		int data;
		try {
			while (true) {
				data = System.in.read();
//				 System.out.print("keyCode: " + data );
				System.out.print((char) data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
