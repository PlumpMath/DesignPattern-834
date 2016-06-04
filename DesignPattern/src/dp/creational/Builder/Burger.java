package dp.creational.Builder;

public abstract class Burger implements Item{
	@Override
	public Packing pack() {
		return new Wrapper();
	}
	
	public abstract String name();
	
	public abstract float price();
}
