package dp.actional.Observer;

public class HexStrObserver extends Observer {
	
	public HexStrObserver(Subject subject) {
		super(subject);
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("binary string is : " + 
				Integer.toHexString(this.subject.getState()).toUpperCase());
	}

}
