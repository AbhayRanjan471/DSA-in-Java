package Strings;
import java.util.Scanner;
public class Revers_String2 {
	public static String ReverseWord(String str)
	{
		int end=str.length();
		int i=str.length()-1;
		String output="";
		
		while(i>=0) {
			if(str.charAt(i)==' ') {
				output=output+str.substring(i+1,end)+" ";
				end=i;
			}
			i--;
		}
		output +=str.substring(i+1,end);
		return output;
		}

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 String str=s.nextLine();
		 
		 str=ReverseWord(str);    //String is non primitive just like Array
         System.out.print(str);
	}

}
