package sec01.ex03;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		List vList = new Vector();

		// #1. 객체 저장하기
		vList.add("홍길동");
		vList.add(new Integer(178));
		vList.add(new Student());
		System.out.println(vList.toString());
		System.out.println();

		// #2. 객체 얻기
//		String name = aList.get(0);
		String name = (String) vList.get(0);
		Integer num1 = (Integer) vList.get(1);
		Student student = (Student) vList.get(2);

		System.out.println("name = " + name);
		System.out.println(num1.intValue());
		System.out.println(student);
		System.out.println();
		// #3. 객체 수정하기

		vList.set(0, "hello");
		vList.set(1, new Float(3.14));
		vList.set(2, new College());
		System.out.println(vList.toString());
		System.out.println();

		// #4. 객체 삭제하기
		vList.remove(1);
		System.out.println(vList.toString());

	}

}
