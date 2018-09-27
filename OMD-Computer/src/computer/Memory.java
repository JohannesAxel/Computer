package computer;

public class Memory {
	private WordFactory wf;
	private Word[] memory;
	
	public Memory(int size, WordFactory wf) {
		this.wf = wf;
		memory = new Word[size];
	}
	
	protected Word get(Adress adress) {
		return memory[adress.get()];
	}
	
	protected void set(Word word, Adress adress){
		memory[adress.get()] = word;
	}
}
