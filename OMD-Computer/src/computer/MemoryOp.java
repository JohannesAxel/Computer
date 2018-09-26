package computer;

public abstract class MemoryOp implements Instruction {
	private Adress adress;
	private Memory memory;

	public MemoryOp (Adress adress) {
		this.adress = adress;
		this.memory = memory;
	}
}
