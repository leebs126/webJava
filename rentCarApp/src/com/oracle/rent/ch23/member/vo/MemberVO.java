package com.oracle.rent.ch23.member.vo;


public class MemberVO {
	// 필드 선언
	private String memId;         //회원 아이디
	private String memPassword;   //회원 비밀번호
	private String memName;       //회원 이름
	private String memAddress;    //회원 주소
	private String memPhoneNum;   //회원 전화번호

	// 생성자 선언
	public MemberVO() {}

	public MemberVO(String memId, String memPassword, String memName, String memAddress, String memPhoneNum) {
		this.memId = memId;
		this.memPassword = memPassword;
		this.memName = memName;
		this.memAddress = memAddress;
		this.memPhoneNum = memPhoneNum;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPassword() {
		return memPassword;
	}

	public void setMemPassword(String memPassword) {
		this.memPassword = memPassword;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemAddress() {
		return memAddress;
	}

	public void setMemAddress(String memAddress) {
		this.memAddress = memAddress;
	}

	public String getMemPhoneNum() {
		return memPhoneNum;
	}

	public void setMemPhoneNum(String memPhoneNum) {
		this.memPhoneNum = memPhoneNum;
	}
	
	
	
	
	
	
}
