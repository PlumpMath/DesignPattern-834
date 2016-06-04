package dp.actional.Memento;

public class MementoMain {

	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		
		Originator originator = new Originator();
		originator.setState("state no.1 unsaved ...");
		originator.setState("state no.2 saved ...");
		Memento storeMemento = originator.createMemento();
		careTaker.addMemento(storeMemento);
		
		originator.setState("state no.3 saved ...");
		storeMemento = originator.createMemento();
		careTaker.addMemento(storeMemento);
		
		originator.setState("state no.4 saved ...");
		storeMemento = originator.createMemento();
		careTaker.addMemento(storeMemento);
		
		System.out.println("current state: " + originator.getState());
		
		Memento restoreMemento = careTaker.getMemento(0);
		originator.restoreFromMemento(restoreMemento);
		System.out.println("first saved state: " + originator.getState());
		
		restoreMemento = careTaker.getMemento(1);
		originator.restoreFromMemento(restoreMemento);
		System.out.println("second saved state: " + originator.getState());
		
	}

}
