package dp.structural.Prototype;

import java.util.HashMap;


public class ShapeCache {
	private static HashMap<String, Shape> map = new HashMap<String, Shape>(3);
	
	public static void loadCache() {
		map.put("circle", new Circle());
		map.put("rectangle", new Rectangle());
		map.put("square", new Square());
	}
	
	public static Shape getShape(String type) {
		return map.get(type);
	}
}
