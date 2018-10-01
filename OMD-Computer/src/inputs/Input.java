package inputs;

import computer.Memory;

public interface Input {
	
	public Word get(Memory memory);
	
	public String toString();
	
}
