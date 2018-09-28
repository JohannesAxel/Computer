package computer;

public interface Word<T extends Word<T>> extends Input{
	
	public Object get();
	
	public T add(T word);
	
	public T mul(T word);
	
	
	public default boolean adress(){
		return false;
	}
}
