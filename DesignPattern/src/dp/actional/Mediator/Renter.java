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
		System.out.println("������[" + this.name + "]�յ������н����Ϣ��" + msg);
	}

}
