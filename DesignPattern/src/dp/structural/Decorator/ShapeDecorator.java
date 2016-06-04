package dp.structural.Decorator;

public abstract class ShapeDecorator implements Shape{
	
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape shape) {
		this.decoratedShape = shape;
	}
	
	public abstract void draw();
}
