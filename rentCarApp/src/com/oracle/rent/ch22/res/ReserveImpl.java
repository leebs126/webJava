package com.oracle.rent.ch22.res;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.oracle.rent.ch19.common.AbstractBase;
import com.oracle.rent.ch19.member.MemberVO;

public class ReserveImpl extends AbstractBase implements Reserve{
	File resFile;
	PrintWriter printer;
	List<ResVO> resList;

	public ReserveImpl() {
		resFile = new File("src\\com\\oracle\\rent\\ch22\\res\\resData.txt");
		resList = new ArrayList<ResVO>();
	}
	//예약 정보 리스트 조회 기능
	@Override
	public List<ResVO> listResInfo() throws ResException, IOException{
	  resList.removeAll(resList);  //ArrayList의 예약 정보를 모두 삭제한 후, 다시 파일에서 읽어옵니다.
		  
	  BufferedReader br=new BufferedReader(new FileReader(resFile));
      String resData= null;
      while(true){
         resData=br.readLine();
         if(resData != null) {
        	 String[] token = resData.split(",");
        	 ResVO resVO = new ResVO(token[0],token[1], token[2], token[3], token[4]);
        	 resList.add(resVO);
         }else {
        	 break;
         }
      }
		
	  return resList;
	}

	
	
	// 차 예약 정보 조회 기능 
	@Override
	public ResVO  checkResInfo(ResVO resVO) throws ResException, IOException{
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
	public void regResInfo(ResVO resVO)  throws ResException, IOException{
		String resData = null;
		printer = new PrintWriter(new FileWriter(resFile, true));// 기존 파일 내용에 추가합니다.	   
		
		resData= resVO.getResNumber() + "," +
	   	         resVO.getResCarNumber() + "," +
	   	         resVO.getResDate()+"," +
		         resVO.getUseBeginDate() + ","  + 
		         resVO.getReturnDate();
		printer.println(resData);
		System.out.println("새 예약을 등록했습니다.");
		printer.close();
	    
	}

	// 차 예약정보 수정 기능
	@Override
	public void modResInfo(ResVO resVO)  throws ResException, IOException{
		String resData = null;
		printer = new PrintWriter(new FileWriter(resFile, false));// 기존 파일 내용을 덮어습니다.
		
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
		
		//수정한 ArrayList의 예약 정보를 다시 파일에 저장합니다.
		for(int i=0; i< resList.size(); i++) {
			resVO = resList.get(i);
			resData= resVO.getResNumber() + "," +
		   	         resVO.getResCarNumber() + "," +
		   	         resVO.getResDate()+"," +
			         resVO.getUseBeginDate() + ","  + 
			         resVO.getReturnDate();
			printer.println(resData);
		}
		printer.close();
	}

	// 차 예약 정보 취소 기능
	@Override
	public void cancelResInfo(ResVO resVO)  throws ResException, IOException{
		String resData = null;
		printer = new PrintWriter(new FileWriter(resFile, false));// 기존 파일 내용을 덮어습니다.
		
		ResVO oldVO = null;
		String resNumber = resVO.getResNumber();
		for(int i = 0; i< resList.size(); i++) {
			oldVO = resList.get(i);
			if(resNumber.equals(oldVO.getResNumber())) {
				resList.remove(i);
			}
		}
		
		//ArrayList의 예약 정보 중 예약 번호와 일치하는 예약을 삭제 후 다시 파일에 저장합니다.
		for(int i=0; i< resList.size(); i++) {
			resVO = resList.get(i);
			resData= resVO.getResNumber() + "," +
		   	         resVO.getResCarNumber() + "," +
		   	         resVO.getResDate()+"," +
			         resVO.getUseBeginDate() + ","  + 
			         resVO.getReturnDate();
			printer.println(resData);
		}
		printer.close();

	}


}
