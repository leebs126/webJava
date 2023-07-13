package sec01.ex04;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue requestQueue = new LinkedList();

//		1. 요청 추가
		requestQueue.add("로그인");
		requestQueue.add("렌터카 예약");
		requestQueue.add("렌터카 등록");
		System.out.println(requestQueue.size());
		System.out.println();

//		2. 요청 접근 및 반환
		String request = (String)requestQueue.poll();
		System.out.println(request);
		System.out.println(requestQueue.poll());
		System.out.println(requestQueue.poll());
		System.out.println();
		
		System.out.println(requestQueue.size());
		System.out.println();

		//3. 2. 요청 추가	
		requestQueue.add("로그인");
		requestQueue.add("로그인");
		requestQueue.add("예약 조회");
		requestQueue.add("렌터카 예약");
		requestQueue.add("회원 가입");
		System.out.println(requestQueue.size());
		System.out.println();
		
		System.out.println(requestQueue.toString());
	}
}
