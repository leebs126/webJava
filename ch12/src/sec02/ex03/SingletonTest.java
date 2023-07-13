package sec02.ex03;

public class SingletonTest {

	public static void main(String[] args) {
//		Earth myEarth = new Earth();
		System.out.println("첫번째 getInstance() 호출");
		Earth myEarth =Earth.getInstance();
		

		
		System.out.println("두번째 getInstance() 호출");
		Earth yourEarth =Earth.getInstance();
		
		if(myEarth == yourEarth) {
			System.out.println("두 지구 객체는 같은 객체입니다.");
		}else {
			System.out.println("두 지구 객체는 다른 객체입니다.");
		}
		
		System.out.println();
		System.out.println("지구 반지름: " + Earth.earthRadius + "km");
		
		
	}

}
