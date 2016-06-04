package dp.actional.Mediator;

public class Renter extends Person{

	public Renter(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void sendMsg(String msg) {
		this.mediator.operation(this, msg);
	}

	@Override
	public void getMsg(String msg) {
		System.out.println("求租者[" + this.name + "]收到来自中介的消息：" + msg);
	}

}
