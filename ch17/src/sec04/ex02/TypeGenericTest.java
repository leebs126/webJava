package sec04.ex02;

public class TypeGenericTest {

	public static void main(String[] args) {
		GOrigin<String> origin1 = new GOrigin<String>();
		String str = "안녕하세요";
		origin1.setData(str);
//		origin1.setData(new Integer(300)); String 타입외에 다른 타입을 메소드로 전달 시 에러를 발생시킵니다.
		String result1 = origin1.getData();
//		String result1 = (String)origin1.getData();
		System.out.println(result1);

		GOrigin<Integer> origin2 = new GOrigin<Integer>();
		int num = 100;
		origin2.setData(new Integer(num));
//		origin2.setData(str); //Integer 객체외 다른 타입을 메소드로 전달 시 에러를 발생시킵니다.
		Integer result2 = origin2.getData();
//		Integer result2 = (Integer)origin2.getData();
		System.out.println(result2);

		GOrigin origin3 = new GOrigin( );
//		GOrigin<Object> origin3 = new GOrigin<Object>();
		origin3.setData("hello!");
		String result3 = (String)origin3.getData();
		System.out.println(result3);
		
		origin3.setData(new Integer(300));
		Integer result4 = (Integer)origin3.getData();
		System.out.println(result4.intValue());

	}
}
