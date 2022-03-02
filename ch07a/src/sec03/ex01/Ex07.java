package sec03.ex01;

import java.util.Scanner;

public class Ex07 {

//	7.	소수의 갯수는 무한히 많습니다. 키보드로 입력한 양의 정수번째 소수를 출력하는 메소드를 구현해 보세요.
//	(키보드로 50을 입력하면 50번째 소수를 출력합니다)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소수의 순서를 입력하세요 : ");
		int order = sc.nextInt();

		Ex07 m = new Ex07();
		m.calcPrimeOrder(order);

	}

	public void calcPrimeOrder(int _order) {
		// 1. 지역 변수 선언
		int order = 0; // 소수의 순서 저장 변수
		int num = 2;
		int count = 0; // 약수의 갯수를 저장하는 변수

		// 2. 기능 구현

		while (true) {
			// . 소수 판별
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				order++;
			}

			if (order == _order) {
				System.out.println(_order + " 번째 소수 : " + num);
				break;
			} else {
				count = 0;
				num++;
			}

		}

		// 3. 결과 출력

	}

}
