package sec03.ex01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map scoreMap = new HashMap();
		scoreMap.put("이순신", 90);
		scoreMap.put("홍길동", 80);
		scoreMap.put("임꺽정", 88);
		scoreMap.put("이순신", 77);

		Set scoreSet = scoreMap.keySet();
//		Object[] obj = scoreSet.toArray();
//		for (int i = 0; i < obj.length; i++) {
//			String key = (String) obj[i];
//			System.out.println(key + " = " + scoreMap.get(key));
//		}
		
		Iterator iterator1 = scoreSet.iterator();
		while (iterator1.hasNext()) {
			String key = (String)iterator1.next();
			System.out.println(key + " = "  + scoreMap.get(key));
		}
		
		System.out.println();

		Map studentMap = new HashMap();
		studentMap.put(new Student("20220001", "이순신", 3), 80);
		studentMap.put(new Student("20220001", "이순신", 3), 90);
		studentMap.put(new Student("20220002", "홍길동", 3), 77);
		studentMap.put(new Student("20220002", "홍길동", 3), 88);
		
		Set studentSet = studentMap.keySet();
//		obj = studentSet.toArray();
//		for (int i = 0; i < obj.length; i++) {
//			Student key = (Student) obj[i];
//			System.out.println(key.hakbun + " = " + studentMap.get(key));
//		}
		
		Iterator iterator2 = studentSet.iterator();
		while (iterator2.hasNext()) {
			Student key = (Student)iterator2.next();
			System.out.println(key.hakbun + " = "  + studentMap.get(key));
		}
		
		
	}

}
