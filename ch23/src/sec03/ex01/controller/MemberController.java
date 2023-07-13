package sec03.ex01.controller;

import java.util.List;

import sec03.ex01.vo.MemberVO;


public interface MemberController {
	public List<MemberVO> listMember(MemberVO memVO) ;
	
	public void addMember(MemberVO memberVO) ;
	
	public void modMember(MemberVO memberVO) ;
	
	public void removeMember(MemberVO memberVO) ;

}


