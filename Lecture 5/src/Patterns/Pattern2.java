package Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);     //   1   
		int n=s.nextInt();                   //   12   
		int i=1;                             //  123
		                                     // 1234
		while(i<=n) {
			int space=1;
			int j=1;
			 
			while(space<=n-i)
			{
				System.out.print(" ");
				space++;
			}
			while(j<=i) {
				System.out.print(j);
				j++;
				 
			}
			System.out.println();
			i++;
		}

	}

}
