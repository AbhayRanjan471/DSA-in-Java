package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);     //   *   
		int n=s.nextInt();                   //   ***  
		int i=1;                             //  *****
		                                     // *******
		while(i<=n) {
			int space=1;
			int j=1;
			 
			while(space<=n-i)
			{
				System.out.print(" ");    //did it by myself in one attempt
				space++;
			}
			while(j<=i) {
				System.out.print("*");
				j++;
				 
			}
			int k=1;
			//int p=i-1;
			
			while(k<i)
			{
				System.out.print("*");
				//p--;
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
