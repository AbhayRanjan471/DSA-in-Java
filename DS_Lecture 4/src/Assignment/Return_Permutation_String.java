package Assignment;

//Given a string S, find and return all the possible permutations of the input string.
//Note 1 : The order of permutations is not important.
//Note 2 : If original string contains duplicate characters, permutations will also be duplicates.
//	Sample Input :
//	abc
//	Sample Output :
//	abc
//	acb
//	bac
//	bca
//	cab
//	cba

public class Return_Permutation_String {
	
	public static String[] permutationOfString(String input ){
		if(input.length() == 0) {
			String ans [] = {""};
			return ans;
		}
		 
		String smallAns[] = permutationOfString( input.substring(1));
		String output[] = new String[input.length() * smallAns.length];
		int k=0;
		for(int i=0 ; i<smallAns.length ;i++) 
		{
			String currentstr = smallAns[i]; // here we are storing the value that is present at i=0 ie, {ab , bc} so if i =0 ; the currentStr will store "ab" and
			                                   // this string "ab" length is calculated in the 2nd loop
			
			for(int j=0 ; j<= currentstr.length() ; j++) {
				output[k] = currentstr.substring(0 ,j) + input.charAt(0) + currentstr.substring(j);
				k++;
			}
		}

		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="dgf";
		String ans[] =permutationOfString(input);

		for(int i=0 ;i < ans.length ; i++) {
			System.out.println(ans[i]);
			
			 
		}
	}

}
