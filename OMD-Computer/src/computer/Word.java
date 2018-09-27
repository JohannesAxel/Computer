package computer;

public interface Word extends Input{
	
	public Object get();
	
	public Word add();
	
	public default boolean adress(){
		return false;
	}
}
