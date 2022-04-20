package Assignment;

import java.util.Arrays;
import java.util.Scanner;
//For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
//Two strings are said to be a permutation of each other when either of the string's characters can be rearranged
//so that it becomes identical to the other one.

//Example: 
//str1= "sinrtg" 
//str2 = "string"

//The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings 
//are a permutation of each other.

//Sample Input 1:
// str1=abcde
//str2=baedc
//Sample Output 1:
//true

//Sample Input 2:
//str1=abc
//str2=cbd
//Sample Output 2:
//false

public class Check_Permutation {
	

	// first method  // both method are best 
	public static boolean isPermutation(String str1,String str2) {
		
		if(str1.length() !=str2.length()) {
			return false;
		}
		int frequency[]=new int[256];
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			frequency[ch]++;
		}
		for(int i=0;i<str2.length();i++) {
			char ch=str2.charAt(i);
			frequency[ch]--;
		}
		for(int i=0 ;i<256; i++) {
			if(frequency[i]!= 0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		 Scanner s=new Scanner (System.in);
		 String str1=s.nextLine();
		 String str2=s.nextLine();
		 boolean isperm=isPermutation(str1,str2);
         System.out.println(isperm);
	}

}

     // 2nd method
//	public static boolean isPermutation(String str1,String str2) {
//		boolean isperm=true;
//		if(str1.length() != str2.length()) {
//			return ! isperm;
//		}
//		char arr1[]=str1.toCharArray();  // converting String into character Array
//		char arr2[]=str2.toCharArray();
//		
//		Arrays.sort(arr1);  //sorting the Character Array ,but its return type is void so we cannot store it
//		Arrays.sort(arr2);
//		
//		for(int i=0 ;i<arr1.length; i++) {
//			if(arr1[i] != arr2[i]) {
//				return !isperm;
//			}
//		}
//		return isperm;
//	}
//public static void main(String[] args) {
//	 Scanner s=new Scanner (System.in);
//	 String str1=s.nextLine();
//	 String str2=s.nextLine();
//	 boolean isperm=isPermutation(str1,str2);
//    System.out.println(isperm);
//}
//}
