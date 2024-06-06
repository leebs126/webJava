package sec08.ex01;

public class ObjectArrayTest {

	public static void main(String[] args) {
		String code = null;
		String name = null;
		String color = null;
		int qty = 0;

		Object[] obj = new Object[5];
		//Object 배열에는 모든 클래스 타입 객체가 저장됩니다.
		obj[0] = "홍길동";
		obj[1] = new Product();
		obj[2] = new Product("0002", "스마트 TV", "흰색", 200);
		obj[3] = new Product("0003", "노트북", "은색", 100);
		obj[4] = new Integer(123);
		
		System.out.println("Object 배열에 저장한 정보 출력");
		System.out.println("-----------------------------------");

		for(int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Product) {
				Product prod = (Product) obj[i];
//				Student std = (Student)obj[i];  //ClassCastException 발생
				code = prod.getCode();
				name = prod.getName();
				color = prod.getColor();
				qty = prod.getQty();
				System.out.println("제품번호 = " + code);
				System.out.println("제품이름 = " + name);
				System.out.println("제품색상 = " + color);
				System.out.println("제품수량 = " + qty);
			}else if(obj[i] instanceof String) {
				String str = (String)obj[i];
				System.out.println(str);
				
			}else if(obj[i] instanceof Integer) {
				Integer num = (Integer)obj[i];
				System.out.println(num.intValue());
			}
			
			System.out.println();
			
		}//end for

	}

}
