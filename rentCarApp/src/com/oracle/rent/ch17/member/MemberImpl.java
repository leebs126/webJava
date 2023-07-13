package com.oracle.rent.ch17.member;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.oracle.rent.ch17.common.AbstractBase;
import com.oracle.rent.ch17.common.DataUtil;


public class MemberImpl extends AbstractBase implements Member {
	List<MemberVO> memberList;  //리스트로 회원 정보 저장
	
	public MemberImpl() {
		memberList = new ArrayList<MemberVO>();
	}
	
	
	//기존 회원 리스트 조회
	@Override
	public List<MemberVO> listMember() throws MemberException {
		return memberList;
	}
	
	
	// 기존 회원 정보 조회
	@Override
	public MemberVO viewMember(MemberVO memberVO) throws MemberException{
		String id = memberVO.getId();  //입력한 회원 아이디
		MemberVO memVO = null;
		
		for(int i = 0; i< memberList.size(); i++) {
			memVO = memberList.get(i);
			if(id.equals(memVO.getId())) {
				break;
			}
			memVO = null;
		}
		return memVO;
	}
		
	// 새로운 회원 등록
	@Override
	public void regMember(MemberVO memberVO) throws MemberException{
		String id = memberVO.getId();
		if(id == null || id.equals("")) {
			throw new MemberException("아이디는 필수 입력 정보입니다.");
		}else {
			memberList.add(memberVO);   //새 회원 정보를 memberList에 저장합니다.
		}
	}


	// 기존 회원 정보 수정
	@Override
	public void modMember(MemberVO memberVO) throws MemberException{
		String id = memberVO.getId();
		String password = memberVO.getPassword();
		String name = memberVO.getName();
		String address = memberVO.getAddress();
		String phoneNum = memberVO.getPhoneNum();
		
		MemberVO memVO = null;
		for(int i=0; i< memberList.size(); i++){
			memVO = memberList.get(i);
			if(id.equals(memVO.getId())) {
				memVO.setPassword(password);
				memVO.setName(name);
				memVO.setAddress(address);
				memVO.setPhoneNum(phoneNum);
				break;
			}
		}
		
	}

	// 기존 회원 정보 삭제
	@Override
	public void delMember(MemberVO memberVO) throws MemberException{
		MemberVO memVO = null;
		String id = memberVO.getId();
		for(int i = 0; i< memberList.size(); i++) {
			memVO = memberList.get(i);
			if(id.equals(memVO.getId())) {
				memberList.remove(i);
			}
		}
	}
}
