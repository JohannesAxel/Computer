package inputs;

public interface Word extends Input {

	public void add(Word left, Word right);

	public void mul(Word left, Word right);

	public void set(Word word);
	
	public boolean equals(Word word);
	
	public String toString();

}
