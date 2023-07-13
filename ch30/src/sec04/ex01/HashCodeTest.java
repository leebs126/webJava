package sec04.ex01;

import java.util.Objects;

public class HashCodeTest {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 1, 90);
		Student s2 = new Student("홍길동", 1, 90);
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}

	static class Student{
		String name;
		int grade;
		int score;
		public Student(String name, int grade, int score) {
			this.name = name;
			this.grade = grade;
			this.score = score;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(name, grade, score);
		}
		
		
	}
	
}


