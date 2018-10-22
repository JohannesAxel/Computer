package program;

import computer.Memory;
import inputs.Address;
import inputs.Input;
import inputs.Word;

public abstract class BinOp implements Instruction {

	private Input left;
	private Input right;
	protected Address address;

	public BinOp(Input left, Input right, Address address) {
		this.left = left;
		this.right = right;
		this.address = address;
	}

	abstract protected void op(Word memoryWord, Word input);

	public void execute(Memory memory, ProgramCounter progCounter) {
		Word memoryWord = address.getWord(memory);
		if (!memoryWord.equals(left.getWord(memory))) {
			op(memoryWord, left.getWord(memory));
		}
		if (!memoryWord.equals(right.getWord(memory))) {
			op(memoryWord, right.getWord(memory));
		}
	}
}