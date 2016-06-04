package dp.creational.Builder;

public class NonVegBuilder implements AbstractBuilder{
	
	public KFCMeal prepareMeal() {
		KFCMeal meal = new KFCMeal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
