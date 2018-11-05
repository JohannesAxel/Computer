package inputs;

import computer.Memory;

public class ByteWord implements Word {

	private byte byteWord;

	public ByteWord(byte byteWord) {
		this.byteWord = byteWord;
	}

	public byte getValue() {
		return byteWord;

	}

	public void add(Word left,Word right) {
		ByteWord leftByte = (ByteWord)left;
		ByteWord rightByte = (ByteWord)right;
		byteWord = (byte) (leftByte.getValue() + rightByte.getValue());
	}
	
	public void mul(Word left, Word right) {
		ByteWord leftByte = (ByteWord)left;
		ByteWord rightByte = (ByteWord)right;
		byteWord = (byte) (leftByte.getValue()*rightByte.getValue());
	}

	public Word getWord(Memory memory) {
		return this;
	}

	public void set(Word word) {
		ByteWord byteWord = (ByteWord) word;
		this.byteWord = byteWord.getValue();
	}

	public String toString() {
		return Byte.toString(byteWord);
	}

	@Override
	public boolean equals(Word word) {
		ByteWord byteWord = (ByteWord) word;
		return this.byteWord == byteWord.getValue();
	}
}