package com.oracle.rent.ch11.main;

import com.oracle.rent.ch09.car.Car;
import com.oracle.rent.ch09.member.Member;
import com.oracle.rent.ch09.res.Reserve;

public class RentCarApp {
	public static void main(String[] args) {
		// 회원, 차, 예약 인스턴스 생성
		Member member = new Member();
		Car car = new Car();
		Reserve reserve = new Reserve();

		
		// 회원 ,차, 예약 정보 등록
		member.regMember("lee", "1234", "이순신", "서울시 도봉구", "010-1111-2222");;
		car.regCarInfo("11가1111", "소나타", "검정", 2000, "현대");
		reserve.resCar("20220708-0001", "11가1111", "2022-04-30", "2022-05-01", "2022-05-08");

		// 회원 정보 조회
		String memberInfo = member.viewMemeber();
		member.displayData(memberInfo);
		

		// 렌트카 정보 조회
		String carInfo = car.checkCarInfo();
		car.displayData(carInfo); //부모 클래스의 메소드를 사용하여 조회한 차량 정보를 보여준다.


		// 예약 정보 조회
		String resInfo = reserve.checkResInfo();
		reserve.displayData(resInfo);

		
		//회원, 차, 예약 정보 수정
		
		//회원, 차, 예약 정보 삭제
	}

}
