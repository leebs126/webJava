package com.oracle.rent.ch09.member;

import com.oracle.rent.ch09.common.Base;

public class Member extends Base {
	private String id;          //아이디
	private String password;     //비밀번호
	private String name;        //이름
	private String address;     //주소
	private String phoneNum;    //전화번호

	public Member() {

	}

	public Member(String id, String password, String name, String address, String phoneNum) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}

	// 기존 회원 정보 조회
		public String viewMemeber() {
			System.out.println("\n회원 정보를 조회합니다.");
			System.out.println("회원 조회시간: " + showTime());
			System.out.println("-------------------------");
			String memberInfo = "아이디: " + id 
					          + "\n비밀번호: " + password 
					          + "\n이름: "+ name 
					          + "\n주소: "+ address 
					          + "\n전화번호: " + phoneNum;
			return memberInfo;
		}
		
	// 새로운 회원 등록
	public void regMember(String id, String password, String name, String address, String phoneNum) {
		System.out.println("\n회원 가입합니다.");
		System.out.println("회원 가입 시간 : " + showTime());

		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}


	// 기존 회원 정보 수정
	public void modMember() {
		System.out.println("\n회원 정보를 수정합니다.");
		System.out.println("회원 수정 시간: " + showTime());
	}

	// 기존 회원 정보 삭제
	public void delMember() {
		System.out.println("\n회원 정보를 삭제합니다.");
		System.out.println("회원 삭제시간: "+showTime());
	}

}
