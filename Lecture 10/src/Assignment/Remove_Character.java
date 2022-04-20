package Assignment;

import java.util.Scanner;

//Sample Input 1:
//aabccbaa
//a
//Sample Output 1:
//bccb

public class Remove_Character {
	
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        String str1="";
        for(int i=0;i<str.length();i++){
           
            if(ch != str.charAt(i)){
               str1=str1+str.charAt(i); 
            }
        }
        return str1;
	}


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch=s.next().charAt(0);
		str=removeAllOccurrencesOfChar(str,ch);
        System.out.print(str);

	}

}
