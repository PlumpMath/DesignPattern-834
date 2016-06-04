package dp.creational.Builder;

import java.util.ArrayList;

public class KFCMeal {
	private ArrayList<Item> items = new ArrayList<Item>(3);
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float totalPrice() {
		float price = 0.0f;
		for(Item item : items)
			price += item.price();
		return price;
	}
	
	public void info() {
		for(Item item : items) {
			System.out.print(item.name() + " ");
			System.out.print(item.price()+ " ");
			System.out.println(item.pack().pack());
		}
	}
}
