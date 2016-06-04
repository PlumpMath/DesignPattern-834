package dp.actional.Observer;

public class OctalStrObserver extends Observer {
	
	public OctalStrObserver(Subject subject) {
		super(subject);
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("binary string is : " + 
				Integer.toOctalString(this.subject.getState()));
	}

}
