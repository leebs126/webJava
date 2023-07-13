package sec04.ex01;

import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {

	public static void main(String[] args) {
		List aList = new ArrayList( );
		
		aList.add("홍길동");
		aList.add(new Integer(178));
		aList.add(new Student());
		
		String name = (String)aList.get(0);
		Integer integer = (Integer)aList.get(1);
		int num = integer.intValue();
		System.out.println(name);
		System.out.println(num);
		
		String s = (String)aList.get(2);  //ClassCastingException 
	}

}
