package sec02.ex01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethodTest {
	public static void main(String[] args) {
		Map map = new HashMap();

		//객체 저장하기
		map.put(1, new Integer(100)); // 객체 저장 시 Object 타입으로 업캐스팅되어서 저장됩니다.
		map.put(2,new Float(3.5F));
		map.put("second", "hello");
		map.put("third", new Student());
		
		//객체의 갯수 얻기
		System.out.println(map.size());  // 4
		System.out.println();

		//객체 출력하기
		// Integer i =map.get(1);  //다운캐스팅을 하지 않으면 에러가 발생합니다.
		Integer num = (Integer) map.get(1);  // 100

		// String str=map.get("second"); //다운캐스팅을 하지 않으면 에러가 발생합니다.
		String str = (String) map.get("second");
		System.out.println(num);  // 100
		System.out.println(str);   // Hello World!
		System.out.println();

		Student st = (Student) map.get("third");
		System.out.println(st);   // 학번: 20220001 이름: 이순신 학년: 3
		System.out.println();

		System.out.println(map.get("third"));  // 학번: 20220001 이름: 이순신 학년: 3
		System.out.println(map.get("fourth")); // key가 존재하지 않으면 null을 출력합니다.
		System.out.println();
		
		//객체 수정하기
		System.out.println(map.toString());  // {1=100, 2=3.5, third=학번: 20220001 이름: 이순신 학년: 3, second=Hello World!}
		System.out.println(); 
		
		map.replace(1, new Integer(500));
		map.replace("second","자바 프로그래밍");
		map.replace(2, new  Float(3.5F), new Double(5.5));
		System.out.println(map.toString());  // {1=500, 2=5.5, third=학번: 20220001 이름: 이순신 학년: 3, second=자바 프로그래밍}
		System.out.println();
		
		//keySet 얻기
		Set keySet = map.keySet();
		System.out.println(keySet);  // [1, 2, third, second]
		System.out.println();
		
		//엔트리 얻기
		Set entrySet = map.entrySet();
		System.out.println(entrySet);  //[1=500, 2=5.5, third=학번: 20220001 이름: 이순신 학년: 3, second=자바 프로그래밍]
		System.out.println();
		
		//객체 제거하기
		map.remove(1);
		map.remove("second");
		System.out.println(map.toString());  // {2=5.5, third=학번: 20220001 이름: 이순신 학년: 3}
		System.out.println();
		
		//모든 객체 제거하기
		map.clear();
		System.out.println(map.toString());  // {}

	}

}
