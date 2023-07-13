package sec08.ex04;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<Student> consumer1;
		Consumer<Student> consumer2;
		
		consumer1 = s-> System.out.println("이름: " + s.getName());
		consumer1.accept(new Student("홍길동", 2) );
		
		consumer2 = s-> System.out.println("이름: " + s.getName() +", 학년: " + s.getGrade());
		consumer2.accept(new Student("이순신", 3) );
	}
}
