package TRIES;

public class CountWords_in_Trie_Use {

	public static void main(String[] args) {
		 CountWords_in_Trie t = new CountWords_in_Trie();
		 t.add("coding");
		 t.add("ninja");
		 t.add("leetCode");
		 System.out.println(t.countWords());

	}

}
