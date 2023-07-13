package sec02.ex02;

public class Number {
	private int num;
	static int numCounter = 10;

	public static int getNumCounter() {
		return numCounter;
	}
	
	public static int getNumber() {
		int temp = 10 + numCounter; 
		return temp;
	}
	
	
//	public static int getNum() {
//		int result = num + 10;
//		return result;
//	}


	public Number() {
		num = numCounter;
	}

	public void incNum() {
		numCounter++;
	}

}
