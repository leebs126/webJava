package sec01.ex01;

public class ReturnUseTest {

	public static void main(String[] args) {
		ReturnUseTest m = new ReturnUseTest();
		m.printSumTo1000();
		
		System.out.println("종료");

	}
	
	public void printSumTo1000(){
		int sum = 0, i = 1;
		
		while(true) {
			sum += i;
			if(sum >= 1000) {
				System.out.println("i = " + i+", sum = " + sum);
				return;  //강제로 메소드를 종료합니다.
//				System.out.println("i = " + i+", sum = " + sum);
			}else {
				i += 2;
			}
			
		}
		
	}

}
