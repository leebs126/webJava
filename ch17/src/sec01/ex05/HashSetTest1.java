package sec01.ex05;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest1 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("hello");
		set.add(new Integer(178));
		set.add(new Float(4.56F));
		set.add("hello");
		set.add(new Integer(178));
		
		Object[] obj = set.toArray();
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		System.out.println();
		
		
		set.remove(new Integer(178));
		System.out.println(set);
		System.out.println();
		
		set.clear();
		System.out.println(set);
		System.out.println();
		
		if(set.isEmpty()) {
			System.out.println("저장된 객체가 없습니다.");
		}

	}

}
