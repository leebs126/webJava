package sec02.ex01;

public class MethodTest1 {

	public static void main(String[] args) {
		int width1 = 10, length1 = 15, height1 = 30;
		int volume = 0;
		
		MethodTest1 m = new MethodTest1();
		volume = m.calcVolume(width1, length1, height1);
		System.out.println("첫번째 직육면체 부피 : " + volume);
		
		width1 = 12;
		length1 = 5;
		height1 = 51;
		volume = m.calcVolume(width1, length1, height1);
		System.out.println("두 번째 직육면체 부피 : " + volume);
		System.out.println("세 번째 직육면체 부피 : " + m.calcVolume(45, 10, 5));

	}
	
	
	
	
	//직육면체 부피를 구하는 메소드
	public int calcVolume(int width, int length, int height) {
		//1. 지역 변수 선언
		int vol = 0;  
		
		//2. 기능 구현
		vol = width * length * height;
		
		
		//3. 결과값 출력 또는 반환
		return vol;
		
		
	}
		

}
