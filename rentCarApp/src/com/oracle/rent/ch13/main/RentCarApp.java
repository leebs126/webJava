package com.oracle.rent.ch13.main;

import com.oracle.rent.ch13.car.Car;
import com.oracle.rent.ch13.car.CarImpl;
import com.oracle.rent.ch13.car.CarVO;
import com.oracle.rent.ch13.common.AbstractBase;
import com.oracle.rent.ch13.member.Member;
import com.oracle.rent.ch13.member.MemberImpl;
import com.oracle.rent.ch13.member.MemberVO;
import com.oracle.rent.ch13.res.ResVO;
import com.oracle.rent.ch13.res.Reserve;
import com.oracle.rent.ch13.res.ReserveImpl;

public class RentCarApp {
	public static void main(String[] args) {
		String memData;
		String carData;
		String resData;

		System.out.println("----------------------------------------------------------------");
		MemberVO memberVO = new MemberVO("lee", "1234", "이순신", "서울시 도봉구", "010-1111-2222");

		Member member = new MemberImpl();
		member.regMember(memberVO); // 회원 가입하기
		memData = member.viewMember(memberVO); // 회원 정보 조회하기
		((AbstractBase)member).displayData(memData);
		System.out.println("----------------------------------------------------------------");

		CarVO carVO = new CarVO("11가1111", "소나타", "검정", 2000, "현대");
		Car car = new CarImpl();
		car.regCarInfo(carVO); // 새 차 정보 등록
		carData = car.checkCarInfo(carVO); // 차 정보 조회
		((AbstractBase)car).displayData(carData);
		System.out.println("----------------------------------------------------------------");

		ResVO resVO = new ResVO("20220708-0001", "11가1111", "2022-04-30", "2022-05-01", "2022-05-08");
		Reserve reserve = new ReserveImpl();
		reserve.resCar(resVO); // 차 예약하기
		resData = reserve.checkResInfo(resVO);
		((AbstractBase)reserve).displayData(resData);

		
		// 회원, 차, 예약 정보 수정

		// 회원, 차, 예약 정보 삭제

	}

}
