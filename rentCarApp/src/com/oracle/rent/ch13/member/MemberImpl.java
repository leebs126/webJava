package com.oracle.rent.ch13.member;

import com.oracle.rent.ch12.common.DataUtil;
import com.oracle.rent.ch13.common.AbstractBase;

public class MemberImpl extends AbstractBase implements Member {
	String memberData;
	
	// 기존 회원 정보 조회
	@Override
	public String viewMember(MemberVO vo) {
		DataUtil.decodeData(memberData);
		memberData="회원 아이디:" + vo.id+","+
		     	"\n회원 비번:" + vo.password+","+
		     	"\n회원 이름:" + vo.name+","+
	            "\n회원 전화번호:" + vo.phoneNum;
		
		System.out.println("회원 정보를 조회합니다.");
		System.out.println("회원 조회시간: " + showTime());
		
		return memberData;
	}
		
	// 새로운 회원 등록
	@Override
	public void regMember(MemberVO vo) {
		memberData= vo.id+","+
				    vo.name+","+
				    vo.password+","+
				    vo.phoneNum;
		DataUtil.encodeData(memberData);
	
		System.out.println("\n회원 가입합니다.");
		System.out.println("회원 가입 시간 : " + showTime());
	}


	// 기존 회원 정보 수정
	@Override
	public void modMember(MemberVO vo) {
		memberData= vo.id+","+
				    vo.name+","+
				    vo.password+","+
				    vo.phoneNum;
		DataUtil.encodeData(memberData);
		
		System.out.println("\n회원 정보를 수정합니다.");
		System.out.println("회원 수정 시간: " + showTime());
	}

	// 기존 회원 정보 삭제
	@Override
	public void delMember(MemberVO vo) {
		memberData= vo.id+","+
				    vo.name+","+
				    vo.password+","+
				    vo.phoneNum;
		DataUtil.decodeData(memberData);
		
		System.out.println("\n회원 정보를 삭제합니다.");
		System.out.println("회원 삭제시간: "+showTime());
	}

}
