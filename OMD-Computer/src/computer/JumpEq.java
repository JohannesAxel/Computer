package computer;

public class JumpEq implements Instruction {

	int index;
	Input left;
	Input right;

	public JumpEq(int index, Input left, Input right) {
		this.index = index;
		this.left = left;
		this.right = right;
	}

	public void execute(Memory memory, ProgramCounter progCounter) {
		if (left.get(memory).compareTo(right.get(memory)) == 0) {
			progCounter.jump(index);
		}
	}
}
