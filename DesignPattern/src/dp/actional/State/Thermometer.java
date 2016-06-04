package dp.actional.State;

public class Thermometer {
	private TemperatureState state;
	
	public void setState(TemperatureState state) {
		this.state = state;
	}
	
	public void showState() {
		this.state.show();
	}
}
