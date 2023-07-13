package sec05.ex04;

import java.util.ArrayList;
import java.util.List;


public class ReduceTest {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 2, 70));
		studentList.add(new Student("이순신", 3, 80));
		studentList.add(new Student("박찬호", 1, 90));
		studentList.add(new Student("손흥민", 2, 100));
		
		int total1 = studentList.stream()
							.mapToInt(Student::getScore)
							.sum();
		System.out.println(total1);
		
		
		int total2= studentList.stream()
							.map(Student::getScore)
							.reduce((a,b) -> a + b)
							.get();
		System.out.println(total2);
		
		
		int total3 = studentList.stream()
							.map(Student::getScore)
							.reduce(0, (a,b) -> a + b);
		System.out.println(total3);
		
		

	}

}
