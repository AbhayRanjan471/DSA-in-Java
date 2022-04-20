package Assignment;
//Given an input string (STR), print all possible permutations of the input string.
//Note:
//The input string may contain the same characters, so there will also be the same permutations.
//The order of permutations doesn’t matter.
//	Sample Input 1:
//	cba
//	Sample Output 1:
//	abc
//	acb
//	bac
//	bca
//	cab
//	cba

public class Print_Permutations {
	public static void FindPermutations(String str , String outputSofar) {
		if(str.length() == 0) {
			System.out.println(outputSofar);
			return;
		}
		for(int i=0 ; i<str.length() ;i++) 
		{
			char ch = str.charAt(i);
			String left_part = str.substring(0,i);
			String right_part = str.substring(i + 1);
			
		String ros = left_part + right_part; // ros : rest of the string excluding 'str.charAt(i)'
		FindPermutations( ros ,outputSofar + ch );
		 
		}
		 
	}
	
	public static void FindPermutations(String str) {
		FindPermutations(str , "");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="abc";
		FindPermutations(str);
	}

}
