package sec05.ex03;

import java.util.Scanner;

public class DigitSumOfNumberTest {

//	①	양의 정수를 10으로 나누어서 나머지를 구한 후, 변수(remainder)에 저장합니다.
//	②	양의 정수를10으로 나누어서 몫을 변수(mok)에 저장합니다.
//	③	② 과정에서 얻은 몫(mok)이 0이 아니면 ① 과정과 ②과정을 반복 수행합니다. 
//	④	몫(mok)이 0이면 종료합니다.
	
	public static void main(String[] args) {
		int num = 0, remainder = 0, mok = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수를 입력하세요");
		System.out.print("num = ");
		num = sc.nextInt();  //123
		
		mok = num;
		while(true) {
			remainder += mok % 10;
			mok = mok / 10;
			
			if(mok == 0)
				break;
		}
		
		System.out.println(num +"의 자리수의 합은 " +remainder);
		

	}

}
