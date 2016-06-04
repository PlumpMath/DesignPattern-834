package dp.actional.Observer;

public class BinaryStrObserver extends Observer {
	
	public BinaryStrObserver(Subject subject) {
		super(subject);
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("binary string is : " + 
				Integer.toBinaryString(this.subject.getState()));
	}

}
