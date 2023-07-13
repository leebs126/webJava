package sec01.ex02;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class InetSocketAddressTest {

	public static void main(String[] args) throws UnknownHostException {
		//InetAddress객체생성
		InetAddress addr1 = InetAddress.getByName("www.oracle.com");
		int port = 9999;
		
		InetSocketAddress isa1 = new InetSocketAddress(port);
		InetSocketAddress isa2 = new InetSocketAddress("www.oracle.com", port);
		InetSocketAddress isa3 = new InetSocketAddress(addr1, port);
		System.out.println(isa1);
		System.out.println(isa2);
		System.out.println(isa3);
		System.out.println();

		//InetSocketAddress 메서드
		InetAddress ina = isa2.getAddress(); // InetAddress
		System.out.println(ina); 
		System.out.println(ina.getHostName());
		System.out.println(isa2.getHostName());
		System.out.println(isa2.getPort()); // 20000

	}

}
