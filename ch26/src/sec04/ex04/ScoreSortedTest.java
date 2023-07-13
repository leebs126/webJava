package sec04.ex04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ScoreSortedTest {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 2, 70));
		studentList.add(new Student("이순신", 3, 80));
		studentList.add(new Student("박찬호", 1, 90));
		studentList.add(new Student("손흥민", 2, 100));
		studentList.add(new Student("차범근", 3, 77));
		studentList.add(new Student("임꺽정", 1, 88));
		
		studentList.stream()
			.sorted()
			.forEach(s->System.out.print(s.getScore()+", "));
		System.out.println();
		
		studentList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s->System.out.print(s.getScore()+", "));

	}

}
