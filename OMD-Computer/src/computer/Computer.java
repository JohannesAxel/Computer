package computer;

public class Computer {
	
	private Memory memory;
	private Program curProgram;	
	public Computer (Memory memory) {
		this.memory = memory;
	}
	public void load(Program program) {
		curProgram = program;
	}
	
	public void run() {
		curProgram.execute(memory);
	}
}
