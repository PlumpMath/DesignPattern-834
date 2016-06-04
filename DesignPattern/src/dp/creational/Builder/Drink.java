package dp.creational.Builder;

public abstract class Drink implements Item{
	@Override
	public Packing pack() {
		return new Bottle();
	}
	
	public abstract String name();
	
	public abstract float price();
}
