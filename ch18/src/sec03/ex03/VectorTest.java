package sec03.ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//Vector 객체 생성
		List<String> vList = new Vector<>();
//		List<String> vList = new ArrayList<>();
//		List<String> vList = Collections.synchronizedList(new ArrayList<>());
		
		
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=100; i++) {
					vList.add("홍길동"+i);
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=101 ; i<=200; i++) {
					vList.add("이순신"+i);
				}		
			}
			
		};
		
		//작업 스레드 실행
		threadA.start();
		threadB.start();
		
		
		try {
			threadA.join();
			threadB.join();
		}catch(Exception e) {}
		
		//저장된 총 이름 수 얻기
		int size = vList.size();
		System.out.println("총 학생 수 : " + size);
		

	}

}

