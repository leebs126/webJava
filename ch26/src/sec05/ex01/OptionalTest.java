package sec05.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalTest {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		
		//NoSuchElementException 발생
//		double scoreAvg = studentList.stream()
//								.mapToInt(s->s.getScore())
//								.average()
//								.getAsDouble();
		
		
		//1. isPresent() 사용하기
		OptionalDouble optional =studentList.stream() 
							.mapToInt(s->s.getScore())
							.average();
		
		if(optional.isPresent()) {
			System.out.println(optional.getAsDouble());
		}else {
			System.out.println("시험 점수를 입력하세요");
		}
		
		//2. orElse() 이용하기
		double scoreAvg =studentList.stream() 
									.mapToInt(s->s.getScore())
									.average()
									.orElse(0.0);
		System.out.println(scoreAvg);
		
		//3. ifPresent()에 람다식 이용하기
		studentList.stream() 
				.mapToInt(s->s.getScore())
				.average()
				.ifPresent(a->System.out.println(a));


	}

}
