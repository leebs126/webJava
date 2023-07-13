package com.oracle.rent.ch17.member;

import java.util.List;

public interface Member {
	public List<MemberVO> listMember() throws MemberException;  //회원 리스트 조회 메소드
	
	public MemberVO viewMember(MemberVO memberVO) throws MemberException;  //회원 등록 메소드
	
	public void regMember(MemberVO memberVO) throws MemberException;    //회원 정보 조회 메소드
	 
	public void modMember(MemberVO memberVO) throws MemberException;		//회원 정보 수정 메소드
	 
	public void delMember(MemberVO memberVO) throws MemberException;	    //회원 정보 삭제 메소드
	
}
