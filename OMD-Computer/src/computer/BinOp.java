package computer;

public abstract class BinOp implements Instruction{
	
	protected Input left;
	protected Input right;
	protected Adress adress;
	
	public BinOp(Input left, Input right, Adress adress) {
		this.left = left;
		this.right = right;
		this.adress = adress;
	}	
}
