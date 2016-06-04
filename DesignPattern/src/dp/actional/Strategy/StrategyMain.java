package dp.actional.Strategy;

public class StrategyMain {
	public static void main(String[] args) {
		int num1 = 2, num2 = 5;
		Context context = new Context(new AddStrategy());
		System.out.println(context.executeStrategy(num1, num2));
		
		context = new Context(new SubstractStrategy());
		System.out.println(context.executeStrategy(num1, num2));
		
		context = new Context(new MutipleStrategy());
		System.out.println(context.executeStrategy(num1, num2));
	}
}
