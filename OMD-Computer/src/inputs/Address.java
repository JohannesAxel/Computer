package inputs;

import computer.Memory;

public class Address implements Input {
	private int index;
	private String toString;
	public Address(int index) {
		this.index = index;
		toString = "[" + index + "]";
	}

	public Word getWord(Memory memory) {
		return memory.get(index);
	}
	
	public String toString(){
		return toString;
	}

}
