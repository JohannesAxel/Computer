package program;

import computer.Memory;
import inputs.Input;

public class Print implements Instruction{
	
	private Input input;
	private String toString;
	public Print(Input input){
		this.input = input;
		toString = "Print " + input;
	}
	public void execute(Memory memory, ProgramCounter progCounter) {
		System.out.println(input.get(memory).toString());
	}
	public String toString(){
		return toString;
	}
}
