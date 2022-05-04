package sec05.ex01;

public class CallByString {
	
	public static void main(String[] args) {
		String address = "서울시 강남구";
		CallByString str = new CallByString();
		System.out.println("메서드 호출 전");
		System.out.println("address= " + address);

		str.setAddress(address);
		System.out.println();
		System.out.println("메서드 호출 후");
		System.out.println("address= " + address);
	}
	
	public void setAddress(String addr) {
		addr = "수원시 장안구";
	}

}
