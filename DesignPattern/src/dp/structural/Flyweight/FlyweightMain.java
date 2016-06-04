package dp.structural.Flyweight;

public class FlyweightMain {
	public static void main(String[] args) {
		FlyweightFactory factory = FlyweightFactory.getInstance();
		String infoAudi = "1.5,1.8,3000";
		Flyweight flyweight = factory.getFlyweight(infoAudi);
		Car audi1 = new Car(flyweight, "audi1", "black", 2);
		Car audi2 = new Car(flyweight, "audi2", "white", 2);
		
		String infoBenz = "2.0,2.8,5000";
		Flyweight flyweight2 = factory.getFlyweight(infoBenz);
		Car benz1 = new Car(flyweight2, "benz1", "red", 2);
		Car benz2 = new Car(flyweight2, "benz2", "green", 2);
		
		audi1.info();
		audi2.info();
		benz1.info();
		benz2.info();
		
		
	}
}	
