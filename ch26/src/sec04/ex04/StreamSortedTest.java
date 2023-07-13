package sec04.ex04;

import java.util.Arrays;
import java.util.List;

public class StreamSortedTest {
	public static void main(String[] args) {
		List<Integer> scoreList = Arrays.asList(77, 67, 88, 98, 73, 68);
		scoreList.stream()
			.sorted()
			.forEach(System.out::println);
	}
}
