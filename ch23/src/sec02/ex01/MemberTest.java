package sec02.ex01;

import java.sql.SQLException;
import java.util.List;

public class MemberTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//DB연동을 위해서 MemberDAO 객체 생성
		MemberDAO memberDAO=new MemberDAO();
		
		//회원 정보 추가
		MemberVO memberVO = new MemberVO("0006","손흥민", 177,67,29);
		memberDAO.insertMember(memberVO);
		
		
		
		//회원 정보 조회
		List<MemberVO> memList= memberDAO.selectMember();
		System.out.println();
		
		for(int i=0; i < memList.size( );i++){
			MemberVO _memberVO = (MemberVO) memList.get(i);
			String id=_memberVO.getId();
			String name= _memberVO.getName();
			int height= _memberVO.getHeight();
			int weight= _memberVO.getWeight();
			int age= _memberVO.getAge();
			
			System.out.println("아이디: "+id+
								", 이름: "+name+
								", 키: "+height+
								", 몸무게: "+weight+
								", 나이: "+age);
			}
		
		
		

	}

}
