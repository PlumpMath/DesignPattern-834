package dp.actional.State;

public class MidTemperatureState implements TemperatureState {
	private double val = 20;
	
	public MidTemperatureState(double val) {
		if(val >= 10 && val <=30)
			this.val = val;
	}
	
	@Override
	public void show() {
		System.out.println("mid temperature : " + this.val);
	}

}
