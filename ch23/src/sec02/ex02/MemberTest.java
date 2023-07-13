package sec02.ex02;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요.");
		String _name = sc.nextLine();
		
		//DB연동을 위해서 MemberDAO 객체 생성
		MemberDAO memberDAO=new MemberDAO();
		
		//회원 정보 조회
		MemberVO memVO  = new MemberVO();
		memVO.setName(_name);
		
		List<MemberVO> memList= memberDAO.selectMember(memVO);
		System.out.println();
		
		for (int i = 0; i < memList.size(); i++) {
			MemberVO _memberVO = (MemberVO) memList.get(i);
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
		
		sc.close();
	}

}
