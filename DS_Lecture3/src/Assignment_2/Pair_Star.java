package Assignment_2;

//Given a string S, compute recursively a new string where identical chars that are adjacent in
//the original string are separated from each other by a "*".
//Sample Input 1 :
//hello
//Sample Output 1:
//hel*lo

public class Pair_Star {
	
	public static String addStars(String str) {
		if(str.length() ==1) {
			return str;
		}
		String ans ="";
		if(str.charAt(0) == str.charAt(1)) {
			ans =ans + str.charAt(0) + "*";
		}
		else {
			ans = ans+str.charAt(0);
		}
		
		String smallAns = addStars(str.substring(1));
		return ans + smallAns;
	}

	public static void main(String[] args) {

		String str="aaaa";
		System.out.println(addStars(str));
 

	}

}
