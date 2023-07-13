package sec03.ex01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Hello");
		set.add(new Integer(178));
		set.add(new Float(4.56F));
		set.add(new Student());

//		Object[] obj = set.toArray();
//		for (int i = 0; i < set.size(); i++) {
//			System.out.println(obj[i]);
//		}

		Iterator elements = set.iterator();
		while (elements.hasNext()) {
			System.out.println(elements.next());
		}

	}

}
