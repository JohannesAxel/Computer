package computer;

public class Address implements Input {
	private int index;
	String toString;
	public Address(int index) {
		this.index = index;
		toString = "[" + index + "]";
	}

	public Word get(Memory memory) {
		return memory.get(index);
	}
	
	public String toString(){
		return toString;
	}

}
