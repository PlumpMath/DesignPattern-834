package dp.structural.Flyweight;

import java.util.HashMap;


// 享元工厂
public class FlyweightFactory {
	// map存放享元信息
	private HashMap<String, Flyweight> map = new HashMap<String, Flyweight>();
	
	// 单例模式
	private static class Holder {
		private static FlyweightFactory INSTANCE = new FlyweightFactory();
	}
	
	private FlyweightFactory() {}
	
	public static FlyweightFactory getInstance() {
		return Holder.INSTANCE;
	}
	
	/** 核心代码 , 共享信息缓存 **/
	public synchronized Flyweight getFlyweight(String key) {
		Flyweight flyweight = this.map.get(key);
		
		if (flyweight == null) {
			String[] args = key.split(",");
			double width = Double.parseDouble(args[0]);
			double height = Double.parseDouble(args[1]);
			double weight = Double.parseDouble(args[2]);
			flyweight = new ConcreteFlyweight(width, height, weight);
			this.map.put(key, flyweight);
			
		}
		
		return flyweight;
	}
	
	// 内部类，具体享元类
	class ConcreteFlyweight implements Flyweight {

		double width, height, weight;
		
		public ConcreteFlyweight(double width, double height, double weight) {
			this.width = width;
			this.height = height;
			this.weight = weight;
		}
		
		@Override
		public double getWidth() {
			return this.width;
		}

		@Override
		public double getHeight() {
			return this.height;
		}

		@Override
		public double getWeight() {
			return this.weight;
		}

		@Override
		public void info(String str) {
			System.out.print("width: " + width + 
					", height: " + height + ", weight: " + weight);
		}
		
	}
}