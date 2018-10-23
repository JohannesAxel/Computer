package program;

import computer.Memory;
import inputs.Address;
import inputs.Input;
import inputs.Word;

public abstract class BinOp implements Instruction {

	private Input left;
	private Input right;
	private Address address;

	public BinOp(Input left, Input right, Address address) {
		this.left = left;
		this.right = right;
		this.address = address;
	}

	abstract protected void op(Word memoryWord, Word input);

	public void execute(Memory memory, ProgramCounter progCounter) {

		Word addressWord = address.getWord(memory);
		Word inputLeft = left.getWord(memory);
		Word inputRight = right.getWord(memory);

		// If address is none of the inputs
		if (!addressWord.equals(inputLeft) && !addressWord.equals(inputRight)) {
			addressWord.set(0);
			op(addressWord, inputLeft);
			op(addressWord, inputRight);
			
		} else {
			// If inputs and address is same object
			if (inputLeft.equals(inputRight) && addressWord.equals(inputLeft)) {
				op(addressWord, inputLeft);
				
			} else {
				// If addresss is different form inputLeft
				if (!addressWord.equals(inputLeft)) {
					op(addressWord, inputLeft);
				}
				// If addresss is different form inputRight
				if (!addressWord.equals(inputRight)) {
					op(addressWord, inputRight);
				}

			}
		}

	}
}