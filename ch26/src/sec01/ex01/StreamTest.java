package sec01.ex01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		List<String> fruitList1 = Arrays.asList("apple","banana","orange","mango","strawberry");
		Iterator<String> iterator = fruitList1.iterator();
		while(iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println(fruit);
		}
		System.out.println();
		
		//Stream을 사용할 경우
		List<String> fruitList2 = Arrays.asList("apple","banana","orange","mango","strawberry");
		Stream<String> fruitStream2 = fruitList2.stream();
		fruitStream2.forEach(fruit->System.out.println(fruit));
		

	}

}
