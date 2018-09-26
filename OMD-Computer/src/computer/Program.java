package computer;

import java.util.ArrayList;
import java.util.List;

public abstract class Program {
	
	List<Instruction> instructions; 
	ProgramCounter progCount;
	public Program() {
		progCount = new ProgramCounter();
		instructions = new ArrayList<Instruction>();
	}

	protected void add(Instruction instruction) {
		
	}

	public void execute(Memory memory) {
		while (progCount.get() != -1) {
			instructions.get(progCount.get()).execute();			
		}
	}
}
