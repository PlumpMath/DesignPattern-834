package dp.creational.SimpleFactory;

public class Factory {
	public Product createProduct(String type) {
		if (type.equalsIgnoreCase("A")) {
			return new ConcreteProductA();
		} else if(type.equalsIgnoreCase("B")) {
			return new ConcreteProductB();
		}
		return null;
	}
}
