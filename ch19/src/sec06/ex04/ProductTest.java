package sec06.ex04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) throws IOException {
		File file1 = new File("src\\sec06\\exec04\\product.txt");
		FileOutputStream fos = new FileOutputStream(file1);
		PrintWriter writer = new PrintWriter(fos, true);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("제품 정보를 입력하세요. 종료: quit");
			System.out.print("제품번호:");
			
			String prodCode = sc.nextLine();
			if(prodCode.equals("quit")) break;
			
			System.out.print("제품이름:");
			String prodName = sc.nextLine();
			
			System.out.print("제품색상:");
			String prodColor = sc.nextLine();
			
			System.out.print("제품단가:");
			String prodPrice = sc.nextLine();
			
			String prodData = prodCode +", " + prodName +", " + prodColor+", " + prodPrice; 
			writer.println(prodData);
		}
		sc.close();
		writer.close();


	}

}
