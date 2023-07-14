package sec02.ex03;

public class Earth {
	private static Earth ourEarth = null;  //변수를 static으로 지정
	public  static int EARTH_RADIUS = 6371;
	
	private Earth() {
		System.out.println("지구 객체 생성");
	}
	
	public static Earth getInstance() {
		if(ourEarth == null){
			ourEarth = new Earth();
		}
		
		return ourEarth;
			
	}
}


