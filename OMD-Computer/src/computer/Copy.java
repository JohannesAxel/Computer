package computer;

public class Copy implements Instruction{

	Input input;
	Adress adress;
	
	public Copy(Input input, Adress adress){
		this.input = input;
		this.adress = adress;
	}
	
	public void execute(Memory memory, ProgramCounter progCounter) {
		adress.get(memory).set(input.get(memory));	
	}
}