package sec05.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("홍길동", 20));
		studentList.add(new Student("이순신", 14));
		studentList.add(new Student("차범근", 17));
		studentList.add(new Student("손흥민", 13));
		
		//정렬전
		for(Student student: studentList) {
			System.out.println(student);
		}
			
		Comparator comparator = (o1, o2)->((Student)o1).getAge() - ((Student)o2).getAge();
		Collections.sort(studentList,comparator);
		System.out.println();
		
		//정렬후
		for(Student student: studentList) {
			System.out.println(student);
		}
				

	}

}
