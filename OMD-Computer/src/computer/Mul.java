package computer;

public class Mul extends BinOp{

	public Mul(Input left, Input right, Adress adress) {
		super(left, right, adress);
	}
	public void execute(Memory memory, ProgramCounter progCounter) {
		adress.get(memory).set(left.get(memory).mul(right.get(memory)));
	}

}
