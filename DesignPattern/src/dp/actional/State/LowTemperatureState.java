package dp.actional.State;

public class LowTemperatureState implements TemperatureState {
	private double val = 20;
	
	public LowTemperatureState(double val) {
		if(val >= -10 && val <=10)
			this.val = val;
	}
	
	@Override
	public void show() {
		System.out.println("low temperature : " + this.val);
	}

}
