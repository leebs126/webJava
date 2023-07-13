package sec06.ex02;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForTest2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student());
		list.add(new Student("홍길동", 2));
		list.add(new Student("임꺽정", 2));
		list.add(new Student("차범근", 3));
		list.add(new Student("유현진", 3));
		
		System.out.println("\n향상된 for문으로 출력하기");
		System.out.println("-----------------------------------");
		for (Student st : list) {
			System.out.println(st);
		}

	}

}
