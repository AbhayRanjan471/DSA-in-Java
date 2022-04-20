package Strings;

public class Check_Palindrome {
	public static void isPalindrome(String str) {
		int n=str.length()-1;
		boolean ispalan=true;
		
		 for(int i=0;i<str.length()/2;i++){
	            if(str.charAt(i)==str.charAt(n-i) && i<=n-i){
	                ispalan=true;
	            }
	            else{
	                ispalan=false;
	                break;
	            }
	        }
		 System.out.println(ispalan);
		
	}

	public static void main(String[] args) {
		 String str="malayalam";
		 isPalindrome(str);

	}

}
