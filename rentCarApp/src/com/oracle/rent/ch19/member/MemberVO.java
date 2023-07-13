package com.oracle.rent.ch19.member;

public class MemberVO {
	// 필드 선언
	private String id;
	private String password;
	private String name;
	private String address;
	private String phoneNum;

	// 생성자 선언
	public MemberVO() {}
	
	public MemberVO(String id, String password, String name, String address, String phoneNum) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	
}
