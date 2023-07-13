package com.oracle.rent.ch19.member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.oracle.rent.ch19.common.AbstractBase;



public class MemberImpl extends AbstractBase implements Member {
	File memberFile;
	PrintWriter printer;
	List<MemberVO> memberList;  //리스트로 회원 정보 저장
	
	public MemberImpl() throws IOException {
		memberFile = new File("src\\com\\oracle\\rent\\ch19\\member\\memberData.txt");
		memberList = new ArrayList<MemberVO>();
	}
	
	
	//기존 회원 리스트 조회
	@Override
	public List<MemberVO> listMember() throws MemberException, IOException {
	  memberList.removeAll(memberList);  //ArrayList의 회원 정보를 모두 삭제한 후, 다시 파일에서 읽어옵니다.
	  
	  BufferedReader br=new BufferedReader(new FileReader(memberFile));
      String memData= null;
      while(true){
         memData=br.readLine();
         if(memData != null) {
        	 String[] token = memData.split(",");
        	 MemberVO memVO = new MemberVO(token[0],token[1], token[2], token[3], token[4]);
        	 memberList.add(memVO);
         }else {
        	 break;
         }
         
      }

		
		return memberList;
	}
	
	
	// 기존 회원 정보 조회
	@Override
	public MemberVO viewMember(MemberVO memberVO) throws MemberException, IOException {
		String id = memberVO.getId();  //입력한 회원 아이디
		MemberVO memVO = null;
		
		for(int i = 0; i< memberList.size(); i++) {
			memVO = memberList.get(i);
			if(id.equals(memVO.getId())) {
				break;
			}
			memVO = null;
		}
		return memVO;
	}
		
	// 새로운 회원 등록
	@Override
	public void regMember(MemberVO memberVO) throws MemberException, IOException{
		String memData = null;
		printer = new PrintWriter(new FileWriter(memberFile, true));// 기존 파일 내용에 추가합니다.	      
		String id = memberVO.getId();
		if(id == null || id.equals("")) {
			printer.close();
			throw new MemberException("아이디는 필수 입력 정보입니다.");
		}else {
			memData= memberVO.getId() + "," +
		   	         memberVO.getPassword() + "," +
		   	         memberVO.getName()+"," +
			         memberVO.getAddress() + ","  + 
			         memberVO.getPhoneNum();
			printer.println(memData);
			System.out.println("회원 등록했습니다.");
			printer.close();

		}
	}


	// 기존 회원 정보 수정
	@Override
	public void modMember(MemberVO memberVO) throws MemberException, IOException{
		String memData = null;
		printer = new PrintWriter(new FileWriter(memberFile, false));// 기존 파일 내용을 덮어습니다.
		
		String id = memberVO.getId();
		String password = memberVO.getPassword();
		String name = memberVO.getName();
		String address = memberVO.getAddress();
		String phoneNum = memberVO.getPhoneNum();
		
		MemberVO memVO = null;
		for(int i=0; i< memberList.size(); i++){
			memVO = memberList.get(i);
			if(id.equals(memVO.getId())) {
				memVO.setPassword(password);
				memVO.setName(name);
				memVO.setAddress(address);
				memVO.setPhoneNum(phoneNum);
				break;
			}
		}
		
		//수정한 ArrayList의 회원 정보를 다시 파일에 저장합니다.
		for(int i=0; i< memberList.size(); i++) {
			memVO = memberList.get(i);
			memData = memVO.getId() + "," +
					  memVO.getPassword() + "," + 
					  memVO.getName()+"," +
					  memVO.getAddress() + ","  + 
					  memVO.getPhoneNum();
			printer.println(memData);
		}
		printer.close();
		
	}

	// 기존 회원 정보 삭제
	@Override
	public void delMember(MemberVO memberVO) throws MemberException, IOException {
		String memData = null;
		printer = new PrintWriter(new FileWriter(memberFile, false));// 기존 파일 내용을 덮어습니다.
		
		MemberVO memVO = null;
		String id = memberVO.getId();
		for(int i = 0; i< memberList.size(); i++) {
			memVO = memberList.get(i);
			if(id.equals(memVO.getId())) {
				memberList.remove(i);
			}
		}
		
		//삭제한 ArrayList의 회원 정보를 다시 파일에 저장합니다.
		for(int i=0; i< memberList.size(); i++) {
			memVO = memberList.get(i);
			memData= memVO.getId() + "," +
					 memVO.getPassword() + "," +
					 memVO.getName()+"," +
					 memVO.getAddress() + ","  + 
					 memVO.getPhoneNum();
			printer.println(memData);
		}
		
		printer.close();

	}
	
}
