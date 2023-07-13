package sec08.ex01;

import java.util.Arrays;
import java.util.List;

public class FruitTest {
	public static void main(String[] args) {
		List<String> fruitList = Arrays.asList("apple","banana","apple","mango","strawberry","banana", "mango");
		fruitList.stream()
				.filter(s->s.charAt(0) =='a')
				.distinct()
				.forEach(a->System.out.println(a));

	}

}
