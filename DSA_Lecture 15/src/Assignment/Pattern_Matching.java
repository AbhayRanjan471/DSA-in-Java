//Given a list of n words and a pattern p that we want to search. Check if the pattern p is present the given words
//or not. Return true if the pattern is present and false otherwise.
	//Sample Input 1 :
	//
	//abc def ghi cba
	//de
	//Sample Output 2 :
	//true

package Assignment;

import java.util.ArrayList;

class TrieNode{

	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Pattern_Matching {

	private TrieNode root;
	public int count;
	
	public Pattern_Matching() {
		root = new TrieNode('\0');
	}

	public boolean search(String word){
		return search(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0){
			return true;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return false;
		}
		return search(child, word.substring(1));
	}


	public boolean patternMatching(ArrayList<String> vect, String pattern) {
        // Write your code here
        
        for(int i =0 ; i < vect.size() ; i++){//traversing over the whole ArrayList
            String str = vect.get(i);
            for(int j = 0 ; j < str.length() ;j++){ // traversing over perticular String
                add(str.substring(j)); // adding all the suffiex in the Tries
            }
          
        }
        boolean isfound = search(pattern); // searching the pattern
        return isfound;
	}
    public void add(String word) {
		add(root , word);
	}
	private void add(TrieNode root , String word) {
		if(word.length() == 0) { // base case
			//root.isTereminating = true;
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
}
