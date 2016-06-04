package dp.creational.FactoryMethod;

public class ConcreteFactoryB implements Factory{
	public Product createProduct() {
		return new ConcreteProductB();
	}

}
