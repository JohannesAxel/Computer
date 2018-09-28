package computer;

import java.util.ArrayList;
import java.util.List;

public abstract class Program {
	
	List<Instruction> instructions; 
	ProgramCounter progCounter;
	
	public Program() {
		progCounter = new ProgramCounter();
		instructions = new ArrayList<Instruction>();
	}

	protected void add(Instruction instruction) {
		instructions.add(instruction);
	}

	public void execute(Memory memory) {
		while (progCounter.get() != -1) {
			instructions.get(progCounter.get()).execute(memory, progCounter);
			progCounter.next();
		}
	}
}
