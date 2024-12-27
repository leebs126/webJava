package sec03.ex01;

import java.io.IOException;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.util.*;

public class NIOMultiClientThread extends Thread {
	private NIOClient nc;
	private Charset charset;
	private CharsetDecoder decoder;

	public NIOMultiClientThread(NIOClient nc) {
		this.nc = nc;
		charset = Charset.forName("UTF-8");
		decoder = charset.newDecoder();
	}

	public void run() {
		String message = null;
		String[] receivedMsg = null;
		Selector selector = nc.getSelector();
		boolean isStop = false;
		
		while (!isStop) {
			try {
				selector.select();
				Iterator iterator = selector.selectedKeys().iterator();
				
				while (iterator.hasNext()) {
					SelectionKey key = (SelectionKey) iterator.next();
					if (key.isReadable()) {
						message = read(key);
					}
					iterator.remove();
				} // end while
				receivedMsg = message.split("#");
			} catch (Exception e) {
				e.printStackTrace();
				isStop = true;
			}
			System.out.println(receivedMsg[0] + "," + receivedMsg[1]);
			if (receivedMsg[1].equals("exit")) {
				if (receivedMsg[0].equals(nc.getId())) {
					nc.exit();
				} else {
					nc.getJta().append(receivedMsg[0] + "님이 종료하셨습니다." + System.getProperty("line.separator"));
					nc.getJta().setCaretPosition(nc.getJta().getDocument().getLength());
				}
			} else {
				nc.getJta().append(receivedMsg[0] + " : " + receivedMsg[1] + System.getProperty("line.separator"));
				nc.getJta().setCaretPosition(nc.getJta().getDocument().getLength());

			}
		}
	}

	public String read(SelectionKey key) {
		SocketChannel sc = (SocketChannel) key.channel();
		ByteBuffer buffer = ByteBuffer.allocateDirect(1024);  //메시지 수신용 버퍼
		try {
			sc.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
			try {
				sc.close();
			} catch (IOException e1) {
			}
		}
		System.out.println(buffer);
		buffer.flip();
		String message = null;
		
		try {
			message = decoder.decode(buffer).toString();
		} catch (CharacterCodingException e) {
			e.printStackTrace();
		}
		System.out.println("message : " + message);
		return message;
	}
}
