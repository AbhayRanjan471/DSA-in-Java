package Recursion_2;
//Given a string S, remove consecutive duplicates from it recursively.
//Sample Input 1 :
//aabccba
//Sample Output 1 :
//abcba

public class Remove_Duplicates_Recursively {
	
	public static String removeConsecutiveDuplicates(String str) {
		String ans="";
		if(str.length() ==1) {
			return str;
		}
		
		String smallAns = removeConsecutiveDuplicates(str.substring(1));
		if(str.charAt(0) == smallAns.charAt(0)) {
			ans = smallAns;
		}
		else {
			ans = str.charAt(0) + smallAns;
		}
		return ans;
	}


	public static void main(String[] args) {
		 String str = "xxxyyyzwwzzz";
		 System.out.println(removeConsecutiveDuplicates(str));

	}

}
