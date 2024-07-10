package com.oracle.rent.ch17.res;


import java.util.ArrayList;
import java.util.List;
import com.oracle.rent.ch17.common.AbstractBase;

public class ReserveImpl extends AbstractBase implements Reserve{
	List<ResVO> resList;

	public ReserveImpl() {
		resList = new ArrayList<ResVO>();
	}
	
	
	//예약 정보 리스트 조회 기능
	@Override
	public List<ResVO> listResInfo() throws ResException {
		return resList;
	}
	
	// 차 예약 정보 조회 기능 
	@Override
	public ResVO  checkResInfo(ResVO resVO) throws ResException {
		String resNumber = resVO.getResNumber();
		ResVO requestedVO = null;
		
		for(int i = 0; i< resList.size(); i++) {
			requestedVO = resList.get(i);
			if(resNumber.equals(requestedVO.getResNumber())) {
				break;
			}
			requestedVO = null;
		}
		return requestedVO;
	}
	
	// 차 예약 기능
	@Override
	public void regResInfo(ResVO resVO)  throws ResException{
		resList.add(resVO);
	    
	}

	// 차 예약정보 수정 기능
	@Override
	public void modResInfo(ResVO resVO)  throws ResException {
		String resNumber =  resVO.getResNumber();
		String resCarNumber = resVO.getResCarNumber();
		String resDate = resVO.getResDate();
		String useBeginDate = resVO.getUseBeginDate();
		String returnDate = resVO.getReturnDate();
		
		ResVO oldVO = null;
		for(int i=0; i< resList.size(); i++){
			oldVO = resList.get(i);
			if(resNumber.equals(oldVO.getResNumber())) {  //예약 번호가 같으면 ArrayList의 ResVO의 값을 수정합니다.
				oldVO.setResCarNumber(resCarNumber);   
				oldVO.setResDate(resDate);
				oldVO.setUseBeginDate(useBeginDate);
				oldVO.setReturnDate(returnDate);
				break;
			}
		}
	}

	// 차 예약 정보 취소 기능
	@Override
	public void cancelResInfo(ResVO resVO)  throws ResException {
		ResVO oldVO = null;
		String resNumber = resVO.getResNumber();
		for(int i = 0; i< resList.size(); i++) {
			oldVO = resList.get(i);
			if(resNumber.equals(oldVO.getResNumber())) {
				resList.remove(i);
			}
		}
	}


}
