//Given n number of words and an incomplete word w. You need to auto-complete that word w.
//That means, find and print all the possible words which can be formed using the incomplete word w.
//Note : Order of words does not matter
	//Sample Input 1 :
	//7
	//do dont no not note notes den
	//no
	//Sample Output 2 :
	//no
	//not
	//note
	//notes

package Assignment;
import java.util.ArrayList;

class TrieNode2{
    char data;
    boolean isTerminating;
    TrieNode2 children[];
    int childCount;

    public TrieNode2(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode2[26];
        childCount = 0;
    }
}
public class Auto_Complete {

	 
	    private TrieNode2 root;
	    public int count;
	    public Auto_Complete() {
	        root = new TrieNode2('\0');
	    }

	    private void add(TrieNode2 root, String word){
	        if(word.length() == 0){
	            root.isTerminating = true;
	            return;
	        }		
	        int childIndex = word.charAt(0) - 'a';
	        TrieNode2 child = root.children[childIndex];
	        if(child == null){
	            child = new TrieNode2(word.charAt(0));
	            root.children[childIndex] = child;
	            root.childCount++;
	        }
	        add(child, word.substring(1));
	    }

	    public void add(String word){
	        add(root, word);
	    }


	    public void autoComplete(ArrayList<String> input, String word) {

	        // Write your code here
	        for(String i : input){
	            add(i);
	        }
	        String str = word;
	        findWord(root,word ,str);

	    }
	    public void findWord(TrieNode2 root , String word , String str){
	        if(word.length() == 0){
	            findAllPossibleWord(root,str);
	            return;
	        }
	        int childIndex = word.charAt(0) - 'a';
	        TrieNode2 child = root.children[childIndex];
	        if(child == null){
	            return;
	        }

	        findWord(child , word.substring(1) ,str);
	        
	    }
	    public void findAllPossibleWord(TrieNode2 root, String str){
	        if(root == null){
	            return;
	        }
	        if(root.isTerminating){
	            System.out.println(str);
	             
	        }
	        for(int i = 0 ; i < 26 ; i++){
	            TrieNode2 child = root.children[i];
	            if(child != null){
	             //   str += child.data;
	                findAllPossibleWord(child , str+child.data);
	            }
	            // else if(child == null){
	            //     continue;
	            // }
	        }


	    }
}
