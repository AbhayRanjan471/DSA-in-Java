//Given 'n' number of words, you need to find if there exist any two words which can be joined to make
//a palindrome or any word, which itself is a palindrome.
//The function should return either true or false. You don't have to print anything.
//Sample Input 1 :
//4
//abc def ghi cba
//Sample Output 1 :
//true
//Explanation of Sample Input 1:
//"abc" and "cba" forms a palindrome
//Sample Input 2 :
//2
//abc def
//Sample Output 2 :
//false
//Explanation of Sample Input 2:
//Neither their exists a pair which forms a palindrome, nor any of the words is a palindrome in itself. Hence, the output is 'false.'

package Assignment;
import java.util.ArrayList;

class TrieNode1 {
    char data;
    boolean isTerminating;
    TrieNode1 children[];
    int childCount;

    public TrieNode1(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode1[26];
        childCount = 0;
    }
}

public class Palindrom_Pair {

	 private TrieNode1 root;
	    public int count;

	    public Palindrom_Pair() {
	        root = new TrieNode1('\0');
	    }

	    private void add(TrieNode1 root, String word){
	        if(word.length() == 0){
	            root.isTerminating = true;
	            return;
	        }		

	        int childIndex = word.charAt(0) - 'a';
	        TrieNode1 child = root.children[childIndex];

	        if(child == null) {
	            child = new TrieNode1(word.charAt(0));
	            root.children[childIndex] = child;
	            root.childCount++;
	        }

	        add(child, word.substring(1));
	    }

	    public void add(String word){
	        add(root, word);
	    }

	    private boolean search(TrieNode1 root, String word) {
	        if(word.length() == 0) {
	            return true;
	        }

	        int childIndex=word.charAt(0) - 'a';
	        TrieNode1 child=root.children[childIndex];

	        if(child == null) {
	            return false;
	        }

	        return search(child,word.substring(1));

	    }

	    public boolean search(String word) {
	        return search(root,word);
	    }

	    private void print(TrieNode1 root, String word) {
	        if (root == null) {
	            return;
	        }

	        if (root.isTerminating) {
	            System.out.println(word);
	        }

	        for (TrieNode1 child : root.children) {
	            if (child == null) {
	                continue;
	            }
	            String fwd = word + child.data;
	            print(child, fwd);
	        }
	    }

	    public void print() {
	        print(this.root, "");
	    }





	    /*..................... Palindrome Pair................... */


	    public boolean isPalindromePair(ArrayList<String> words) {
	        //Your code goes here
	        boolean isPalandrome = false;
	        
	       for(int i =0 ; i < words.size() ; i++){//traversing over the whole ArrayList
	            String str = words.get(i);
	            for(int j = 0 ; j < str.length() ;j++){ // traversing over perticular String
	                add(str.substring(j)); // adding all the suffiex in the Tries
	            }
	          
	        }
	        for(int j = 0 ; j < words.size() ; j++){
	            String str = words.get(j);
	            String reverse ="";

	            for(int k =0 ; k < str.length() ; k++){
	                reverse = str.charAt(k) + reverse;
	            }
	            isPalandrome = search(reverse);
	            if(isPalandrome){
	                return true;
	            }
	            else{
	                continue;
	            }
	        } 
	        return isPalandrome;

	    }
}
