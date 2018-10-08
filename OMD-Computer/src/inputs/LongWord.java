package inputs;

import computer.Memory;

public class LongWord implements Word<LongWord>{
	
	Long longWord;

	public LongWord(Long longWord) {
		this.longWord = longWord;
	}

	public Long getValue() {
		return longWord;

	}

	public LongWord add(LongWord longWord) {
		return new LongWord((long) (longWord.getValue() + this.longWord));
	}

	public LongWord mul(LongWord longWord) {
		return new LongWord((long) (longWord.getValue() * this.longWord));
	}

	public Word<LongWord> getWord(Memory memory) {
		return this;
	}

	public void set(LongWord longWord) {
		this.longWord = longWord.getValue();
	}

	public int compareTo(LongWord longWord) {
		return this.longWord.compareTo(longWord.getValue());
	}

	public String toString() {
		return longWord.toString();
	}
	
}
