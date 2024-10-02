package sec01.ex01;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressMethodTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//호스트 이름과 IP주소 얻기
		InetAddress addr1 = InetAddress.getByName("www.oracle.com");  
		byte[] address1 = addr1.getAddress();
		System.out.println(Arrays.toString(address1));
		
		String address2 = addr1.getHostAddress();  //23.52.33.217
		System.out.println(address2);
		
		String hostName = addr1.getHostName();
		System.out.println(hostName);
		System.out.println();
		
		System.out.println(addr1.isReachable(2000));
		
	}
}
