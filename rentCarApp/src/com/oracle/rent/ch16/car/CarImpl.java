package com.oracle.rent.ch16.car;

import com.oracle.rent.ch12.common.DataUtil;
import com.oracle.rent.ch13.common.AbstractBase;

public class CarImpl extends AbstractBase implements Car{
	String carData;

	// 차 정보 조회
	@Override
	public String checkCarInfo(CarVO carVO) throws CarException {
		carData="차번호:" + carVO.carNumber+","+
				  "\n차이름:" + carVO.carName+","+
				  "\n차크기" + carVO.carSize+","+
				  "\n차색상:" + carVO.carColor+","+
				  "\n제조사:" + carVO.carMaker;
		DataUtil.decodeData(carData);

		System.out.println("\n렌트카 정보를 조회합니다.");
		System.out.println("렌트카 조회 시간 :"+showTime()); 
		
		return carData;
	}

	//차 정보 등록
	@Override
	public void regCarInfo(CarVO carVO) throws CarException {
		carData= carVO.carNumber+","+
				 carVO.carName+","+
				 carVO.carSize+","+
				 carVO.carColor+","+
				 carVO.carMaker;
		
		DataUtil.encodeData(carData);
		
		System.out.println("\n차 정보를 등록합니다.");
		System.out.println("렌트카 등록 시간 :"+showTime());
		
		
		
	}

	// 차 정보 수정
	@Override
	public void modCarInfo(CarVO carVO) throws CarException {
		System.out.println("\n렌트카 정보를 수정합니다.");
		System.out.println("렌트카 정보 수정시간 :" + showTime());
		
		carData= carVO.carNumber+","+
				 carVO.carName+","+
				 carVO.carSize+","+
				 carVO.carColor+","+
				 carVO.carMaker;
		
		DataUtil.encodeData(carData);
	}

	//차 정보 삭제
	@Override
	public void delCarInfo(CarVO carVO) throws CarException {
		System.out.println("\n렌트카 정보를 삭제합니다.");
		System.out.println("렌트카 정보 삭제 시간 :" + showTime());
		
		carData= carVO.carNumber+","+
				 carVO.carName+","+
				 carVO.carSize+","+
				 carVO.carColor+","+
				 carVO.carMaker;
		
		DataUtil.decodeData(carData);
	}

}
