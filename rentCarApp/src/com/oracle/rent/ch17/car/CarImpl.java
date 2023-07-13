package com.oracle.rent.ch17.car;

import java.util.ArrayList;
import java.util.List;

import com.oracle.rent.ch17.common.AbstractBase;

public class CarImpl extends AbstractBase implements Car{
	
	public CarImpl() {
		carList = new ArrayList<CarVO>();
	}
	

	//렌터카 리스트 조회
	@Override
	public List<CarVO> listCarInfo() throws CarException {
		return carList;
	}

	// 차 정보 조회
	@Override
	public CarVO checkCarInfo(CarVO carVO) throws CarException {
		String carNumber = carVO.getCarNumber();
		CarVO requestedVO = null;
		
		for(int i = 0; i< carList.size(); i++) {
			requestedVO = carList.get(i);
			if(carNumber.equals(requestedVO.getCarNumber())) {
				break;
			}
			requestedVO = null;
		}
		return requestedVO;
	}

	//차 정보 등록
	@Override
	public void regCarInfo(CarVO carVO) throws CarException {
		carList.add(carVO);
	}

	// 차 정보 수정
	@Override
	public void modCarInfo(CarVO carVO) throws CarException {
		String carNumber =  carVO.getCarNumber();
		String carName = carVO.getCarName();
		String carColor = carVO.getCarColor();
		int carSize = carVO.getCarSize();
		String carMaker = carVO.getCarMaker();
		
		CarVO oldVO = null;
		for(int i=0; i< carList.size(); i++){
			oldVO = carList.get(i);
			if(carNumber.equals(oldVO.getCarNumber())) {  //차번호가 같으면 ArrayList의 CarVO의 값을 수정합니다.
				oldVO.setCarName(carName);   
				oldVO.setCarColor(carColor);
				oldVO.setCarSize(carSize);
				oldVO.setCarMaker(carMaker);
				break;
			}
		}

	}

	//차 정보 삭제
	@Override
	public void delCarInfo(CarVO carVO) throws CarException {
		CarVO oldVO = null;
		String carNumber = carVO.getCarNumber();
		for(int i = 0; i< carList.size(); i++) {
			oldVO = carList.get(i);
			if(carNumber.equals(oldVO.getCarNumber())) {
				carList.remove(i);
			}
		}
	}

	

}
