package sec03.ex01.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sec03.ex01.dao.MemberDAO;
import sec03.ex01.dao.MemberDAOImpl;
import sec03.ex01.vo.MemberVO;



public class MemberControllerImpl  implements MemberController{
	public MemberDAO memberDAO;
	
	public MemberControllerImpl() {
		memberDAO = new MemberDAOImpl();
	}
	
	@Override
	public List<MemberVO> listMember(MemberVO memVO) {
		List<MemberVO> memList = new ArrayList<MemberVO>();
		try {
				memList = memberDAO.selectMember(memVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return memList;
	}

	@Override
	public void addMember(MemberVO memVO)   {
		try {
			memberDAO.insertMember(memVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void modMember(MemberVO memVO)  {
		try {
			memberDAO.updateMember(memVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeMember(MemberVO memVO) {
		try {
			memberDAO.deleteMember(memVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
