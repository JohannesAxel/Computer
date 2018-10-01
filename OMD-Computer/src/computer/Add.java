package computer;

public class Add extends BinOp {

		String toString;

	public Add(Input left, Input right, Address address) {
		super(left, right, address);
		toString = "Add " + left + " and " + right + " into " + address;
	}
		
	public void execute(Memory memory, ProgramCounter progCounter) {
		address.get(memory).set(left.get(memory).add(right.get(memory)));
	}
	public String toString(){
		return toString;
	}
}