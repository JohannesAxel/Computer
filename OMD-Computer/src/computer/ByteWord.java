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

	@Override
	public Word get(Memory memory) {
		return this;
	}

	@Override
	public ByteWord set(ByteWord byteWord) {
		this.byteWord = byteWord.getValue();
		return null;
	}

	
}