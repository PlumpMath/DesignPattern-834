package dp.structural.Decorator;

public class GreenShapeDecorator extends ShapeDecorator{

	public GreenShapeDecorator(Shape shape) {
		super(shape);
	}
	
	@Override
	public void draw() {
		setBorder(this.decoratedShape);
		this.decoratedShape.draw();
	}
	
	public void setBorder(Shape decoratedshape) {
		System.out.println("border color : green");
	}
}

