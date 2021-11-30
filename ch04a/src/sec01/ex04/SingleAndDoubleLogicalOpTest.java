package sec01.ex04;

public class SingleAndDoubleLogicalOpTest {

	public static void main(String[] args) {
		int a = 0;
		int b = 10;
		int c = 0;
		
//		System.out.println((a != 0) && ((c = b) > 20));  //false && 
//		System.out.println("c = " + c);
		
//		System.out.println((a != 0) & ((c = b) > 20));  //false & false
//		System.out.println("c = " + c);
		
		c = 0;
		System.out.println((a == 0) || ((c = b) > 20));  // true ||  
		System.out.println("c = " + c);
		
		System.out.println((a == 0) | ((c = b) > 20));  // true |  false
		System.out.println("c = " + c);
		
		
		

	}

}
