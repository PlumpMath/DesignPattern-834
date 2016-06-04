package dp.actional.Proxy;

public class ProxyMain {
	public static void main(String[] args) {
		double a = 3, b = 4, c = 5;
		TriangleProxy proxy = new TriangleProxy();
		proxy.setSides(a, b, c);
		System.out.println(proxy.getArea());
		
		
		proxy.setSides(1, 2, 3);
		System.out.println(proxy.getArea());
	}
}
