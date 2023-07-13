package sec04.ex02;

import java.util.Arrays;
import java.util.List;

public class FlapMapTest {
	public static void main(String[] args) {
		List<String> studentList = Arrays.asList("홍길동 2 80",
				                                 "이순신 3 77",
				                                 "손흥민 2 88");
		
		studentList.stream()
				.flatMap(element->Arrays.stream(element.split(" ")))
				.forEach(token -> System.out.println(token));

	}

}
