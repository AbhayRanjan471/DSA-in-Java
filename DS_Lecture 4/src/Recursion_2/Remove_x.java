package Recursion_2;

import java.util.Scanner;

public class Remove_x {
	
	public static String removeX(String str) {
		
		if(str.length() == 0) {
			return str;
		}
		String ans="";
		if(str.charAt(0) != 'x') {
			ans= ans + str.charAt(0);
		}
		String smallAns = removeX(str.substring(1));
		return ans + smallAns;
	}

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 String str =s.nextLine(); // eg: xbxa
		 
		 System.out.println(removeX(str));

	}

}
