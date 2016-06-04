package dp.actional.Observer;

import java.util.ArrayList;

public class Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public Subject() {
		this.state = 0;
	}
	
	public void setState(int state) {
		this.state = state;
		this.notifyAllObs();
	}
	
	public int getState() {
		return this.state;
	}
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	
	public void detach(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void notifyAllObs() {
		for(Observer observer : observers) 
			observer.update();
	}
	
	
}
