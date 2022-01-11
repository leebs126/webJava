package sec05.ex02;

public class SumMore1000Test {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;

		while (true) {
			sum += num;
			if (sum >= 1000)
				break;

			num++;
		}
		
		System.out.println("최초로 1000 이상이 되게 하는 자연수는 " + num);
		System.out.println("1에서 " + num +"까지의 합은 " + sum);
		
		

	}

}
