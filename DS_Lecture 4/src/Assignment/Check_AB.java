package Assignment;
//Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function 
//that checks if the string was generated using the following rules:
//a. The string begins with an 'a'
//b. Each 'a' is followed by nothing or an 'a' or "bb"
//c. Each "bb" is followed by nothing or an 'a'
//If all the rules are followed by the given string, return true otherwise return false.
//Input format :
//String S
//Output format :
//'true' or 'false'

//Sample Input 1 :
//abb
//Sample Output 1 :
//true
//Sample Input 2 :
//abababa
//Sample Output 2 :
//false

public class Check_AB {
	
 	public static boolean checkAB(String s) 
	{
	    if (s.length()==0) { 
	        return true;
	    }
	    if (s.charAt(0) != 'a') {
	        return false;
	    }
	    if (s.length() >= 3 && "abb".equals(s.substring(0,3))) {
	        return checkAB(s.substring(3));
	    }
	    else {
	        return checkAB(s.substring(1));
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ischeck =true;
		String input = "aaabba";
		boolean ischeck = checkAB(input);
		System.out.println(ischeck);
	}

}
