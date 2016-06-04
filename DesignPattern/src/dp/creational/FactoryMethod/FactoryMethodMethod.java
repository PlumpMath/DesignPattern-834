package dp.creational.FactoryMethod;

public class FactoryMethodMethod {
	public static void main(String[] args) {
		Factory factory = new ConcreteFactoryA();
		Product product = factory.createProduct();
		product.use();
		
		factory = new ConcreteFactoryB();
		product = factory.createProduct();
		product.use();
	}
}
