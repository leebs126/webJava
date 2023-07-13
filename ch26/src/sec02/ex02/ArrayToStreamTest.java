package sec02.ex02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import sec02.ex01.Student;

public class ArrayToStreamTest {
	public static void main(String[] args) {
		Student[] stdArr = {
					new Student("홍길동", 2),
					new Student("이순신", 3),
					new Student("박찬호", 1),
					new Student("손흥민", 2)
		};
		Stream<Student> stdStream = Arrays.stream(stdArr);
		stdStream.forEach(s->System.out.println(s.getName()));
		System.out.println();
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(i->System.out.print(i +", "));
		
	}
}
