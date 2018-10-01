package program;

import inputs.Address;
import inputs.Input;

public abstract class BinOp implements Instruction{
	
	protected Input left;
	protected Input right;
	protected Address address;
	
	public BinOp(Input left, Input right, Address address) {
		this.left = left;
		this.right = right;
		this.address = address;
	}	
	
		
}
