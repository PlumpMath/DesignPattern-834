package dp.structural.Bridge;

public abstract class Shape {
	protected CircleDrawer drawer;
	
	public Shape(CircleDrawer drawer) {
		this.drawer = drawer;
	}
	
	public abstract void draw();
}
