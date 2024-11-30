package sec02.ex04;

@FunctionalInterface
 interface MyFuncInterface {
	double methodA();
}


public class StaticMethodRefTest1{
	 public static void main(String[] args) {
		 MyFuncInterface mfi = Math::random;
		 double result = mfi.methodA();
		 System.out.println(result);
	 }

}