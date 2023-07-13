package sec02.ex05;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutStreamTest {
	public static void main(String[] args) {
        try{
            //바이트데이터로 저장합니다.
        	FileInputStream fis = new FileInputStream("src\\sec02\\ex05\\data.txt");
        	FileOutputStream fos = new FileOutputStream("src\\sec02\\ex05\\data.txt");
        	
        	DataInputStream dis = new DataInputStream(fis);
        	DataOutputStream dos = new DataOutputStream(fos); 
        	
            dos.writeInt(100);
            dos.writeFloat(20.5f);
            dos.writeBoolean(false);
            dos.flush();
            dos.close();
            fos.close();
            
            //저장할 때의 데이터타입 순서대로 읽어와야 합니다.
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readBoolean());
            dis.close();
            fis.close();

        }catch(IOException e){
            e.printStackTrace();
        }

	}

}
