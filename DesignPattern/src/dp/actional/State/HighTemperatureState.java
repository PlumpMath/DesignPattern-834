package dp.actional.State;

public class HighTemperatureState implements TemperatureState {
	private double val = 39.5;
	
	public HighTemperatureState(double val) {
		if(val >= 30 && val <=45)
			this.val = val;
	}
	
	@Override
	public void show() {
		System.out.println("high temperature : " + this.val);
	}

}
