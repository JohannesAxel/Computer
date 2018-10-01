package computer;

public class Jump implements Instruction{
	private int index;
	
	public Jump(int index){
		this.index = index;
	}

	public void execute(Memory memory, ProgramCounter progCounter) {
		progCounter.jump(index);
	}
}
