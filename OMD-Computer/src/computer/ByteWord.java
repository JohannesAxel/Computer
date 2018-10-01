package computer;

public class ByteWord implements Word<ByteWord> {
	
	byte byteWord;

	public ByteWord(byte byteWord) {
		this.byteWord = byteWord;
	}

	public byte getValue() {
		return byteWord;

	}

	public ByteWord add(ByteWord byteWord) {
		return byteWord;
	}

	public ByteWord mul(ByteWord word) {
		return null;
	}

	public Word get(Memory memory) {
		return this;
	}

	public void set(ByteWord byteWord) {
		this.byteWord = byteWord.getValue();
	}

	public boolean equals(ByteWord byteWord) {
		return false;
	}
	public String toString(){
		return String.valueOf(byteWord);
	}
	
}