package sec01.ex01;

public class InnerTest {
	public static void main(String[] args) {
		Outter outter = new Outter("홍길동" , 20 );
		Outter.Inner inner = outter.new Inner( "서울시 종로구" );
		System.out.println( "고객정보 >> " + inner.getUserInfo( ) );
	}

}
