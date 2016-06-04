package dp.structural.Prototype;

public abstract class Shape implements Cloneable{
	protected String id;
	protected String type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public Object clone(){
		Object clonedObj = null;
		try {
			clonedObj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedObj;
	}
	
	abstract void info();
}
