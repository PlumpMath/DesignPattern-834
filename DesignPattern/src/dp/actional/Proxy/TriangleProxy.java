package dp.actional.Proxy;

public class TriangleProxy implements Geometry{
	private double a, b, c, area;
	private Triangle triangle;
	
	public TriangleProxy() {
		
	}
	
	public void setSides(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	private boolean isTriangle(double a, double b, double c) {
		boolean condition = (a + b) > c && (a + c) > b && (b + c) > a;
		if (condition) {
			this.triangle = new Triangle(a, b, c);
			return true;
		}
		return false;
	}
	
	
	@Override
	public double getArea() {
		if (isTriangle(a, b, c)) {
			area = this.triangle.getArea();
			return area;
		}
		return -1;
	}

}
