package dp.actional.Command;

public class Controller {
	Command command;
	
	public Controller(Command command) {
		this.command = command;
	}
	
	public void executeCommand() {
		this.command.execute();
	}
}
