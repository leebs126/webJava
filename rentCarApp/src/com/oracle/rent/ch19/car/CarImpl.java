package com.oracle.rent.ch19.car;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.oracle.rent.ch19.common.AbstractBase;


public class CarImpl extends AbstractBase implements Car{
	File carFile;
	PrintWriter printer;
	
	public CarImpl() {
		carFile = new File("src\\com\\oracle\\rent\\ch19\\car\\carData.txt");
		carList = new ArrayList<CarVO>();
	}
	

	//렌터카 리스트 조회
	@Override
	public List<CarVO> listCarInfo() throws CarException, IOException {
		carList.removeAll(carList);

		BufferedReader br = new BufferedReader(new FileReader(carFile));
		String carData = null;
		while (true) {
			carData = br.readLine();
			if (carData != null) {
				String[] token = carData.split(",");
				CarVO carVO = new CarVO(token[0], token[1], token[2], Integer.parseInt(token[3]), token[4]);
				carList.add(carVO);
			} else {
				break;
			}

		}

		return carList;
	}

	// 차 정보 조회
	@Override
	public CarVO checkCarInfo(CarVO carVO) throws CarException, IOException {
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
	public void regCarInfo(CarVO carVO) throws CarException, IOException {
		String carData = null;
		printer = new PrintWriter(new FileWriter(carFile, true));// 기존 파일 내용에 추가합니다.
		
		carData= carVO.getCarNumber() + "," +
	   	         carVO.getCarName() + "," +
	   	         carVO.getCarColor() +"," +
		         carVO.getCarSize() + ","  + 
		         carVO.getCarMaker();
		printer.println(carData);
		System.out.println("새 차를 등록했습니다.");
		printer.close();
	}

	// 차 정보 수정
	@Override
	public void modCarInfo(CarVO carVO) throws CarException, IOException {
		String carData = null;
		printer = new PrintWriter(new FileWriter(carFile, false));// 기존 파일 내용을 덮어습니다.
		
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
		
		
		//수정한 ArrayList의  차 정보를 다시 파일에 저장합니다.
		for(int i=0; i< carList.size(); i++) {
			carVO = carList.get(i);
			carData = carVO.getCarNumber() + "," +
					  carVO.getCarName() + "," + 
					  carVO.getCarColor()+"," +
					  carVO.getCarSize() + ","  + 
					  carVO.getCarMaker();
			printer.println(carData);
		}
		printer.close();

	}

	//차 정보 삭제
	@Override
	public void delCarInfo(CarVO carVO) throws CarException, IOException {
		String carData = null;
		printer = new PrintWriter(new FileWriter(carFile, false));// 기존 파일 내용을 덮어습니다.
		
		CarVO oldVO = null;
		String carNumber = carVO.getCarNumber();
		for(int i = 0; i< carList.size(); i++) {
			oldVO = carList.get(i);
			if(carNumber.equals(oldVO.getCarNumber())) {
				carList.remove(i);
			}
		}
		
		// ArrayList의  차 정보를 삭제한 후 남은 차정보를 다시 파일에 저장합니다.
		for(int i=0; i< carList.size(); i++) {
			carVO = carList.get(i);
			carData = carVO.getCarNumber() + "," +
					  carVO.getCarName() + "," + 
					  carVO.getCarColor()+"," +
					  carVO.getCarSize() + ","  + 
					  carVO.getCarMaker();
			printer.println(carData);
		}
		printer.close();
	}

	

}
