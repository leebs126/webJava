package sec03.ex01;

import java.nio.*;
import java.nio.channels.*;
import java.util.*;
import java.net.*;
import java.io.*;

public class NIOMultiChatServer {
	private String host = "localhost";
	private int port = 9988;
	private Selector selector;
	private ServerSocketChannel serverChannel;
	private ServerSocket serverSocket;
	private ArrayList list = new ArrayList();

	public NIOMultiChatServer() {
		try {
			selector = Selector.open();
			serverChannel = ServerSocketChannel.open();
			serverChannel.configureBlocking(false);
			InetSocketAddress isa = new InetSocketAddress(host, port);
//			serverSocket.bind(isa);
			serverChannel.bind(isa);
			serverChannel.register(selector, SelectionKey.OP_ACCEPT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		readyServer();
	}

	public void readyServer() {
		try {
			while (true) {
				System.out.println("요청 대기 중...");
				selector.select();  //미리 등록된 채널들을 깨운 후, 채널들의 키수를 리턴
				Iterator iterator = selector.selectedKeys().iterator();
				while (iterator.hasNext()) {
					SelectionKey key = (SelectionKey) iterator.next();
					if (key.isAcceptable()) {
						accept(key);
					} else if (key.isReadable()) {
						read(key);
					}
					iterator.remove();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void accept(SelectionKey key) {
		ServerSocketChannel serverChannel = (ServerSocketChannel) key.channel();
		SocketChannel socketChannel = null;
		try {
			socketChannel = serverChannel.accept();
			if (socketChannel == null)
				return;
			socketChannel.configureBlocking(false);
			socketChannel.register(selector, SelectionKey.OP_READ);
			list.add(socketChannel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void read(SelectionKey key) {
		SocketChannel socketChannel = (SocketChannel) key.channel();
		ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
		try {
			int read = socketChannel.read(buffer);
		} catch (IOException e) {
			try {
				socketChannel.close();
			} catch (IOException e1) {}
			list.remove(socketChannel);
		}
		try {
			broadCasting(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		buffer.clear();
	}

	public void broadCasting(ByteBuffer buffer) throws IOException {
		buffer.flip();
		for (int i = 0; i < list.size(); i++) {
			SocketChannel sc = (SocketChannel) list.get(i);
			sc.write(buffer);
			buffer.rewind();
		}
	}

	public static void main(String[] args) {
		new NIOMultiChatServer();
	}
}
