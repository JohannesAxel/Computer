package computer;

public class Add extends Word{
		Input left;
		Input right;
		Adress adress;
	
	
	public Add(Input left, Input right, Adress adress){
		
		this.left = left;
		this.right = right;
		this.adress = adress;
		
	}
	
	public void execute(Memory memory){
			if (left.adress()){
				 left = memory.get((Adress)left);
			}
			if(right.adress()){
				right = memory.get((Adress)right);
			}
			
			memory.set((Word)left.add((Word)right), adress);
	}
}
