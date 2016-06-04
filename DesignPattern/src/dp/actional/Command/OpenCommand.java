package dp.actional.Command;

public class OpenCommand implements Command{
	private TV tv;
	
	public OpenCommand(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		this.tv.open();
	}
	

}
