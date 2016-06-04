package dp.actional.Memento;

public class Originator {
	String state;
	
	public Originator () {
		
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
	
	public Memento createMemento() {
		Memento memento = new Memento();
		memento.setState(this.state);
		return memento;
	}
	
	public void restoreFromMemento(Memento memento) {
		this.setState(memento.getState());
	}
}
