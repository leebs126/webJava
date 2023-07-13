package com.oracle.rent.ch17.member;

import java.util.List;
import java.util.Scanner;

import com.oracle.rent.ch17.common.AbstractBase;

public class MemberMenu {
	private List<MemberVO> memberList;
	Member member;
	
	public MemberMenu() {
		member = new MemberImpl();
	}
	
	public void doMemberMenu() throws MemberException{
		Scanner sc = new Scanner(System.in);
		boolean isWorking = true;
		
		while(isWorking) {
			System.out.println("\n회원 기능을 선택해 주세요.");
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 회원 목록 조회, 2. 회원 정보 조회, 3. 회원 정보 등록, 4. 회원 정보 수정, 5. 회원 정보 삭제, 0. 상위 메뉴로 이동");
			String temp = sc.nextLine();
			int menu2= Integer.parseInt(temp);

			switch(menu2) {
			case AbstractBase.MENU_END:
				isWorking = false;	
				break;
				
			case AbstractBase.MENU_MEMBER_LIST:
				menuMemberList();
				break;
			case AbstractBase.MENU_MEMBER_VIEW:
				menuMemberView();
				break;
			case AbstractBase.MENU_MEMBER_REG:
				menuMemberReg();
				break;
				
			case AbstractBase.MENU_MEMBER_MOD:
				menuMemberMod();
				break;
				
			case AbstractBase.MENU_MEMBER_DEL:
				menuMemberDel();
				break;
			default:
				isWorking = false;
			}
		}	//end while문
		
	}
	
	private void menuMemberList() throws MemberException{
		memberList = member.listMember();         			//회원 리스트 출력하기
		((AbstractBase)member).displayData(memberList);
	}
	
	private void menuMemberView() throws MemberException{
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 회원 아이디:");
		String id = sc.nextLine();
		MemberVO memberVO = new MemberVO();
		memberVO.setId(id);
		
		//조회한 회원 정보만 보여줍니다.
		memberVO = member.viewMember(memberVO);         			
		((AbstractBase)member).displayData(memberVO);
	}

	
	
	private void menuMemberReg() throws MemberException{
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디:");
		String id = sc.nextLine();
		
		System.out.print("비밀번호:");
		String password = sc.nextLine();
		
		System.out.print("이름:");
		String name = sc.nextLine();
		
		System.out.print("주소:");
		String address = sc.nextLine();
		
		System.out.print("전화번호:");
		String phoneNum = sc.nextLine();
		
		MemberVO memberVO = new MemberVO(id, password, name, address, phoneNum);
		member.regMember(memberVO); 						// 회원 가입하기			
		
		//회원 정보 추가 후 리스트로 보여 줍니다.
		menuMemberList();
		
		
		
	}
	
	private void menuMemberMod() throws MemberException{
		//회원 정보 수정  전 리스트로 보여 줍니다.
		menuMemberList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n수정정보 입력");
		System.out.print("아이디:");
		String id = sc.nextLine();
		
		System.out.print("비밀번호:");
		String password = sc.nextLine();
		
		System.out.print("이름:");
		String name = sc.nextLine();
		
		System.out.print("주소:");
		String address = sc.nextLine();
		
		System.out.print("전화번호:");
		String phoneNum = sc.nextLine();
		
		MemberVO memberVO = new MemberVO(id, password, name, address, phoneNum);
		member.modMember(memberVO); 
		
		//회원 정보 수정 후 리스트로 보여 줍니다.
		menuMemberList();
		
		
	}
	
	private void menuMemberDel() throws MemberException{
		menuMemberList();
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 회원 아이디 입력:");
		String id = sc.nextLine();
		MemberVO memberVO = new MemberVO();
		memberVO.setId(id);
		member.delMember(memberVO);
		
		//회원 정보 삭제 후 리스트로 보여 줍니다.
		menuMemberList();
		
	}

}
