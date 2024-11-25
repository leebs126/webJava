package sec04.ex06;

import java.util.HashMap;
import java.util.Map;


public class HashMapGenericTest {

	public static void main(String[] args) {
		Map<String, String> hMap1 = new HashMap<String, String>();
		hMap1.put("홍길동", "서울시");
		hMap1.put("이순신", "부산시");
		hMap1.put("차범근", "부산시");
		hMap1.put("유현진", "서울시");
//		hMap1.put("박지성",100);  //컴파일 에러가 발생합니다.

		String addr = hMap1.get("홍길동");
//		String addr2 = (String)hMap1.get("홍길동");  //다운캐스팅 할 필요가 없습니다.
//		String addr3 = (Integer)hMap1.get("홍길동");  //컴파일 에러가 발생합니다.
		System.out.println(addr);

		Map<String, Student> hMap2 = new HashMap<String, Student>();
		hMap2.put("서울시", new Student("이순신", 3));
		hMap2.put("부산시", new Student("홍길동", 2));
		hMap2.put("대구시", new Student("유현진", 1));
		
		Student s = hMap2.get("서울시");
//		Student s2 = (Student)hMap2.get("서울시");  //다운캐스팅 할 필요가 없습니다.
//		Student s3 = (College)hMap2.get("서울시");  //컴파일 에러가 발생합니다.
		System.out.println(s.toString());
	}

}
