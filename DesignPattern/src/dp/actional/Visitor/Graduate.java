package dp.actional.Visitor;

public class Graduate extends Student{
	String name;
	double math, english;
	
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

	public Graduate(String name, double math, double english) {
		this.name = name;
		this.math = math;
		this.english = english;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
