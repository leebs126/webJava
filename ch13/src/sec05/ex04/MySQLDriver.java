package sec05.ex04;

public class MySQLDriver implements DBDriver {

	@Override
	public void connect() {
		System.out.println("MySQL 데이터베이스에 접속합니다.");

	}

	@Override
	public void login() {
		System.out.println("MySQL 데이터베이스에 로그인합니다.");

	}

	@Override
	public void register() {
		System.out.println("MySQL 데이터베이스에 데이터를 저장합니다.");

	}
	
	@Override
	public void search() {
		System.out.println("MySQL 데이터베이스에서 데이터를 조회합니다.");
	}

	@Override
	public void close() {
		System.out.println("MySQL 데이터베이스 접속을 종료합니다.");

	}

}
