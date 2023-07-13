package sec04.ex01;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String value = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("검색 조건을 선택하세요. 1:아이디, 2:이름, 3:나이, 4:모든 회원");
		String temp = sc.nextLine();
		int searchCon = Integer.parseInt(temp);
		
		if(searchCon == 1) {
			System.out.println("아이디를 입력해 주세요.");
			value = sc.nextLine();	
		
		}else if(searchCon ==2) {
			System.out.println("이름을 입력해 주세요.");
			value = sc.nextLine();	
		}
		else if(searchCon ==3) {
			System.out.println("나이를 입력해 주세요.");
			value = sc.nextLine();	
		}
		
		//DB연동을 위해서 MemberDAO 객체 생성
		MemberDAO memberDAO=new MemberDAO();
		
		//회원 정보 조회
		MemberVO memVO  = new MemberVO();
		memVO.setName(value);
		
		ArrayList<MemberVO> list= memberDAO.selectMember(memVO);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			MemberVO _memberVO = (MemberVO) list.get(i);
			String id = _memberVO.getId();
			String name = _memberVO.getName();
			int height = _memberVO.getHeight();
			int weight = _memberVO.getWeight();
			int age = _memberVO.getAge();

			System.out.println("아이디: "+id+
								", 이름: "+name+
								", 키: "+height+
								", 몸무게: "+weight+
								", 나이: "+age);
			}
	}

}
