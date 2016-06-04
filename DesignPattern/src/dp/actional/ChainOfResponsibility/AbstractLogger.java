package dp.actional.ChainOfResponsibility;

public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void logMsg(int level, String msg) {
		if(this.level < level)
			this.write(msg);
		if(this.nextLogger != null)
			this.nextLogger.logMsg(level, msg);
	}
	
	public abstract void write(String msg);
}
