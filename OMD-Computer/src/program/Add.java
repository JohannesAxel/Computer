package program;

import computer.Memory;
import inputs.Address;
import inputs.Input;
import inputs.Word;

public class Add extends BinOp {

		private String toString;

	public Add(Input left, Input right, Address address) {
		super(left, right, address);
		toString = "Add " + left + " and " + right + " into " + address;
	}
		
	protected Word op(Memory memory) {
		return left.getWord(memory).add(right.getWord(memory));
		
	}
	public String toString(){
		return toString;
	}


}