package dp.creational.AbstractFactory;

public class ConcreateFactory2 extends AbstractFactory{

	@Override
	ProductA createProductA() {
		return new ProductA2();
	}

	@Override
	ProductB createProductB() {
		return new ProductB2();
	}
	

}
