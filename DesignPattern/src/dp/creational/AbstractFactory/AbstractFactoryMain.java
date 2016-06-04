package dp.creational.AbstractFactory;

public class AbstractFactoryMain {
	public static void main(String[] args) {
		AbstractFactory factory = FactoryProducer.getFactory(1);
		ProductA productA = (ProductA1) factory.createProductA();
		ProductB productB = (ProductB1) factory.createProductB();
		productA.use();
		productB.eat();
		
		factory = FactoryProducer.getFactory(2);
		productA = factory.createProductA();
		productB = factory.createProductB();
		productA.use();
		productB.eat();
	}
}
