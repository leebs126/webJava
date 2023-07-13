package sec03.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipelineTest {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 2, 70));
		studentList.add(new Student("이순신", 3, 80));
		studentList.add(new Student("박찬호", 1, 90));
		studentList.add(new Student("손흥민", 2, 100));
		studentList.add(new Student("차범근", 3, 77));
		studentList.add(new Student("임꺽정", 1, 88));
		
		Stream<Student> stdStream = studentList.stream();
		Stream<Student> gradeStream = stdStream.filter(s->s.getGrade()== 2);
		IntStream scoreStream = gradeStream.mapToInt(Student::getScore);
		 OptionalDouble optionalDouble= scoreStream.average();
		 double avgScore1 = optionalDouble.getAsDouble();
		 System.out.println("2학년 평균 점수: " + avgScore1);
		 
		 
		 double avgScore2 = studentList.stream()
					.filter(s->s.getGrade()== 3)
			 		.mapToInt(Student::getScore)
			 		.average()
			 		.getAsDouble();
			 System.out.println("3학년 평균: " + avgScore2);
		
		

	}

}
