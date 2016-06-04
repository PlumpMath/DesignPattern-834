package dp.creational.AbstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(int facId) {
		if (facId == 1) {
			return new ConcreateFactory1();
		} else if (facId == 2)
			return new ConcreateFactory2();
		else 
			return null;
	}
}
