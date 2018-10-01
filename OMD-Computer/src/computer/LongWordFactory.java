package computer;

public class LongWordFactory implements WordFactory<LongWord> {

	public LongWord word(String word) {
		if (word == null){
			return new LongWord(null);
		}
		return new LongWord(Long.parseLong(word));
	}
}
