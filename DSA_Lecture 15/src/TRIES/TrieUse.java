package TRIES;

public class TrieUse {

	public static void main(String[] args) {
		 Trie t = new Trie();
		 t.add("this"); // adding
		 t.add("news");
		 System.out.println(t.search("news"));//searching
		 System.out.println(t.search("bat"));
		 t.remove("news");//removing
		 System.out.println(t.search("news"));

	}

}
