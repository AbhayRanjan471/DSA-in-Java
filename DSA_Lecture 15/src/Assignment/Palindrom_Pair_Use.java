package Assignment;
import java.util.Scanner;
import java.util.ArrayList;

public class Palindrom_Pair_Use {

	public static void main(String[] args) {
		
		//taking input from user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of Words in The Array List");
		int n = s.nextInt();
		System.out.println("Enter the elements in the ArrayList");
		ArrayList<String> words = new ArrayList<>();
		 for(int i = 0 ; i < n ; i++) {
			  
			 words.add(s.next());
		 }
		 //creating an object and passing the Array list
		 Palindrom_Pair t = new Palindrom_Pair();
//		 ArrayList<String> words = new ArrayList<>();
//		 words.add("bef");
//		 words.add("mhg");
		 boolean isPalan = t.isPalindromePair(words);
		 System.out.println(isPalan);

	}

}
