package com.oracle.rent.ch12.main;

import com.oracle.rent.ch12.car.Car;
import com.oracle.rent.ch12.car.CarVO;
import com.oracle.rent.ch12.member.Member;
import com.oracle.rent.ch12.member.MemberVO;
import com.oracle.rent.ch12.res.ResVO;
import com.oracle.rent.ch12.res.Reserve;

public class RentCarApp {
	public static void main(String[] args) {
		String memData;
		String carData;
		String resData;

		System.out.println("----------------------------------------------------------------");
		MemberVO memberVO = new MemberVO("lee", "1234", "이순신", "서울시 도봉구", "010-1111-2222");

		Member member = new Member();
		member.regMember(memberVO); // 회원 가입하기
		memData = member.viewMember(memberVO); // 회원 정보 조회하기
		member.displayData(memData);
		System.out.println("----------------------------------------------------------------");

		CarVO carVO = new CarVO("11가1111", "소나타", "검정", 2000, "현대");
		Car car = new Car();
		car.regCarInfo(carVO); // 새 차 정보 등록
		carData = car.checkCarInfo(carVO); // 차 정보 조회
		car.displayData(carData);
		System.out.println("----------------------------------------------------------------");

		ResVO resVO = new ResVO("20220708-0001", "11가1111", "2022-04-30", "2022-05-01", "2022-05-08");
		Reserve reserve = new Reserve();
		reserve.resCar(resVO); // 차 예약하기
		resData = reserve.checkResInfo(resVO);
		reserve.displayData(resData);

		// 회원, 차, 예약 정보 수정

		// 회원, 차, 예약 정보 삭제

	}

}
