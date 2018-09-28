package computer;

public class Add extends BinOp {



	public Add(Input left, Input right, Adress adress) {
		super(left, right, adress);
	}
		
	public void execute(Memory memory, ProgramCounter progCounter) {
		adress.get(memory).set(left.get(memory).add(right.get(memory)));
	}
}