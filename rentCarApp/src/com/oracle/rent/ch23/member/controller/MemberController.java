package com.oracle.rent.ch23.member.controller;

import java.util.List;

import com.oracle.rent.ch23.member.vo.MemberVO;



public interface MemberController {
	public List<MemberVO> listMember(MemberVO memVO) ;
	
	public void regMember(MemberVO memberVO) ;
	
	public void modMember(MemberVO memberVO) ;
	
	public void removeMember(MemberVO memberVO) ;

}


