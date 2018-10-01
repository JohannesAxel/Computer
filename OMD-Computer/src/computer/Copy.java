package computer;

public class Copy implements Instruction{

	Input input;
	Address address;
	String toString;
	
	public Copy(Input input, Address address){
		this.input = input;
		this.address = address;
		toString = "Copy " + input + " to " + address;
	}
	
	public void execute(Memory memory, ProgramCounter progCounter) {
		address.get(memory).set(input.get(memory));
	}
	public String toString(){
		return toString;
	}
}