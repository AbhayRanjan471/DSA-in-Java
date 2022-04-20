//Given a string S, you need to remove all the duplicates. That means, the output string should contain 
//each character only once. The respective order of characters should remain same, as in the input string
//	Sample Input 1 :
//	ababacd
//	Sample Output 1 :
//	abcd

package Assignment;
import java.util.HashMap;
import java.util.Scanner;

public class Extract_Unique_characters {
	public static String uniqueChar(String str){

		HashMap<Character , Boolean> map = new HashMap<>();
		String s ="";
		for(int i = 0 ; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				continue;
			}
			else {
				s += str.charAt(i);
				map.put(str.charAt(i), true);
			}

		}
		return s;

	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the string");
		 String str = s.nextLine();
		 str = uniqueChar(str);
		 System.out.println("The unique character are \n"+str);

	}

}
