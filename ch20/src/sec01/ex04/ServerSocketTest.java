package sec01.ex04;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class ServerSocketTest {
	public static void main(String[] args) throws IOException {
		//ServerSocket객체생성
		ServerSocket serverSocket1 = new ServerSocket();
		System.out.println(serverSocket1.isBound());  //false
		
		serverSocket1.bind(new InetSocketAddress("127.0.0.1",8888));
		System.out.println(serverSocket1.isBound());  //true
		
		ServerSocket serverSocket2 = new ServerSocket(9999);
		System.out.println(serverSocket2.isBound());//true

		serverSocket1.close();
		serverSocket2.close();
		

	}

}
