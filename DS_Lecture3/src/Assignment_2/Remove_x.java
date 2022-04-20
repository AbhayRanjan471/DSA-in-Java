package Assignment_2;
//Given a string, compute recursively a new string where all 'x' chars have been removed.

//Sample Input 1 :
//xaxb
//Sample Output 1:
//ab
public class Remove_x {
	public static String RemoveX(String str) {
		
		if(str.length() == 0) {
			return str;
		}
		String ans="";
		if(str.charAt(0) != 'x') {
			ans= ans + str.charAt(0);
		}
		
		String smallAns = RemoveX(str.substring(1));
		return ans +smallAns;
	}

	public static void main(String[] args) {
		 String str="xabxgdx";
		 System.out.println(RemoveX(str));
         
	}

}
