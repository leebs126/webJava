package sec05.ex02;

public class SumMore1000Test {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		//1. 변수에 1부터 1씩 증가시키면서 자연수의 합을 저장합니다.
		//2. 변수가 1000이상이 되는지 판별한 한 후, 참이면 종료하고 거짓이면 다시 1번 과정부터 반복한다.
		
		while(true) {  
			sum += num;
			
			if(sum >=1000)
				break;
			
			num++;
		}
		
		System.out.println("1부터 차례로 더한 자연수의 합이 최초로 1000 이상이 되게하는 자연수는 " + num);
		System.out.println("1에서 " + num +"까지의 합은 " + sum);
		
		

	}

}
