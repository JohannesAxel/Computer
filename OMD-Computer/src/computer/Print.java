package computer;

public class Print implements Instruction{
	
	Input input;
	
	public Print(Input input){
		this.input = input;
	}
	public void execute(Memory memory, ProgramCounter progCounter) {
		System.out.println(input.get(memory).toString());
	}

}
