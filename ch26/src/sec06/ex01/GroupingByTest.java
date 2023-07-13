package sec06.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByTest {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길순", 2, 70, Student.FEMALE));
		studentList.add(new Student("이순신", 3, 80, Student.MALE));
		studentList.add(new Student("박세리", 1, 90, Student.FEMALE));
		studentList.add(new Student("손흥민", 2, 100, Student.MALE));
		studentList.add(new Student("김연아", 3, 100, Student.FEMALE));
		studentList.add(new Student("류현진", 1, 78, Student.MALE));
		studentList.add(new Student("차범근", 1, 77, Student.MALE));
		
		Map<Integer, List<Student>> stdGroupByGrade = studentList.stream()
								.collect(Collectors.groupingBy(Student::getGrade));
		
		stdGroupByGrade.forEach((k, v)-> {
			v.stream().forEach(s->System.out.println(s.toString()));
		});
		System.out.println();
		
		Map<Integer, Map<Integer, List<Student>>> stdGroupByGradeGender = studentList.stream()
				.collect(Collectors.groupingBy(Student::getGrade, 
						                        Collectors.groupingBy(Student::getGender)));

		stdGroupByGradeGender.forEach((k, v)-> {
			v.forEach((k1, v1)->{
				v1.stream().forEach(s->System.out.println(s.toString()));
			});
				
		});
		
	}

}
