package Assignment;
import java.util.Scanner;
public class TermsOfAP {

	public static void main(String[] args) {
		
//		Write a program to print first x terms of the series 3N + 2 which are not multiples of 4. where n=1,2,3,......
//		Sample Input 1 :
//			10
//			Sample Output 1 :
//			5 11 14 17 23 26 29 35 38 41
		
		 Scanner s=new Scanner(System.in);
		 int x=s.nextInt();
		 int count=1, current=1;
		 
		 while(count<=x)
		 {
			 int num=3*current+2;
			 
			 if(num % 4 !=0)
			 {
				 System.out.print(num+" ");
				 count++;
			 }
			 current++;
		 }

	}

}
