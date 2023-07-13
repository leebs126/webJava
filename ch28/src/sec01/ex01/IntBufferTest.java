package sec01.ex01;

import java.nio.IntBuffer;

public class IntBufferTest {
	public static void main(String[] args) {
		int position = 0;
		IntBuffer intBuffer = IntBuffer.allocate(5);
		System.out.println("position: " + intBuffer.position() +" limit: " + intBuffer.limit() ) ;
		
		intBuffer.put(10); // 정수를 차례대로 추가할 때마다 position의 값이 1씩 증가합니다.
		System.out.println("position: " + intBuffer.position() +" limit: " + intBuffer.limit() ) ;
		
		intBuffer.put(20);
		System.out.println("position: " + intBuffer.position() +" limit: " + intBuffer.limit() ) ;
		
		intBuffer.put(30);
		System.out.println("position: " + intBuffer.position() +" limit: " + intBuffer.limit() ) ;
		
		intBuffer.put(40);
		System.out.println("position: " + intBuffer.position() +" limit: " + intBuffer.limit() ) ;
		
		intBuffer.put(50);
		System.out.println("position: " + intBuffer.position() +" limit: " + intBuffer.limit() ) ;
		System.out.println();
		
		intBuffer.flip(); //현재  position을 limit로 설정하고, position을 0으로 설정합니다.
		while(intBuffer.hasRemaining()) { //현재 position과 limit사이에 데이터가 있으면 차례대로 출력합니다.
			position = intBuffer.position();
			System.out.println("position: " + position+", 값: " + intBuffer.get());
		}
		System.out.println();
		
		intBuffer.clear(); //현재 position을 0으로 설정한 후, limit를 capacity로 설정합니다.
		intBuffer.put(4, 60); //마지막 요소에 값을 넣습니다.
		intBuffer.rewind();
		while(intBuffer.hasRemaining()) {
			position = intBuffer.position();
			System.out.println("position: " + position+", 값: " + intBuffer.get());
		}
	}

}
