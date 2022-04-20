package Assignment;
import java.util.Scanner;
public class Highest_occuring_Character {
	
	public static char highestChar(String str) {
		//Your code goes here
       
       char ch = 0;
       ch=str.charAt(0); // if all the character are different then thi line will work
        int max=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
        	 int c=0;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    c++;
                }
            }
            if(c>max){
                max=c;
               ch=str.charAt(i);
            }
        }
        
        return ch;
	}

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 String str=s.nextLine();
		 char ch=highestChar(str);
		System.out.println(ch);  

	}

}
