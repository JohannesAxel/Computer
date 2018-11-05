package inputs;

import computer.Memory;

public class LongWord implements Word {

	long longWord;

	public LongWord(long longWord) {
		this.longWord = longWord;
	}

	public Long getValue() {
		return longWord;
	}

	public void add(Word left,Word right) {
		LongWord leftLong = (LongWord)left;
		LongWord rightLong = (LongWord)right;
		longWord = leftLong.getValue() + rightLong.getValue();
	}
	
	public void mul(Word left, Word right) {
		LongWord leftByte = (LongWord)left;
		LongWord rightByte = (LongWord)right;
		longWord = leftByte.getValue()*rightByte.getValue();
	}

	public Word getWord(Memory memory) {
		return this;
	}

	public void set(Word word) {
		LongWord byteWord = (LongWord) word;
		this.longWord = byteWord.getValue();
	}

	public String toString() {
		return Long.toString(longWord);
	}
	
	public boolean equals(Word word) {
		LongWord longWord = (LongWord) word;
		return this.longWord == longWord.getValue();
	}
}