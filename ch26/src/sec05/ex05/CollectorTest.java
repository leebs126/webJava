package sec05.ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorTest {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길순", 2, 70, Student.FEMALE));
		studentList.add(new Student("이순신", 3, 80, Student.MALE));
		studentList.add(new Student("박세리", 1, 90, Student.FEMALE));
		studentList.add(new Student("손흥민", 2, 100, Student.MALE));
		studentList.add(new Student("김연아", 3, 100, Student.FEMALE));
		
		//List를 배열로 변환
		Student[] stdArr = studentList.stream().toArray(Student[]::new);
		Arrays.stream(stdArr).forEach(s->System.out.println(s.toString()));
		System.out.println();
		
		//여학생만 List로 저장 후 출력
		List<Student> femaleList = studentList.stream()
										.filter(s->s.getGender() ==Student.FEMALE)
										.collect(Collectors.toList());
		femaleList.stream()
				.forEach(s->System.out.println(s.getName()));
		System.out.println();
		
		//남학생들만 HashSet으로 출력
		
		Set<Student> maleList = studentList.stream()
										.filter(s->s.getGender() == Student.MALE)
										.collect(Collectors.toCollection(HashSet::new));
		maleList.stream()
				.forEach(s->System.out.println(s.getName()));
		System.out.println();
		
		// (이름, Student 객체)로 저장
		Map<String, Student> studentMap = studentList.stream()
												.collect(Collectors.toMap(s->s.getName(), s->s));
		
		studentMap.forEach((k,v)->System.out.println(k +", " + v.getScore()));
		
		
		
	}

}
