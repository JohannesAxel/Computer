package program;

import computer.Memory;
import inputs.Address;
import inputs.Input;

public class Mul extends BinOp{

	String toString;
	public Mul(Input left, Input right, Address address) {
		super(left, right, address);
		toString = "Multiply " + left + " and " + right + " into " + address;
	}
	public void execute(Memory memory, ProgramCounter progCounter) {
		address.get(memory).set( left.get(memory).mul( right.get(memory) ));
	}
	public String toString(){
		return toString;
	}
}
