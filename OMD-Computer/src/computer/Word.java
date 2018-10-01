package computer;

public interface Word<T extends Word<T>> extends Input{
	
	public T add(T word);
	public T mul(T word);
	public void set(T word);
	public int compareTo(T word);
	public String toString();
	
	}

