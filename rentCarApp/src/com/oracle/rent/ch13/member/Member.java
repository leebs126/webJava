package com.oracle.rent.ch13.member;

public interface Member {
	public String viewMember(MemberVO vo);  //회원 등록 메소드
	
	public void regMember(MemberVO vo);    //회원 정보 조회 메소드
	 
	public void modMember(MemberVO vo);		//회원 정보 수정 메소드
	 
	public void delMember(MemberVO vo);	    //회원 정보 삭제 메소드
	
}
