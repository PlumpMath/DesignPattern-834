package dp.actional.Proxy;

public class Triangle implements Geometry {
	double a, b, c, area;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	@Override
	public double getArea() {
		double p = (a + b + c) / 2.0;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}
	

}
