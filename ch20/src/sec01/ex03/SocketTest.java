package sec01.ex03;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketTest {
	public static void main(String[] args) throws IOException {
		// Socket 객체생성
		Socket socket1 = new Socket();
		// 원격지 주소 정보 얻기
		System.out.println(socket1.getInetAddress() + ":" + socket1.getPort()); // null:0

		socket1.connect(new InetSocketAddress("www.oracle.com", 80));
		System.out.println(socket1.getInetAddress() + ":" + socket1.getPort());
		System.out.println();

		Socket socket2 = new Socket("www.oracle.com", 80); //JVM이 로컬 포트 번호를 자동으로 할당합니다.  
//		Socket socket2 = new Socket("104.74.207.23", 80); //IP 주소를 입력해서 연결합니다.  
		System.out.println(socket2.getInetAddress() + ":" + socket2.getPort());
		System.out.println(socket2.getLocalAddress()+":"+socket2.getLocalPort());
		System.out.println();
		
		Socket socket3 = new Socket("www.oracle.com", 80, InetAddress.getLocalHost(), 9999);  //로컬 IP 주소와 포트 번호를 원격지에 전달합니다.
		System.out.println(socket3.getInetAddress() + ":" + socket3.getPort());
		System.out.println(socket3.getLocalAddress()+":"+socket3.getLocalPort());
		System.out.println();
		
		socket1.close();
		socket2.close();
		socket3.close();
		
//		Socket socket4 = new Socket(InetAddress.getByName("www.oracle.com"), 80);
//		Socket socket5 = new Socket(InetAddress.getByName("www.oracle.com"), 80, InetAddress.getLocalHost(), 8888);
//		socket4.close();
//		socket5.close();
		

	}

}
