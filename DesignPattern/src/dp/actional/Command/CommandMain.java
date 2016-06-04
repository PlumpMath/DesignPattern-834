package dp.actional.Command;

public class CommandMain {

	public static void main(String[] args) {
		TV tv = new TV();
		Command openCommand = new OpenCommand(tv);
		Controller controller = new Controller(openCommand);
		controller.executeCommand();
		
		Command closeCommand = new CloseCommand(tv);
		controller = new Controller(closeCommand);
		controller.executeCommand();
	}

}
