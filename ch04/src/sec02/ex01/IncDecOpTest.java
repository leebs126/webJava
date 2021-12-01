package sec02.ex01;

public class IncDecOpTest {

	public static void main(String[] args) {
		int i = 0;
		i++;
		++i;
		System.out.println("i= " + i);
		System.out.println("i= " + ++i);
		System.out.println("i= " + i++);
		System.out.println("i= " + i);
		System.out.println();
		
		System.out.println(5 + ++i);
		System.out.println(5 + i++);
		System.out.println();
		
		int j = 5;
		j--;
		--j;
		System.out.println("j = " + j);
		System.out.println();
		
		
		int k = --j;
		System.out.println("j = " + j+ " , k =  " + k);
		
	}
}
