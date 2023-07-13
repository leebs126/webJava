package com.oracle.rent.ch16.res;

import com.oracle.rent.ch12.common.DataUtil;
import com.oracle.rent.ch13.common.AbstractBase;

public class ReserveImpl extends AbstractBase implements Reserve{
	String resData;
	
	// 차 예약 정보 조회 기능 
	@Override
	public String  checkResInfo(ResVO resVO) throws ResException {
		resData="예약 번호: " + resVO.resNumber +", " + 
				"\n예약 차번호: " + resVO.resCarNumber+","+
				 "\n예약 날자: " + resVO.resDate+","+
				 "\n이용 시작 일자: " + resVO.useBeginDate+","+
				 "\n차 반납 일자: " + resVO.returnDate;
		DataUtil.decodeData(resData);
		
		System.out.println("\n차 예약 정보를 조회합니다.");
	      System.out.println("렌트카 정보 조회 시간 :"+showTime());   
		System.out.println("-------------------------");
		
		return resData;
	}
	
	// 차 예약 기능
	@Override
	public void resCar(ResVO resVO)  throws ResException{
		resData = resVO.resNumber+","+ 
				  resVO.resCarNumber+","+
				  resVO.resDate+","+
				  resVO.useBeginDate+","+
				  resVO.returnDate;
		
		DataUtil.encodeData(resData);
		
		System.out.println("\n렌터카를 예약합니다.");
	    System.out.println("렌트카 예약 시간 :"+showTime());
	    
	    
	}

	// 차 예약정보 수정 기능
	@Override
	public void modResInfo(ResVO resVO)  throws ResException {
		System.out.println("\n차 예약정보를 수정합니다.");
		System.out.println("렌트카 예약정보 수정시간 :" + showTime());
		
		resData="예약 번호: " + resVO.resNumber +", " + 
				"\n예약 차번호: " + resVO.resCarNumber+","+
				 "\n예약 날자: " + resVO.resDate+","+
				 "\n이용 시작 일자: " + resVO.useBeginDate+","+
				 "\n차 반납 일자: " + resVO.returnDate;
		DataUtil.encodeData(resData);
	}

	// 차 예약 정보 취소 기능
	@Override
	public void cancelResInfo(ResVO resVO)  throws ResException {
		System.out.println("\n차 예약을 취소합니다.");
		System.out.println("렌트카 예약정보 삭제 시간 :"+showTime());
		
		resData="예약 번호: " + resVO.resNumber +", " + 
				"\n예약 차번호: " + resVO.resCarNumber+","+
				 "\n예약 날자: " + resVO.resDate+","+
				 "\n이용 시작 일자: " + resVO.useBeginDate+","+
				 "\n차 반납 일자: " + resVO.returnDate;
		DataUtil.decodeData(resData);
	}

}
