package dp.structural.Bridge;

public class Circle extends Shape{
	private double x, y, radius;
	
	public Circle(double x, double y, double radius, CircleDrawer drawer) {
		super(drawer);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		drawer.draw(x, y, radius);
	}

}
