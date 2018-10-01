package computer;

public class LongWordFactory implements WordFactory<LongWord> {

	public LongWord word(String word) {
		return new LongWord(Long.parseLong(word));
	}
}
