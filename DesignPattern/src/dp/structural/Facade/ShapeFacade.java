package dp.structural.Facade;

public class ShapeFacade {
	private Circle circle;
	private Rectangle rectangle;
	private Triangle triangle;
	
	public ShapeFacade() {
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.triangle = new Triangle();
	}
	
	public void drawCircle() {
		this.circle.draw();
	}
	
	public void drawRectangle() {
		this.rectangle.draw();
	}
	
	public void drawTriangle() {
		this.triangle.draw();
	}
}
