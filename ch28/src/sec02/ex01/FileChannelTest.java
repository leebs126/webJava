package sec02.ex01;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelTest {
	public static void main(String[] args) throws IOException {
		FileChannel fileChannel = FileChannel.open(Paths.get("src\\sec02\\ex01\\test.txt"), 
													StandardOpenOption.CREATE,
													StandardOpenOption.READ,
													StandardOpenOption.WRITE);
		
		//파일 쓰기
		String message = "안녕하세요";
		ByteBuffer byteBuffer1 = ByteBuffer.allocate(20);
		byteBuffer1.put(message.getBytes());
		byteBuffer1.flip();  //현재 position 위치에 limit를 위치 시킵니다. 
		fileChannel.write(byteBuffer1);
		
		//파일 읽기
		ByteBuffer byteBuffer2 = ByteBuffer.allocate(20);
		fileChannel.position(0);
		fileChannel.read(byteBuffer2);
		byteBuffer2.flip();
		byte[] b = byteBuffer2.array();
		System.out.println(new String(b));
		
		fileChannel.close();

	}

}
