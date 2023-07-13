package sec02.ex03;

@FunctionalInterface
 interface MyFuncInterface {
	void methodA();
}

class MyMath{
	
	public void print() {
		System.out.println("print() 메소드 호출");
	}
}

public class InstanceMethodRefTest3{
	 public static void main(String[] args) {
		 MyMath myMath = new MyMath();
		 MyFuncInterface mfi3 = myMath::print;
		 mfi3.methodA();	
		 
		 
	 }

}