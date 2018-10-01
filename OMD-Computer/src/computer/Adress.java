package computer;

public class Adress implements Input {
	private int index;

	public Adress(int index) {
		this.index = index;
	}

	public Word get(Memory memory) {
		return memory.get(index);
	}

}
