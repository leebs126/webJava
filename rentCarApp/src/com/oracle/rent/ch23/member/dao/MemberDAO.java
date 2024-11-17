package com.oracle.rent.ch23.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.oracle.rent.ch23.member.vo.MemberVO;



public interface MemberDAO {
	public List<MemberVO> selectMember(MemberVO memVO) throws SQLException, ClassNotFoundException;   //회원 정보 조회
	
	public void insertMember(MemberVO memVO) throws SQLException, ClassNotFoundException;             //회원 추가
	  
	public void updateMember(MemberVO memVO) throws SQLException, ClassNotFoundException;              //회원 수정
	
	public void deleteMember(MemberVO memVO) throws SQLException, ClassNotFoundException;               //회원 삭제
}


