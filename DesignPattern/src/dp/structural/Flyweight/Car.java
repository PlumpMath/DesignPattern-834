package dp.structural.Flyweight;

public class Car {
	Flyweight flyweight;
	String name, color;
	int power;
	
	public Car(Flyweight flyweight, String name, String color, int power) {
		this.flyweight = flyweight;
		this.name = name;
		this.color = color;
		this.power = power;
	}
	
	public void info() {
		System.out.print("name: " + this.name +
				", color: " + this.color + ", power" + this.power );
		System.out.println("width: " + flyweight.getWidth() + 
				", height: " + flyweight.getHeight() + ", weight: " + flyweight.getWidth());
		
	}
}
