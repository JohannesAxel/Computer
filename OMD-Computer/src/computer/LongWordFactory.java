package computer;

import inputs.LongWord;

public class LongWordFactory implements WordFactory<LongWord> {
	
	public LongWord word(String word) {
		if (word == null){
			return new LongWord(0);
		}
		return new LongWord(Long.parseLong(word));
	}
}
