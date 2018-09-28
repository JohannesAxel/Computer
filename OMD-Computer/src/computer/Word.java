package computer;

public interface Word<T extends Word<T>> extends Input{
	
	public T add(T word);
	
	public T mul(T word);
	
	public T set(T word);
	
	public default boolean adress(){
		return false;
	}
}
