package Strings;

import java.util.Scanner;

// Sample Input 1:
// abc
// Sample Output 1:
// a 
// ab 
// abc 
// b 
// bc 
// c 

public class Print_all_Substrings {
	public static void PrintSubstring(String str) {
		int i=0;
		 
		while(i<str.length()) {
			for(int j=i; j<str.length();j++) {
			System.out.println(str.substring(i,j+1));
			 
			}
			i++;
		}
		 
	}

	public static void main(String[] args) {
		 Scanner s=  new Scanner(System.in);
		 String str=s.nextLine();
		  PrintSubstring(str);
   
	}

}
