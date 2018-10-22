package inputs;

import computer.Memory;

public class LongWord implements Word<Long> {

	Long longWord;

	public LongWord(Long longWord) {
		this.longWord = longWord;
	}

	public Long getValue() {
		return longWord;
	}

	public void add(Long longWord) {
		this.longWord = longWord + this.longWord;
	}

	public void mul(Long longWord) {
		this.longWord = longWord * this.longWord;
	}

	public Word<Long> getWord(Memory memory) {
		return this;
	}

	public void set(Long longWord) {
		this.longWord = longWord;
	}

	public String toString() {
		return longWord.toString();
	}

}
