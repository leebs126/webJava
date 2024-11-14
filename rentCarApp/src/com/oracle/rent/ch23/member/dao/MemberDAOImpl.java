package com.oracle.rent.ch23.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oracle.rent.ch23.common.base.AbstractBaseDAO;
import com.oracle.rent.ch23.member.vo.MemberVO;



public class MemberDAOImpl extends AbstractBaseDAO implements MemberDAO {

	public List<MemberVO> selectMember(MemberVO memVO) throws SQLException, ClassNotFoundException {
		List<MemberVO> memList = new ArrayList<MemberVO>();
		String _memName = memVO.getMemName();
		if(_memName != null && _memName.length() != 0) {
			pstmt = conn.prepareStatement("SELECT * FROM t_Member  WHERE memName = ? ORDER BY memId");
			pstmt.setString(1, _memName);
			
		}else {
			pstmt = conn.prepareStatement("SELECT * FROM t_Member ORDER BY memId");
		}
		
		
		
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			String memId = rs.getString("memId");
			String memPassword = rs.getString("memPassword");
			String memName = rs.getString("memName");
			String memAddress = rs.getString("memAddress");
			String memPhoneNum = rs.getString("memPhoneNum");
			MemberVO _memVO = new MemberVO();
			
			_memVO.setMemId(memId);
			_memVO.setMemPassword(memPassword);
			_memVO.setMemName(memName);
			_memVO.setMemAddress(memAddress);
			_memVO.setMemPhoneNum(memPhoneNum);
			memList.add(_memVO);
		} // end while
		rs.close();
		return memList;
	} // end list()

	public void insertMember(MemberVO memVO) throws SQLException, ClassNotFoundException {
		pstmt = conn.prepareStatement("INSERT INTO t_Member (memId, memPassword, memName, memAddress, memPhoneNum) VALUES (?, ?, ?, ?, ?)");
		pstmt.setString(1, memVO.getMemId());
		pstmt.setString(2, memVO.getMemPassword());
		pstmt.setString(3, memVO.getMemName());
		pstmt.setString(4, memVO.getMemAddress());
		pstmt.setString(5, memVO.getMemPhoneNum());
		
		pstmt.executeUpdate();
	} // end insertMember()

	// 회원 정보 수정 메소드
	public void updateMember(MemberVO memVO) throws SQLException, ClassNotFoundException {
		pstmt = conn.prepareStatement("UPDATE t_Member SET  memName = ?, memPassword = ?, memAddress = ?, memPhoneNum = ? WHERE memId = ?");
		pstmt.setString(1, memVO.getMemName());
		pstmt.setString(2, memVO.getMemPassword());
		pstmt.setString(3, memVO.getMemAddress());
		pstmt.setString(4, memVO.getMemPhoneNum());
		pstmt.setString(5, memVO.getMemId());
		pstmt.executeUpdate();

	}

	// 회원 정보 삭제 메소드
	public void deleteMember(MemberVO memVO) throws SQLException, ClassNotFoundException {
		pstmt = conn.prepareStatement("DELETE t_Member WHERE memId = ?");
		pstmt.setString(1, memVO.getMemId());
		pstmt.executeUpdate();


	}

	
}// end class MemberDAOImpl
