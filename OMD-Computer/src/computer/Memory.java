package computer;

public class Memory {
	private WordFactory wf;
	private String[] memory;
	
	public Memory(int size, WordFactory wf) {
		this.wf = wf;
		memory = new String[size];
	}
}
