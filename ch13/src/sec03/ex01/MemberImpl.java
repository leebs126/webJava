package sec03.ex01;

public class MemberImpl implements Member {
	
	@Override
	public void joinMember() {
		//회원 등록 기능

	}


	@Override
	public void searchMember() {
		//회원 조회 기능

	}

	@Override
	public void modMember() {
		//회원 수정 기능

	}

	@Override
	public void delMember() {
		//회원 탈퇴 기능

	}
	
	private void encodeMemberInfo() {
		//회원 정보 암호화 기능
	}
	
	private String decodeMemberInfo() {
		//회원 정보 복호화 기능
		return "복호화된 회원 정보";
	}

}
