package Recursion_2;
//Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
//Return empty string for numbers 0 and 1.
//Note : 1. The order of strings are not important.

//Sample Input:
//23
//Sample Output:
//ad
//ae
//af
//bd
//be
//bf
//cd
//ce
//cf

// its my way
public class Return_Keypad_Code {
	
	public static String[] keypad(int n){
		if(n == 0) {
			String ans[] = {""};
			return ans;
		}
		
		
		
		String smallAns[] = keypad(n/10); // recursive call
		
		String str = helper(n); // this function is use to take string value of particular no.
		 
		String ans[] = new String[  str.length() * smallAns.length];
 
		int k=0;
		for(int i=0 ;i < str.length() ;i++) {
			for(int j=0 ; j< smallAns.length ;j++) {
				ans [k] = smallAns[j] + str.charAt(i);
				k++;
			}
		}
		return ans;
	}
	public static String helper(int n) {
		String str ="";
		int p = n% 10;
		if(p==0 || p==1) {
			str =" ";
		}
		if(p== 2) {
		 str="abc";
		}
		if (p== 3) {
			str ="def";
		}
		if(p==4) {
			str ="ghi";
		}
		if(p==5) {
			str ="jkl";
		}
		if(p==6) {
			str ="mno";
		}
		if(p==7) {
			str ="pqrs";
		}
		if(p==8) {
			str = "tuv";
		}
		if(p==9) {
			str ="wxyz";
		}
		
		return str;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 729;
 
		String ans[] = keypad(n);
		
		for(int i=0 ; i<ans.length ;i++) {
			System.out.println(ans[i]);
		}
	}

}
//  Alternate Approach // coding ninja way

//public class solution {
//    private static String[] helper(int n){
//        if(n==2){
//            return(new String[]{"a","b","c"});
//        }
//        else if(n==3){
//            return(new String[]{"d","e","f"});
//        }
//        else if(n==4){
//            return(new String[]{"g","h","i"});
//        }
//        else if(n==5){
//            return(new String[]{"j","k","l"});
//        }
//        else if(n==6){
//            return(new String[]{"m","n","o"});
//        }
//        else if(n==7){
//            return(new String[]{"p","q","r","s"});
//        }
//        else if(n==8){
//            return(new String[]{"t","u","v"});
//        }
//        else if(n==9){
//            return(new String[]{"w","x","y","z"});
//        }
//        else{
//            return(new String[]{" "});
//        }
//
//  }
//
//	// Return a string array that contains all the possible strings
//	public static String[] keypad(int n){
//		// Write your code here
//        if(n == 0){
//            String[] ans = {""};
//            return ans;
//        }
//        String[] small_ans = keypad(n / 10);
//        String[] helper_arr = helper(n%10); 
//        String[] ans = new String[small_ans.length * helper_arr.length];
//        
//        int k=0;
//        for(int j=0 ; j<helper_arr.length ; j++){
//            for(int i=0 ; i< small_ans.length ; i++){
//                ans[k] = small_ans[i] + helper_arr[j];
//                k++;
//            }
//        }
//        
//        return ans;
//
//	}
//	
//}
