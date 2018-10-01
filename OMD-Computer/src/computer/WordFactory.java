package computer;

public interface WordFactory<T extends Word<T>> {

	public T word(String word);
	
}
