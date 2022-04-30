package com.oracle.rent.ch08.main;

import com.oracle.rent.ch08.car.Car;
import com.oracle.rent.ch08.member.Member;
import com.oracle.rent.ch08.res.Reserve;

public class rentCarApp {

	public static void main(String[] args) {
		// 회원, 차, 예약 인스턴스 생성
//		Member member = new Member("lee", "1234", "이순신", "서울시 도봉구", "010-1111-2222");
//		Car car = new Car("11가1111", "소나타", "검정", 2000, "현대");
//		Reserve reserve = new Reserve("11가1111", "2022-04-30", "2022-05-01", "2022-0508");
		
		Member member = new Member();
		Car car = new Car();
		Reserve reserve = new Reserve();

		
		// 회원 ,차, 예약 정보 등록
		member.regMember("lee", "1234", "이순신", "서울시 도봉구", "010-1111-2222");;
		car.regCarInfo("11가1111", "소나타", "검정", 2000, "현대");
		reserve.resCar("11가1111", "2022-04-30", "2022-05-01", "2022-05-08");

		// 회원 정보 조회
		String memberInfo = member.viewMemeber();
		System.out.println(memberInfo);

		// 렌트카 정보 조회
		String carInfo = car.checkCarInfo();
		System.out.println(carInfo);

		// 예약 정보 조회
		String resInfo = reserve.checkResInfo();
		System.out.println(resInfo);

		
		//회원, 차, 예약 정보 수정
		
		//회원, 차, 예약 정보 삭제
	}

}
