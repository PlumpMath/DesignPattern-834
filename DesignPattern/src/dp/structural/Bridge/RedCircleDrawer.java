package dp.structural.Bridge;

public class RedCircleDrawer implements CircleDrawer{

	@Override
	public void draw(double x, double y, double radius) {
		System.out.println("draw circle, x y radius and color :" +
				x + " " + y + " "  + radius  + " " + "red");
	}
	

}
