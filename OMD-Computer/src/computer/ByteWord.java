package computer;

public class ByteWord implements Word<ByteWord> {

	Byte byteWord;

	public ByteWord(Byte byteWord) {
		this.byteWord = byteWord;
	}

	public Byte getValue() {
		return byteWord;

	}

	public ByteWord add(ByteWord byteWord) {
		return new ByteWord((byte) (byteWord.getValue() + this.byteWord));
	}

	public ByteWord mul(ByteWord byteWord) {
		return new ByteWord((byte) (byteWord.getValue() * this.byteWord));
	}

	public Word<ByteWord> get(Memory memory) {
		return this;
	}

	public void set(ByteWord byteWord) {
		this.byteWord = byteWord.getValue();
	}

	public int compareTo(ByteWord byteWord) {
		return this.byteWord.compareTo(byteWord.getValue());
	}

	public String toString() {
		return byteWord.toString();
	}
}