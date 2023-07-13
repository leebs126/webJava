package sec03.ex01;

import java.util.Random;
import java.util.stream.IntStream;

public class ParallelTest {
	public static void main(String[] args) {
		int cores = Runtime.getRuntime().availableProcessors();
		System.out.println("코어개수: " + cores);
		System.out.println();
		
		IntStream intStream1 = new Random().ints(1, 5000).limit(10).sorted();
		intStream1.forEach(s->{
			Thread thread = Thread.currentThread();
			System.out.println(s +" - " + thread.getName());
		});
		System.out.println();
		
		IntStream intStream2 = new Random().ints(1, 5000).limit(100).sorted();
		intStream2.parallel().forEach(s->{
			Thread thread = Thread.currentThread();
			System.out.println(s +" - " + thread.getName());
		});

	}

}
