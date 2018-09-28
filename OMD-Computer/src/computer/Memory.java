package computer;

public class Memory {
	private WordFactory wf;
	private Word[] memory;
	
	public Memory(int size, WordFactory wf) {
		this.wf = wf;
		memory = new Word[size];
	}
	
	protected Word get(int index) {
		return memory[index];
	}
	
}
