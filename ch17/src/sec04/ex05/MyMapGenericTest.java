package sec04.ex05;

public class MyMapGenericTest {
	public static void main(String[] args) {
		MyMap<String, String> myMap1 = new MyMap<String, String>();
		myMap1.put("홍길동", "서울시");
//		myMap1.put("홍길동", new Integer(200)); 다른 타입을 value로 사용하면 컴파일 에러가 발생합니다.
		String addr = myMap1.get("홍길동");
//		String addr = (Integer)myMap1.get("홍길동");  //다른 타입으로 다운캐스팅하면 컴파일 에러가 발생합니다.
		System.out.println(addr);
		
		MyMap<Integer, String> myMap2 = new MyMap<Integer, String>();
		myMap2.put(100, "사과");
//		myMap2.put("바나나", 200 ); 다른 타입을 key와 value로 사용하면 컴파일 에러가 발생합니다.
		String fruit = myMap2.get(100);
//		String fruit = (Integer)myMap2.get(100);  //다른 타입으로 다운캐스팅하면 컴파일 에러가 발생합니다.
		System.out.println(fruit);
		
		MyMap<String, Student> myMap3 = new MyMap<String, Student>();
		myMap3.put("서울시", new Student("이순신", 3));
//		myMap3.put("부산시",new College());  //다른 타입 객체를 value로 사용하면 컴파일 에러가 발생합니다.
		Student s = myMap3.get("서울시");
//		Student s = (String)myMap3.get("서울시");  //다른 타입으로 다운캐스팅하면 컴파일 에러가 발생합니다.
		System.out.println(s.toString());

	}

}
