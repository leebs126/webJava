package sec01.ex06;

import java.util.HashSet;
import java.util.Set;



public class HashSetTest3 {
	public static void main(String[] args) {
		Set set = new HashSet();


		Student s1 = new Student("20220002", "홍길동", 2);
		System.out.println(s1.hashCode());  
		
		set.add(s1);
		set.add("hello");
		set.add(new Integer(178));
		set.add(new Float(4.56F));
		set.add("hello");
		set.add(new Integer(178));
		
		Student s2 = new Student("20220002", "홍길동", 2);
		System.out.println(s2.hashCode());  
		set.add(s2);

		Object[] obj = set.toArray();
		for (int i = 0; i < set.size(); i++) {
			System.out.println(obj[i]);
		}
		System.out.println(set);

	}

}
