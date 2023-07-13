package sec04.ex02;

public class MemberImpl implements MemberPC, MemberMobile {
	@Override
	public void joinMember() {
		// 회원 가입 기능
		System.out.println("PC에서 회원 가입합니다.");
	}

	@Override
	public void searchMember() {
		// 회원 조회 기능
		System.out.println("PC에서 회원 조회합니다.");
	}

	@Override
	public void modMember() {
		// 회원 수정 기능
		System.out.println("PC에서 회원 수정합니다.");
	}

	@Override
	public void delMember() {
		// 회원 탈퇴 기능
		System.out.println("PC에서 회원 탈퇴합니다.");
	}

	@Override
	public void joinMemberMobile() {
		// 모바일 회원 가입 기능
		System.out.println("모바일에서 회원 가입합니다.");
	}

	@Override
	public void searchMemberMobile() {
		// 모바일 회원 조회 기능
		System.out.println("모바일에서 회원 조회합니다.");
	}

	@Override
	public void modMemberMobile() {
		// 모바일 회원 수정 기능
		System.out.println("모바일에서 회원 수정합니다.");
	}

	@Override
	public void delMemberMobile() {
		// 모바일 회원 삭제 기능
		System.out.println("모바일에서 회원 탈퇴합니다.");
	}

}
