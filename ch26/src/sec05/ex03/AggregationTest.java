package sec05.ex03;

import java.util.Arrays;

public class AggregationTest {
	public static void main(String[] args) {
		int[] scoreArr = {55, 66, 77, 88, 99};
		
		long count = Arrays.stream(scoreArr).count();
		System.out.println("count= " + count);
		
		count = Arrays.stream(scoreArr)
					  .filter(s -> s > 70)
					  .count();
		System.out.println("count= " + count);
		
		int sum = Arrays.stream(scoreArr)
						.filter(s -> s > 70)
						.sum();
		System.out.println("sum= " + sum);
		
		double scoreAvg = Arrays.stream(scoreArr)
				        .average()
				        .getAsDouble();
		System.out.println("average= " + scoreAvg);
		
		int max = Arrays.stream(scoreArr)
				        .max()
				        .getAsInt();
		System.out.println("max= " + max);
		
		int first = Arrays.stream(scoreArr)
				        .findFirst()
				        .getAsInt();
		System.out.println("first= " + first);
	}

}
