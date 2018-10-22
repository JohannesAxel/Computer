package inputs;

import computer.Memory;

public class ByteWord implements Word<Byte> {

	private Byte byteWord;

	public ByteWord(Byte byteWord) {
		this.byteWord = byteWord;
	}

	public Byte getValue() {
		return byteWord;

	}

	public void add(Byte byteWord) {
		this.byteWord = (byte) (byteWord + this.byteWord);
	}

	public void mul(Byte byteWord) {
		this.byteWord = (byte) (byteWord * this.byteWord);
	}

	public Word<Byte> getWord(Memory memory) {
		return this;
	}

	public void set(Byte byteWord) {
		this.byteWord = byteWord;
	}

	public String toString() {
		return byteWord.toString();
	}
}