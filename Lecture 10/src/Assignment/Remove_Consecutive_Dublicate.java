package Assignment;

import java.util.Scanner;
import java.util.Arrays;

//For a given string(str), remove all the consecutive duplicate characters.
//Example:
//Input String: "aaaa"
//Expected Output: "a"
//
//Input String: "aabbbcc"
//Expected Output: "abc"

public class Remove_Consecutive_Dublicate {
	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        if(str.length()<=1){
            return str;
        }
        
        int start=0;
        String ch="";
        int n=str.length()-1;
        for(int i=1;i<str.length();i++){
            char ch1=str.charAt(i);
                char ch2=str.charAt(start);
            
         
            if(ch2!=ch1 ){
                 ch+=str.charAt(start);
                start=i;
            }
        }
        ch+=str.charAt(start);
        return ch;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		str= removeConsecutiveDuplicates(str);
		System.out.println(str);
	}
}
	
//	public static String removeConsecutiveDuplicates(String str) {
//		int frequency[]=new int[256];
//		char c =0;
//		String str1="";
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			if(frequency[ch]<1) {
//			frequency[ch]++;
//			}
//		}
//		for(int i=0; i<256; i++) {
//			if(frequency[i] != 0) {
//				 c +=(char)i;
//			}
//			str1=Character.toString(c);
//		}
//		return str1;
//	}
//
//	public static void main(String[] args) {
//		 Scanner s=new Scanner(System.in);
//		 String str=s.nextLine();
//		 
//		 str=removeConsecutiveDuplicates(str);    //String is non primitive just like Array
//        System.out.print(str);
//
//	}
//
//}