package sec02.ex03;

public class DoWhileSumFrom1To5Test {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			System.out.println("i = " + i + ", sum = " + sum);
			i++;
		}while(i <= 5);
		

		System.out.println("1에서 100까지의 합 = " + sum);


//		while (i <= 100) {
//			sum += i;
//			System.out.println("i = " + i + ", sum = " + sum);
//			i++;
//		}
//
//		System.out.println("1에서 100까지의 합 = " + sum);

//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//			System.out.println("i = " + i + ", sum = " + sum);
//		}
//
//		System.out.println("1에서 100까지의 합 : " + sum);

	}

}
