package dp.creational.FactoryMethod;

public class ConcreteFactoryA implements Factory{
	public Product createProduct() {
		return new ConcreteProductA();
	}

}
