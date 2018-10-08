package program;

import computer.Memory;
import inputs.Address;
import inputs.Input;
import inputs.Word;

public class Mul extends BinOp{

	String toString;
	public Mul(Input left, Input right, Address address) {
		super(left, right, address);
		toString = "Multiply " + left + " and " + right + " into " + address;
	}
	protected Word op(Memory memory) {
		return left.get(memory).mul(right.get(memory));
	}
	
	public String toString(){
		return toString;
	}
}
