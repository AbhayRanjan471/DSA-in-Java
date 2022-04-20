package Strings;


public class Reverse_String_word_wise {

	public static void printReverse(String input) {
		 input=" "+input;
		 
	        int n=input.length()-1;
	        int end=n;
	        for(int i=0;i<input.length();i++){
	            
	            if(input.charAt(n-i)==' '){
	                 String str=input.substring((n-i)+1,end+1);
	                
	                System.out.print(str+" "); 
	                end=(n-i)-1;
	            }
	            }
	       
	}

	public static void main(String[] args) {
		 String input="welcome to coding ninja";
		 printReverse(input);
		 

	}
}
