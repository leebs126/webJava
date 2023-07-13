package sec06.ex03;

public class MouseEventHandler {
	Mouse mouse = new Mouse();

	MouseEventListener listener = new MouseEventListener() {
		@Override
		public void mouseClicked(int x, int y) {
			System.out.println("마우스 클릭 위치 x = " + x + ",. y = " + y);
		}
	};
	
	 MouseEventHandler(){
		 mouse.addMouseEventListener(listener);
	 }

}
