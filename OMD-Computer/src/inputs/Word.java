package inputs;

public interface Word<T extends Comparable> extends Input {

	public void add(T word);

	public void mul(T word);

	public void set(T word);

	public T getValue();

	public String toString();

}
