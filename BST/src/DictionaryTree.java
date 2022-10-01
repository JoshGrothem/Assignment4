
public class DictionaryTree {

	public WordNode root;

	public DictionaryTree() {
		root = null;
	}

	public void addWordNode(String word) {
		WordNode temp = new WordNode(word);

		if (root == null) {
			root = temp;
		} else {
			insert(root, temp);
		}
		assert root == null : "Node not added";
	}

	private void insert(WordNode myRoot, WordNode temp) {

		while (true) {
			// 1 ignore duplicate words
			if (temp.getWord().compareTo(myRoot.getWord()) == 0)
				return;
			// 2 travel to the left side
			if (temp.getWord().compareTo(myRoot.getWord()) <= -1) {
				if (myRoot.left != null)
					myRoot = myRoot.left;
				else {
					myRoot.left = temp;
					break;
				}
			}
			// 3 travel to the right side
			else {
				if (myRoot.right != null)
					myRoot = myRoot.right;
				else {
					myRoot.right = temp;
					break;
				}
			}
		}
		assert myRoot.left != myRoot.right : "duplicate node";
	}

	public void inOrder() {
		inOrderRecursive(root);
	}

	private void inOrderRecursive(WordNode myRoot) {
		if (myRoot != null) {
			inOrderRecursive(myRoot.left);
			System.out.print(myRoot.getWord() + " ");
			inOrderRecursive(myRoot.right);
		}

	}

	public boolean spellCheck(String target) {
		boolean found = root.contains(target);
		return found;
	}

}
