package Assignment;

import java.util.ArrayList;

public class Pattern_Matching_Use {

	public static void main(String[] args) {
		Pattern_Matching t = new Pattern_Matching();
		ArrayList<String> word =new ArrayList<>();
		 word.add("abc");//adding the elements in the ArryList
		 word.add("def");
		 word.add("ghi");
		 word.add("cba");
		 
		boolean isFound = t.patternMatching(word, "de"); // Passing the ArrayList and the Pattern to be Search
		System.out.println(isFound);

	}

}
