--회원 테이블
create table t_Member(
memId VARCHAR2(20) PRIMARY KEY, --아이디
memPassword VARCHAR2(20), --비밀번호
memName VARCHAR2(30), --이름
memAddress VARCHAR2(200), --주소
memPhoneNum VARCHAR2(50) --전화번호
);


--렌터카 테이블
CREATE TABLE t_Car(
carNumber VARCHAR2(30) PRIMARY KEY, --차 번호
carName VARCHAR2(50), --차 이름
carColor VARCHAR2(30), --차 색상
carSize NUMBER(5), --배기량
carMaker VARCHAR2(50) --제조사
);

--예약 테이블
CREATE TABLE t_Res(
resNumber VARCHAR2(30) PRIMARY KEY, --예약 번호
resDate DATE, --예약일자
useBeginDate DATE, --이용 시작일자
returnDate DATE, --반납일자
resCarNumber VARCHAR2(30), --예약 차 번호
resUserId VARCHAR2(20), --예약자 아이디
CONSTRAINT FK_RES_USER_ID FOREIGN KEY(resUserId) REFERENCES t_Member(memId),
CONSTRAINT FK_RES_CAR_NUMBER FOREIGN KEY(resCarNumber) REFERENCES t_Car(CarNumber)
);
