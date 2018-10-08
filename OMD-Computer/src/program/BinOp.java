package program;

import computer.Memory;
import inputs.Address;
import inputs.Input;
import inputs.Word;

public abstract class BinOp implements Instruction {

	protected Input left;
	protected Input right;
	protected Address address;

	public BinOp(Input left, Input right, Address address) {
		this.left = left;
		this.right = right;
		this.address = address;
	}

	abstract protected Word op(Memory memory);

	public void execute(Memory memory, ProgramCounter progCounter) {
		address.get(memory).set(op(memory));
	}
}
