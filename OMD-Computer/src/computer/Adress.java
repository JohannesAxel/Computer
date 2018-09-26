package computer;

public class Adress implements Input{
	private int index;
	
	public Adress(int index) {
		this.index = index;
	}
	protected int get() {
		return index;
	}

}
