package sec07.ex02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf4 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf5 = new SimpleDateFormat("dd");
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf7 = new SimpleDateFormat("hh시 mm분 ss초");
		
		System.out.println(sdf1.format(new Date()));
		System.out.println(sdf2.format(new Date()));
		System.out.println(sdf3.format(new Date()));
		System.out.println(sdf4.format(new Date()));
		System.out.println(sdf5.format(new Date()));
		System.out.println(sdf6.format(new Date()));
		System.out.println(sdf7.format(new Date()));

	}

}
