package Assignment;
//Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to print the list of all possible codes that can be generated from the given string.
//Note : The order of codes are not important. Just print them in different lines.
//Input format :
//	Sample Input:
//	1123
//	Sample Output:
//	aabc
//	kbc
//	alc
//	aaw
//	kw

public class Print_All_Code_2 {
	
	public static void printAllPossibleCodes(String input ,String ans) {
		if(input.length() == 0) {
			System.out.println(ans);
			return;
		}
		int firstDigit = input.charAt(0) - '0';
		char ch = (char)('a' + firstDigit -1);
		
		printAllPossibleCodes(input.substring(1) , ans + ch);
		
		if(input.length() >1) {
			int firstTwoDigit = (input.charAt(0) - '0') * 10 + (input.charAt(1) -'0');
			char ch1 = (char)('a' + firstTwoDigit - 1);
			
			if(firstTwoDigit >= 10 && firstTwoDigit <= 26) {
				printAllPossibleCodes(input.substring(2) , ans + ch1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="1123";
		printAllPossibleCodes(input ,"");
	}

}
