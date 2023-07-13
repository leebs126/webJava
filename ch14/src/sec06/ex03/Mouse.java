package sec06.ex03;

public class Mouse {
	MouseEventListener listener;
	
	public void addMouseEventListener(MouseEventListener listener) {
		this.listener = listener;
	}
	
	public void mouseClicked(int x, int y) {
		listener.mouseClicked(x, y);
	}

}
