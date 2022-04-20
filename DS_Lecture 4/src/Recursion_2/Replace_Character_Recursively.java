package Recursion_2;

import java.util.Scanner;

public class Replace_Character_Recursively {
	
	public static String replaceCharacter(String str, char c1, char c2) {
		if(str.length() ==0) {
			return str;
		}
		String ans ="";
		if(str.charAt(0) == c1) {
			ans = ans + c2 ;
		}
		else {
			ans = ans + str.charAt(0);
		}
		String smallAns =replaceCharacter(str.substring(1) , c1 , c2);
		return ans + smallAns;
	}


	public static void main(String[] args) {
		
		 Scanner s =new Scanner(System.in);
		 System.out.println("eneter the string");
		 String str= s.nextLine();
		 
		 System.out.println("enter the character to be replace");
		 char c1= s.next().charAt(0);
		 System.out.println("enter the replacing character");
		 char c2= s.next().charAt(0);
		 
		 System.out.println(replaceCharacter(str ,c1 ,c2));
		 

	}

}
