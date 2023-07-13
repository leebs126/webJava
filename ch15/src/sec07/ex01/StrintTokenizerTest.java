package sec07.ex01;

import java.util.StringTokenizer;

public class StrintTokenizerTest {

	public static void main(String[] args) {
		String data1 = "사과 바나나 수박 참외";
		StringTokenizer st1 = new StringTokenizer(data1);
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

		System.out.println();
		String data2 = "2033/05/22";
		StringTokenizer st2 = new StringTokenizer(data2, "/");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

	}

}
