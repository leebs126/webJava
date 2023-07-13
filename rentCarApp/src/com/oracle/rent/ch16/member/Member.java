package com.oracle.rent.ch16.member;


public interface Member {
	public String viewMember(MemberVO memberVO) throws MemberException;  //회원 정보 조회 메소드
	
	public void regMember(MemberVO memberVO) throws MemberException;    //회원 정보 등록 메소드
	 
	public void modMember(MemberVO memberVO) throws MemberException;		//회원 정보 수정 메소드
	 
	public void delMember(MemberVO memberVO) throws MemberException;	    //회원 정보 삭제 메소드
	
}
