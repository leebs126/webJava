package sec04.ex05;

import java.util.Arrays;
import java.util.List;

public class PeekTest {

	public static void main(String[] args) {
		List<String> fruitList = Arrays.asList("apple","banana","apple","mango","strawberry","banana", "mango");
		
		//최종 처리 메소드가 호출되어야 중간 처리 메소드가 실행됩니다.
//		fruitList.stream()
//		.distinct()
//		.filter(s -> s.length() < 8)
//		.peek(a->System.out.println(a));

		
		fruitList.stream()
			.distinct()  					//"apple", "banana", "mango", "strawberry" 
			.filter(s -> s.length() < 8)    // "apple", "banana", "mango"
			.peek(a->System.out.println(a))
			.filter(s -> s.startsWith("a"))
			.peek(a->System.out.println(a))
			.forEach(System.out::println);
		
			
	}

}
