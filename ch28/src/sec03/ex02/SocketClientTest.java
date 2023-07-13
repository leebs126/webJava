package sec03.ex02;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class SocketClientTest {
	public static void main(String[] args) throws Exception {
		
		new SocketClientTest().startClient();
	}
	
 
    public void startClient()
            throws IOException, InterruptedException {
 
        InetSocketAddress hostAddress = new InetSocketAddress("localhost", 9988);
        SocketChannel client = SocketChannel.open(hostAddress);
 
        System.out.println("클라이언트 접속합니다.");
        Scanner sc = new Scanner(System.in);
        String messages ="";
        while(true) {
        	messages = sc.nextLine();
        	byte [] message = new String(messages).getBytes();
        	ByteBuffer buffer = ByteBuffer.wrap(message);
          client.write(buffer);
          System.out.println(messages);
          buffer.clear();     	
        	
        }
        
//        String threadName = Thread.currentThread().getName();
// 
//        // Send messages to server
//        String [] messages = new String [] 
//        		{threadName + ": test1",threadName + ": test2",threadName + ": test3"};
// 
//        for (int i = 0; i < messages.length; i++) {
//            byte [] message = new String(messages [i]).getBytes();
//            ByteBuffer buffer = ByteBuffer.wrap(message);
//            client.write(buffer);
//            System.out.println(messages [i]);
//            buffer.clear();
//            Thread.sleep(5000);
//        }
//        client.close();            
    }
}

