package dp.actional.Observer;

public class ObserverMain {
	public static void main(String[] args) {
		Subject subject = new Subject();
		Observer binaryObs = new BinaryStrObserver(subject);
		Observer octalObs = new OctalStrObserver(subject);
		Observer hexObs = new HexStrObserver(subject);
		
		System.out.println("first state change : ");
		subject.setState(111);
		
		System.out.println("second state change : ");
		subject.setState(333);
	}
}
