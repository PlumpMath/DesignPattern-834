package dp.actional.Visitor;

public class Undergraduate extends Student{
	String name;
	double math, english, physics;
	
	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public Undergraduate(String name, double math, double english, double physics) {
		this.name = name;
		this.math = math;
		this.english = english;
		this.physics = physics;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
