package sec04.ex05;

public class MemberTest {

	public static void main(String[] args) {
		Member member = new Member();
		member.setName("홍길동");
		member.setJumin("111111-1222222");
		member.setAdult(true);
		
		String name = member.getName();
		String jumin = member.getJumin();
		boolean adult = member.isAdult();
		
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + jumin);
		System.out.println("성인여부 : " + adult);
		
	}

}
