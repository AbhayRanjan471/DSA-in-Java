package TRIES;

//for implementing TrieNode we need Trie data Structure
//so we are creating a class corresponding to Trie
class TrieNode{

	char data;
	boolean isTereminating;
	TrieNode children [];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTereminating = false; //initially isTerminating will be false
		children = new TrieNode[26]; // creating a new Array of size 26
		childCount =0;
	}

}

public class Trie { 

	private TrieNode root ;

	public Trie() {
		root = new TrieNode('\0'); // Initializing the root with null Character

	}

	// add function
	public void add(String word) {
		add(root , word);
	}
	private void add(TrieNode root , String word) {
		if(word.length() == 0) { // base case
			root.isTereminating = true;//when we have reached the last character of that word we will make that character as 
			                           //terminating and return
			return;
		}
		//root has an Array of its children
		//root k corresponding hum check kre ge ki jo character hume mila hai wo present hai ki nai ,if its Null then its not present
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex]; // here we will get the child which is present in Children Array at [childIndex];

		if(child == null) {// that mean at that childIndex Null is present and no Node has been made so now we have to make the Node
			child = new TrieNode(word.charAt(0)); // created the Node
			root.children[childIndex] = child ; // adding the child in the root Array list
			
			root.childCount++;

		} 
		add(child , word.substring(1)); // calling recursively to add all the remaining words
	}

	//Search function
	public boolean search(String word) {
		return search(root , word);
	}
	private boolean search(TrieNode root , String word) {
		if(word.length() == 0) { // base case
			return root.isTereminating;
		}

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return false;
		}

		return search(child , word.substring(1)); // recursive call
	}

	//delete function
	public void remove(String word) {
		remove(root , word);
	}
	private void remove(TrieNode root , String word) {
		if(word.length() == 0) {
			root.isTereminating = false; //we will just make the last character of the String as non-terminating
			return;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null) {//if the word which we want to remove doesn't present the we will just return
			return ;
		}
		remove(child , word.substring(1));
		
		//We can remove child node only if it id non terminating and its number of children are 0
		if(! child.isTereminating && child.childCount == 0) {
			root.children[childIndex] = null;
			child = null;
			root.childCount--;
		}
		//OR
//		if(!child.isTereminating) {
//			int numChild = 0;
//			for(int i =0 ; i < 26 ; i++) { // checking for its children
//				if(child.children[i] != null) {
//					numChild++; // counting the number of child 
//				}
//			}
//			if(numChild == 0) { // if the num of children is 0 then we can delete 
//				//We can delete child
//				root.children[childIndex] = null;
//				child = null;
//				 
//			}
//		}
	}

}
