package cafe_correction;

public abstract class Boisson {
	protected String description;
	
	public String getDescription(){
		return description;
	}

	public abstract double cout();
	
	public String toString(){
		return getDescription()+" : "+ cout();
	}
}
