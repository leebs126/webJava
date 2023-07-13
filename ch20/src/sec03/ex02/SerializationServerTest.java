package sec03.ex02;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class SerializationServerTest {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		ArrayList<Employee> eList = new ArrayList<Employee>();
		
		serverSocket = new ServerSocket(9999);
		while (true) {
			System.out.println("서버 실행 중!!!!");
			Socket socket= serverSocket.accept();
			
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			Employee employee1 = new Employee("홍길동", "서울시 강남구", "111111-2222222", "010-123-1111");
			eList.add(employee1);
			
			Employee employee2 = new Employee("이순신", "수원시 팔달구", "333333-1212121", "010-123-2222");
			eList.add(employee2);
			oos.writeObject(eList);

			oos.close();
			socket.close();
		}

	}

}
