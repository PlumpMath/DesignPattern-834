package dp.actional.Mediator;

public class Landlord extends Person{

	public Landlord(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void sendMsg(String msg) {
		this.mediator.operation(this, msg);
	}

	@Override
	public void getMsg(String msg) {
		System.out.println("����[" + this.name + "]�յ������н����Ϣ��" + msg);
	}

}
