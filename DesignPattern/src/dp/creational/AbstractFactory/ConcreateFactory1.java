package dp.creational.AbstractFactory;

public class ConcreateFactory1 extends AbstractFactory{

	@Override
	ProductA createProductA() {
		return new ProductA1();
	}

	@Override
	ProductB createProductB() {
		return new ProductB1();
	}
	

}
