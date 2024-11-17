package com.oracle.rent.ch23.member.controller;

import java.util.List;

import com.oracle.rent.ch23.member.vo.MemberVO;



public interface MemberController {
	public List<MemberVO> listMember(MemberVO memVO) ;   //회원 정보 조회
	 
	public void regMember(MemberVO memberVO) ;			//회원 추가
	
	public void modMember(MemberVO memberVO) ;			//회원 수정
	
	public void removeMember(MemberVO memberVO) ;		//회원 삭제

}


