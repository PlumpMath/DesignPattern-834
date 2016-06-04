package dp.actional.Mediator;

public abstract class Person {
	protected Mediator mediator;
	protected String name;
	
	public Person(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}
	
	public abstract void sendMsg(String msg);
	
	public abstract void getMsg(String msg);
	
}
