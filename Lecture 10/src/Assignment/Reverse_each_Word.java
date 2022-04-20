package Assignment;

import java.util.Scanner;

//Input Sentence: "Hello, I am Aadil!"
//The expected output will print,:- ",olleH I ma !lidaA".

public class Reverse_each_Word {
	public static String reverse(String str) {
		
		String ans=""; 
		int start=0;
		int end=str.length()-1;
		while(start<=end) {
			ans+=str.charAt(end);
			end--;
		}
		return ans;
	}
	
	public static String reverseEachWord(String str) {
		
        str=str+" ";
        String ans="";
        int i=0;
        int start=0;
        while(i<str.length()) {
        	if(str.charAt(i)==' ') {
        		ans+=reverse(str.substring(start,i))+" ";
        		start=i+1;
        	}
        	i++;
        }
        return ans;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		str=reverseEachWord(str);
        System.out.print(str);
	}

}
