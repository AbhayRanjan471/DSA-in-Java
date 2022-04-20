package Assignment;
 import java.util.Scanner;
// Check whether a given String S is a palindrome using recursion. Return true or false.
 
public class Check_Palindrome_Recursion {

	
		  public static boolean isStringPalindrome(String input ,int startIndex ,int endIndex) {
		        if(endIndex <startIndex){
		            return true;
		        }
		        if(input.charAt(startIndex) != input.charAt(endIndex)){
		            return false;
		        }
		        boolean check =isStringPalindrome(input ,startIndex +1 , endIndex -1);
		        return check;
		    }
			public static boolean isStringPalindrome(String input) {
				// Write your code here
		        int startIndex=0;
		        int endIndex=input.length() - 1;
		       return isStringPalindrome(input , startIndex ,endIndex);

			}
			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				String input = s.nextLine();   //"racvcar";
				System.out.println(isStringPalindrome(input));
	}

}
