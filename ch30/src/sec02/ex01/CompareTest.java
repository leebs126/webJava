package sec02.ex01;

import java.util.Objects;

public class CompareTest {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 1, 80);
		Student s2 = new Student("이순신", 2, 88);
		Student s3 = new Student("임꺽정", 1, 77);
		
		int result1 = Objects.compare(s1, s2, new ScoreComparator());
		System.out.println(result1);
		
		int result2 = Objects.compare(s1, s3, new ScoreComparator());
		System.out.println(result2);
		

	}

}
