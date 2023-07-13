package sec02.ex03;

import java.util.stream.IntStream;

public class IntStreamRangeClosedTest {
	static int sum = 0;

	public static void main(String[] args) {

		IntStream intStream1 = IntStream.range(0, 100); // 100이 포함되지 않습니다.
		IntStream intStream2 = IntStream.rangeClosed(0, 100); // 100이 포함됩니다.
		intStream1.forEach(i -> sum += i);
		System.out.println("총합: " + sum);

		intStream2.forEach(i -> sum += i);
		System.out.println("총합: " + sum);

	}

}
