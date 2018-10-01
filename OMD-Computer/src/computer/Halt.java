package computer;

public class Halt implements Instruction{

	public void execute(Memory memory, ProgramCounter progCounter) {
		progCounter.jump(-1);
	}
	
	public String toString(){
		return "Halt";
	}
}
