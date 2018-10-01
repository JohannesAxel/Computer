package computer;

public class ByteWordFactory implements WordFactory<ByteWord>{
	
	public ByteWordFactory(){
		
	}
	
	public ByteWord word(String word) {
		return new ByteWord(Byte.parseByte(word));
	}
}
