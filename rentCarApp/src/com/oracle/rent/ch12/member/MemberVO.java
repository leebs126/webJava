package com.oracle.rent.ch12.member;

public class MemberVO {
	// 필드 선언
	String id; // 아이디
	String password; // 비밀번호
	String name; // 이름
	String address; // 주소
	String phoneNum; // 전화번호

	// 생성자 선언
	public MemberVO(String id, String password, String name, String address, String phoneNum) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}

}
