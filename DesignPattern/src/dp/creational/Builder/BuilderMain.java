package dp.creational.Builder;

public class BuilderMain {
	public static void main(String[] args) {
		AbstractBuilder builer = new VegBuilder();
		KFCMeal meal1 = builer.prepareMeal();
		meal1.info();
		
		builer = new NonVegBuilder();
		meal1 = builer.prepareMeal();
		meal1.info();
	}
}
