package sec05.ex01;

import sec05.ex02.MemberVO;

public class MemberTest {
	public static void main(String[] args) {
		MemberVO member1 = new MemberVO("0001","손흥민", 177,67, 29);
		String id = member1.getId();
		String name = member1.getName();
		System.out.println("아이디:" + id +", 이름: " + name);

		System.out.println();
		System.out.println(member1.toString());
		System.out.println(member1.hashCode());
	}

}
