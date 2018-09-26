package computer;

public class ProgramCounter {
	private int index;
	
	public ProgramCounter() {
		index = 0;
	}
	protected void next() {
		index++;
	}
	protected void jump(int index) {
		this.index = index;
	}
	protected int get() {
		return index;
	}
}
