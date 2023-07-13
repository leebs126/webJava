package sec02.ex04;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class RandomStreamTest {
	public static void main(String[] args) {
		IntStream intStream1 = new Random().ints(5);
		intStream1.forEach(System.out::println);
		System.out.println();
		
		IntStream intStream2 = new Random().ints(1, 50).limit(10);
		intStream2.forEach(s->System.out.print(s +", ") );//1에서 50까지의 랜덤수를 얻어와서, 10개를 출력합니다.
		System.out.println();
		System.out.println();
		
//		IntStream intStream3 = new Random().ints();
//		intStream2.forEach(System.out::println);
		
		DoubleStream doubleStream1 = new Random().doubles(5);
		doubleStream1.forEach(System.out::println);
				

	}

}
