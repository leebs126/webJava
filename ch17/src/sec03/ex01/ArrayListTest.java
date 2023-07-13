package sec03.ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List aList = new ArrayList();
		aList.add("Hello");
		aList.add(new Integer(178));
		aList.add(new Float(4.56F));
		aList.add(new Student());

//		for (int i = 0; i < aList.size(); i++) {
//			System.out.println(aList.get(i));
//		}

		Iterator iterator = aList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
