package computer;

public class ByteWord implements Word<ByteWord> {

	byte byteWord;

	public ByteWord(byte byteWord) {
		this.byteWord = byteWord;

	}

	public Byte get() {
		return byteWord;

	}

	public ByteWord add(ByteWord byteWord) {
		return byteWord;
	}

	@Override
	public ByteWord mul(ByteWord word) {
		return null;
	}
}