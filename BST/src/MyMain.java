
public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DictionaryTree tree = new DictionaryTree();
		String str = "Here is the perfect system for cleaning your room First move all of the items that do not have a proper place to the center of the room Get rid of at least five things that you have not used within the last year Take out all of the trash and place all of the dirty dishes in the kitchen sink Now find a location for each of the items you had placed in the center of the room For any remaining items see if you can squeeze them in under your bed or stuff them into the back of your closet See that was easy";
		str = str.toLowerCase();
		String[] data = str.split(" ");
		for (int i = 0; i < data.length; i++) {
			tree.addWordNode(data[i]);
		}

		tree.inOrder();
		System.out.println();
		String check = "squeeze";
		System.out.println("Is " + check + " spelled correctly? " +tree.spellCheck(check));
		System.out.println("success");

	}
}
