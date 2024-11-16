package com.oracle.rent.ch23.res.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oracle.rent.ch23.common.base.AbstractBaseDAO;
import com.oracle.rent.ch23.member.vo.MemberVO;
import com.oracle.rent.ch23.res.vo.ResVO;

public class ResDAOImpl  extends AbstractBaseDAO implements ResDAO{
	@Override
	public List<ResVO> selectResInfo(ResVO resVO) throws SQLException, ClassNotFoundException{
		List<ResVO> resList = new ArrayList<ResVO>();
		String _resNumber = resVO.getResNumber();
		if(_resNumber != null && _resNumber.length() != 0) {
			pstmt = conn.prepareStatement("SELECT resNumber,"
										     + "resCarNumber,"
					                         + "TO_CHAR(resDate,'YYYY-MM-DD') resDate," 
										     + "TO_CHAR(useBeginDate, 'YYYY-MM-DD') useBeginDate," 
					                         + "TO_CHAR(returnDate, 'YYYY-MM-DD') returnDate,"
										     + "resUserId "
					                         + "FROM t_Res  WHERE resNumber = ? ORDER BY resNumber");
			pstmt.setString(1, _resNumber);
		}else {
			pstmt = conn.prepareStatement("SELECT resNumber,"
				     + "resCarNumber,"
                     + "TO_CHAR(resDate,'YYYY-MM-DD') resDate," 
				     + "TO_CHAR(useBeginDate, 'YYYY-MM-DD') useBeginDate," 
                     + "TO_CHAR(returnDate, 'YYYY-MM-DD') returnDate,"
				     + "resUserId "
				     + "FROM t_Res ORDER BY resNumber");
		}
		
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			String resNumber = rs.getString("resNumber");
			String resCarNumber = rs.getString("resCarNumber");
			String resDate = rs.getString("resDate");
			String useBeginDate = rs.getString("useBeginDate");
			String returnDate = rs.getString("returnDate");
			String resUserId = rs.getString("resUserId");
			
			ResVO _resVO = new ResVO();
			
			_resVO.setResNumber(resNumber);
			_resVO.setResCarNumber(resCarNumber);
			_resVO.setResDate(resDate);
			_resVO.setUseBeginDate(useBeginDate);
			_resVO.setReturnDate(returnDate);
			_resVO.setResUserId(resUserId);
			
			resList.add(_resVO);
		} // end while
		rs.close();
		return resList;

	}

	@Override
	public void insertResInfo(ResVO resVO) throws SQLException, ClassNotFoundException{
		pstmt = conn.prepareStatement("INSERT INTO t_Res (resNumber, resCarNumber, resDate, useBeginDate, returnDate, resUserId) " +
                "VALUES (?, ?, ?, ?, ?, ?)");
		pstmt.setString(1, resVO.getResNumber());
		pstmt.setString(2, resVO.getResCarNumber());
		pstmt.setString(3, resVO.getResDate());
		pstmt.setString(4, resVO.getUseBeginDate());
		pstmt.setString(5, resVO.getReturnDate());
		pstmt.setString(6, resVO.getResUserId());
		pstmt.executeUpdate();	
	}

	@Override
	public void updateResInfo(ResVO resVO) throws SQLException, ClassNotFoundException{
		pstmt = conn.prepareStatement("UPDATE t_Res SET  resCarNumber = ?, resDate = ?, useBeginDate = ?, returnDate = ?, resUserId = ?  "+
	                                  "WHERE resNumber = ? ");
		pstmt.setString(1, resVO.getResCarNumber());
		pstmt.setString(2, resVO.getResDate());
		pstmt.setString(3, resVO.getUseBeginDate());
		pstmt.setString(4, resVO.getReturnDate());
		pstmt.setString(5, resVO.getResUserId());
		pstmt.setString(6, resVO.getResNumber());
		pstmt.executeUpdate();		
	}

	@Override
	public void deleteResInfo(ResVO resVO) throws SQLException, ClassNotFoundException{
		pstmt = conn.prepareStatement("DELETE t_Res WHERE resNumber = ?");
		pstmt.setString(1, resVO.getResNumber());
		pstmt.executeUpdate();
	}

}
