package sec01.ex01;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {

	public static void main(String[] args) throws UnknownHostException {

		//InetAddress객체 생성
		InetAddress addr1 = InetAddress.getByName("www.oracle.com");  //104.74.162.89
		InetAddress addr2 = InetAddress.getByAddress(new byte[] {(byte)104,(byte)74,(byte)162,(byte)89});
		InetAddress addr3= InetAddress.getByAddress("www.jweb.com", new byte[] {(byte)104,(byte)74,(byte)162,(byte)89});
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(addr3);
		System.out.println();
		
		//로컬/루프백 IP
		InetAddress addr4 = InetAddress.getLocalHost();
		InetAddress addr5 = InetAddress.getLoopbackAddress(); //localhost/127.0.0.1
		System.out.println(addr4);
		System.out.println(addr5);
		System.out.println();
		
		//하나의 호스트가 여러개의IP를 가지고 있는 경우
		InetAddress[] addr6 = InetAddress.getAllByName("www.naver.com");
		System.out.println(Arrays.toString(addr6));

	}

}
