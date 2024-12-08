package sec04.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//flatMap() 메서드 이용하지 않고 "홍길동" 이름만 제외해서 출력하기
public class NameTest1 {

	public static void main(String[] args) {
		String[][] nested = new String[][]{{"홍길동", "이순신"}, 
			                               {"박지성", "차범근"}, 
			                               {"손흥민", "임꺽정"}};
			                               
      List<String> nameList = new ArrayList<>();

      //2차원 배열에서 중첩 for문으로 접근하기
      for (String[] arrName : nested) {
          for (String name : arrName) {
              if(!name.equals("홍길동")) nameList.add(name);
          }
      }

      String[] exclude = nameList.toArray(new String[nameList.size()]);
      System.out.println(Arrays.toString(exclude));		

	}
}





