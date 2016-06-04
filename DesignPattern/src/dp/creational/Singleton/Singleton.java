package dp.creational.Singleton;

public class Singleton {
	private static final class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
