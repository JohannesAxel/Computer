package computer;

public class Add{
		Input leftInput;
		Input rightInput;
		Adress adress;
	
	
	public Add(Input left, Input right, Adress adress){
		
		this.leftInput = left;
		this.rightInput = right;
		this.adress = adress;
		
	}
	
	public void execute(Memory memory){
			Word left;
			Word right;
			if (leftInput.adress()){
				 left = memory.get((Adress)leftInput);
			} else {
				left = (Word) leftInput;
			}
			if(rightInput.adress()){
				right = memory.get((Adress)rightInput);
			} else {
				right = (Word) rightInput;
			}
			
			memory.set(left.add(right), adress);
	}
}
