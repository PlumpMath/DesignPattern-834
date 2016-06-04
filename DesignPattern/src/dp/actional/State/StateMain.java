package dp.actional.State;

public class StateMain {
	public static void main(String[] args) {
		Thermometer thermometer = new Thermometer();
		
		HighTemperatureState highTemperatureState = new HighTemperatureState(40);
		MidTemperatureState midTemperatureState = new MidTemperatureState(20);
		LowTemperatureState lowTemperatureState = new LowTemperatureState(5);
		
		thermometer.setState(highTemperatureState);
		thermometer.showState();
		
		thermometer.setState(midTemperatureState);
		thermometer.showState();
		
		thermometer.setState(lowTemperatureState);
		thermometer.showState();
		
	}
}
