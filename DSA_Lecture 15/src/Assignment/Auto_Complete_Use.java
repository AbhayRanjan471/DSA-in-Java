package Assignment;

import java.util.ArrayList;

public class Auto_Complete_Use {

	public static void main(String[] args) {
		Auto_Complete t = new Auto_Complete();
		ArrayList<String> words = new ArrayList<>();
		words.add("do");
		words.add("dont");
		words.add("no");
		words.add("note");
		words.add("notes");
		words.add("den");
		
		t.autoComplete(words, "no");
		 

	}

}
