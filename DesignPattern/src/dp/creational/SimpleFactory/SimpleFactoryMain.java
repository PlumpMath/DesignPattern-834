package dp.creational.SimpleFactory;

public class SimpleFactoryMain {
	public static void main(String[] args) {
		String type = "B";
		Factory factory = new Factory();
		Product product = factory.createProduct(type);
		product.use();
	}
}
