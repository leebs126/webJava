package sec08.ex05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionLambdaTest {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 2));
		studentList.add(new Student("이순신", 1));
		studentList.add(new Student("손흥민", 2));
		studentList.add(new Student("차범근", 3));
		studentList.add(new Student("임꺽정", 2));


		// 1학년과 3학년 학생 이름만 출력
		studentList.removeIf(s -> s.getGrade() == 2);
		studentList.forEach(s -> System.out.println("이름:" + s.getName() +" ,학년: " + s.getGrade()));
		System.out.println();

	}

}
