package dp.creational.Builder;

public class VegBuilder implements AbstractBuilder{
	
	public KFCMeal prepareMeal() {
		KFCMeal meal = new KFCMeal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

}
