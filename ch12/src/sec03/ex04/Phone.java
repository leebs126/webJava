package sec03.ex04;

public class Phone {
	static String maker = "삼성";
	static String model = "갤럭시22";
	static int price = 1200000;
	static String phoneInfo;
	
	static {
		System.out.println("첫번째 정적 블럭입니다.");
		phoneInfo = "제조사 : " + maker 
				    +", 모델명 : " + model
				    +", 가격 : " + price +"원";
	}
	
	static {
		System.out.println("두번째 정적 블럭입니다.");
	}
}
