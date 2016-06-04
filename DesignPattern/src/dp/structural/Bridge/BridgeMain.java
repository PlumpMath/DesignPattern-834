package dp.structural.Bridge;

public class BridgeMain {
	public static void main(String[] args) {
		Shape greenCircle = new Circle(0.4, 0.4, 2, new GreenCircleDrawer());
		greenCircle.draw();
		
		Shape redCircle = new Circle(1, 1, 1, new RedCircleDrawer());
		redCircle.draw();
	}
}
