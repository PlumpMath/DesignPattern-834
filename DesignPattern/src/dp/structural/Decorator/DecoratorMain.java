package dp.structural.Decorator;

public class DecoratorMain {
	public static void main(String[] args) {
		Shape shape = new Circle();
		Shape decoratedShape = new RedShapeDecorator(shape);
		decoratedShape.draw();
		
		shape = new Rectangle();
		decoratedShape = new GreenShapeDecorator(shape);
		decoratedShape.draw();
		
	}
}
