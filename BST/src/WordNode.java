
public class WordNode {
	public String word;
	public WordNode left;
	public WordNode right;

	public WordNode(String word) {
		this.word = word;
		left = null;
		right = null;
	}

	public String getWord() {
		return word;
	}

	public boolean contains(String target) {
		if (target.equals(word))
			return true;
		WordNode next = target.compareTo(word) < 0 ? left : right;
		return next != null && next.contains(target);
	}

}
