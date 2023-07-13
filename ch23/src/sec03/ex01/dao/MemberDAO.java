package sec03.ex01.dao;

import java.sql.SQLException;
import java.util.List;

import sec03.ex01.vo.MemberVO;


public interface MemberDAO {
	public List<MemberVO> selectMember(MemberVO memVO) throws SQLException, ClassNotFoundException;
	
	public void insertMember(MemberVO memVO) throws SQLException, ClassNotFoundException;
	
	public void updateMember(MemberVO memVO) throws SQLException, ClassNotFoundException;
	
	public void deleteMember(MemberVO memVO) throws SQLException, ClassNotFoundException;
}


