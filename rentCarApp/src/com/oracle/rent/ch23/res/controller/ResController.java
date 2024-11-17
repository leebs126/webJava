package com.oracle.rent.ch23.res.controller;

import java.util.List;

import com.oracle.rent.ch23.res.vo.ResVO;


public interface ResController {
	public List<ResVO>  listResInfo(ResVO resVO)  ;   //예약 리스트 조회
	
	public void regResInfo(ResVO resVO) ;             //예약 등록
		
	public void modResInfo(ResVO resVO) ;			  //예약 수정
	
	public void cancelResInfo(ResVO resVO) ;		   //예약 취소
	

}
