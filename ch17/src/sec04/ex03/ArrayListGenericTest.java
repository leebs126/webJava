package sec04.ex03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenericTest {
	public static void main(String[] args) {
		List<String> aList1 = new ArrayList<String>();
//		aList1.add(new Integer(100));  //문자열 외 다른 타입 객체는 저장할 수 없습니다.
		aList1.add("이순신");
		aList1.add("홍길동");
		aList1.add("손흥민");
		aList1.add("차범근");
		
		String name1= aList1.get(0);
//		String name1= (String)aList1.get(0);  //String 타입으로 다운캐스팅 할 필요 없습니다.
//		String name1= (Integer)aList1.get(0);  //다른 타입으로 다운캐스팅 시 에러를 발생시킵니다.
		for(int i = 0; i< aList1.size(); i++) {
			String name2 = aList1.get(i);
			System.out.println(name2);
		}
		System.out.println();
		
		List<Student> aList2 = new ArrayList<Student>();
		aList2.add(new Student("이순신", 3));
		aList2.add(new Student("홍길동", 2));
		aList2.add(new Student("손흥민", 1));
		
		// list.add(new Integer(123)); //다른 타입 저장 시 에러를 발생시킵니다.
		Student s1 = aList2.get(0);
		System.out.println(s1);
		System.out.println();
		// Student s = (Student)list.get(0);  //String 타입으로 다운캐스팅을 할 필요가 없습니다.
		// Student s = (Integer)list.get(0);  //다른 타입으로 다운캐스팅 시 에러가 발생합니다.
		
		for(int i= 0; i< aList2.size(); i++) {
			Student s2 = aList2.get(i);
			System.out.println(s2.toString());
		}
	}

}
