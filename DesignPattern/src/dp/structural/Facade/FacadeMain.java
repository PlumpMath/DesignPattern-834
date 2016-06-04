package dp.structural.Facade;

public class FacadeMain {

	public static void main(String[] args) {
		ShapeFacade shapeFacade = new ShapeFacade();
		shapeFacade.drawCircle();
		shapeFacade.drawRectangle();
		shapeFacade.drawTriangle();
	}

}
