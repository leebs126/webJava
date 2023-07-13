package sec04.ex01;

import java.util.Arrays;
import java.util.List;


public class DistinctAndFilterTest {
	public static void main(String[] args) {
	List<String> fruitList = Arrays.asList("apple","banana","apple","mango","strawberry","banana", "mango");

	fruitList.stream()
	   .distinct()
	   .forEach(System.out::println);
	System.out.println();
	
	
	fruitList.stream()
		.filter(s->s.length()  < 6)
		.forEach(System.out::println);
	System.out.println();
	
	fruitList.stream()
	   .distinct()
	   .filter(s->s.length() < 6)
	   .forEach(System.out::println);
	
	}
	
}
