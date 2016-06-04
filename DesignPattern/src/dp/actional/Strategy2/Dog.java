package dp.actional.Strategy2;

public class Dog implements Comparable<Dog> {
	public Dog(int food) {
		super();
		this.food = food;
	}

	private int food;

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	@Override
	public int compareTo(Dog d) {
		if(this.food > d.getFood()) 
			return 1;
		else if(this.food < d.getFood()) 
			return -1;
		else return 0;
	}
	
	@Override
	public String toString() {
		return this.food + "";
	}
}
