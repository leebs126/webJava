package sec04.ex01;

import java.util.Random;
import java.util.stream.IntStream;

public class ParallelTest {

	public static void main(String[] args) {
		double avg = 0.0;
		long startTime = 0;
		long endTime = 0;
		long workTime = 0;
		
		IntStream intStream1 = new Random().ints(1, 100000000).limit(100000000).sorted();
		IntStream intStream2 = new Random().ints(1, 100000000).limit(100000000).sorted();

		
		
		startTime = System.currentTimeMillis();
		avg = intStream1.average().getAsDouble();
		
		endTime = System.currentTimeMillis();
		workTime = endTime - startTime;
		System.out.println("intStream1 평균: " + avg+", 작업시간: " + workTime +"ms" );
		
		startTime = System.currentTimeMillis();
		avg = intStream2.parallel().average().getAsDouble();
		endTime = System.currentTimeMillis();
		workTime = endTime - startTime;
		System.out.println("intStream2 평균: " + avg+", 작업시간: " + workTime +"ms" );
		
	}

}
