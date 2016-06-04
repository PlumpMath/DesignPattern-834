package dp.actional.Command;

public class CloseCommand implements Command{
	private TV tv;
	
	public CloseCommand(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		this.tv.close();
	}
	

}
