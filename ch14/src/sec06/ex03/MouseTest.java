package sec06.ex03;

public class MouseTest {
	public static void main(String[] args) {
		MouseEventHandler handler = new MouseEventHandler();
		
		handler.mouse.mouseClicked(10, 20);
		handler.mouse.mouseClicked(50, 60);

	}

}
