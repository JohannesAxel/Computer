package computer;

public class JumpEq implements Instruction {

	private int index;
	private Input left;
	private Input right;
	private String toString;

	public JumpEq(int index, Input left, Input right) {
		this.index = index - 1;
		this.left = left;
		this.right = right;
		toString = "Jump to " + index + " if " + left + " == " + right;
	}

	public void execute(Memory memory, ProgramCounter progCounter) {
		
		if (left.get(memory).compareTo(right.get(memory)) == 0) {
			progCounter.jump(index);
		}
	}
	public String toString(){
		return toString;
	}
}