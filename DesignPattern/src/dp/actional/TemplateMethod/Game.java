package dp.actional.TemplateMethod;

public abstract class Game {
	
	public abstract void ini();
	
	public abstract void start();
	
	public abstract void end();
	
	public final void play() {
		ini();
		
		start();
		
		end();
	}
	
}
