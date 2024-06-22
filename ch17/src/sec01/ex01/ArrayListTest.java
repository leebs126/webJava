package sec01.ex01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List aList = new ArrayList();

		// #1. 객체 저장하기
		aList.add("홍길동");
		aList.add(new Integer(178));
		aList.add(new Student());
		System.out.println(aList.toString());
		System.out.println();

		// #2. 객체 얻기
//		String name = aList.get(0);
		String name = (String) aList.get(0);
		Integer num1 = (Integer) aList.get(1);
		Student student = (Student) aList.get(2);

		System.out.println("name = " + name);
		System.out.println(num1.intValue());
		System.out.println(student);
		System.out.println();

		// #3. 객체 수정하기
		aList.set(0, "hello");
		aList.set(1, new Float(3.14F));
		aList.set(2, new College());
		System.out.println(aList.toString());
		System.out.println();

		// #4. 객체 삭제하기
		aList.remove(1);
		System.out.println(aList.toString());

	}

}
