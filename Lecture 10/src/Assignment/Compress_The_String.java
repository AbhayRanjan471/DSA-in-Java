package Assignment;

import java.util.Scanner;
//Write a program to do basic string compression. For a character which is consecutively
//repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
//Sample Input 1:
//aaabbccdsa
//Sample Output 1:
//a3b2c2dsa

public class Compress_The_String {
	
	public static String getCompressedString(String str) {
		// Write your code here.
		int c=0;
        int start=0;
        String str1="";
        String str2="";
        for(int i=0;i<str.length();i++){
            c=i;
            if(str.charAt(start) != str.charAt(i)){
                str1=str.substring(start,i);
                int n=str1.length();
                
                if(n>1) {
                str2 +=str.charAt(start) +Integer.toString(n);
                start=i;
                }
                else {
                	 str2 +=str.charAt(start); //+Integer.toString(n);
                     start=i;
                }
            }
        }
        str1=str.substring(start,c);
        int n=str1.length();
        if(n>1) {
        str2 +=str.charAt(start)+ Integer.toString(n+1);
        return str2;
	}
        else {
        	 str2 +=str.charAt(start); //+ Integer.toString(n+1);
             return str2;
        }
	}
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 String str=s.nextLine();
		 
		 str=getCompressedString(str);    //String is non primitive just like Array
        System.out.print(str);
	}
}
