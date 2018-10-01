package program;

import computer.Memory;
import inputs.Address;
import inputs.Input;

public class Add extends BinOp {

		private String toString;

	public Add(Input left, Input right, Address address) {
		super(left, right, address);
		toString = "Add " + left + " and " + right + " into " + address;
	}
		
	public void execute(Memory memory, ProgramCounter progCounter) {
		address.get(memory).set(left.get(memory).add(right.get(memory)));
	}
	public String toString(){
		return toString;
	}
}