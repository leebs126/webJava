package sec03.ex03;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {

	public static void main(String[] args) {
		//Vector 객체 생성
//		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map = new Hashtable<Integer, String>();
//		Map<Integer, String> map = Collections.synchronizedMap(new  Hashtable<Integer, String>());
		
		
		
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=100; i++) {
					map.put(i, "홍길동"+i);
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=101 ; i<=200; i++) {
					map.put(i, "이순신"+i);
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
		
		//총 엔크리 개수 얻기
		int size = map.size();
		System.out.println("총 엔크리 개수 : " + size);
		

	}

}

