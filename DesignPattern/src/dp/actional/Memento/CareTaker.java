package dp.actional.Memento;

import java.util.ArrayList;

public class CareTaker {
	private ArrayList<Memento> mementos = new ArrayList<Memento>();
	
	public CareTaker() {
		
	}
	
	public void addMemento(Memento memento) {
		this.mementos.add(memento);
	}
	
	public Memento getMemento(int index) {
		return this.mementos.get(index);
	}
}
