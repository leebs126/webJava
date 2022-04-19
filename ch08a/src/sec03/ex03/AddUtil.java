package sec03.ex03;

public class AddUtil {
	
	//
	public int add(int x, int y) {
		return x + y;
	}
	
//	public int add(int x1, int y1) {
//		return x + y;
//	}

	public int add(int x, int y, int z) {
		return x + y + z;
	}

	public float add(float x, float y) {
		return x + y;
	}

	public float add(float x, float y, float z) {
		return x + y + z;
	}
	
	
	//리턴 타입이 다른 메소드는 같은 메소드로 인식합니다.
//	public int add(float x, float y, float z) {
//		return (int)(x + y + z);
//	}

}
