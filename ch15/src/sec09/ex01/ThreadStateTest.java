package sec09.ex01;

enum ThreadState {NEW, RUNNABLE, WAITING, TIMED_WAITING, BLOCKED, TERMINATED}

public class ThreadStateTest {
	public static void main(String[] args) {
		
		ThreadState state1 = ThreadState.WAITING;
		System.out.println(state1.name());
		System.out.println("인덱스: " + state1.ordinal());
		
		ThreadState state2 = ThreadState.BLOCKED;
		switch(state2) {
		case NEW:
			System.out.println("스레드 생성 상태");
			break;
		case RUNNABLE:
			System.out.println("스레드 실행 상태");
			break;
		case WAITING:
			System.out.println("스레드 정지 상태");
			break;
			
		case TIMED_WAITING:
			System.out.println("스레드 일시 정지 상태");
			break;
			
		case BLOCKED:
			System.out.println("스레드 정지 상태");
			break;
		case TERMINATED:
			System.out.println("스레드 종료 상태");
			break;
			
		}

	}

}
