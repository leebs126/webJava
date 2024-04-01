package sec05.ex02;

public class CallByValue {
	public static void main(String[] args) {
		int var1 = 100;
		CallByValue a = new CallByValue();
		int result = a.increase(var1);
		System.out.println("var1 : " + var1 +" , result: " + result);
		
	}
	
	public int increase(int val) {
		val++;
		return val;
	}

}


