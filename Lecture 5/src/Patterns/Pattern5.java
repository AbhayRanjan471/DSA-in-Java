package Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);     //   1   
		int n=s.nextInt();                   //   121   
		int i=1;                             //  12321
		                                     // 1234321
		while(i<=n) {
			int space=1;
			int j=1;
			 
			while(space<=n-i)
			{
				System.out.print(" ");    //did it by myself in one attempt
				space++;
			}
			while(j<=i) {
				System.out.print(j);
				j++;
				 
			}
			int k=1;
			int p=i-1;
			
			while(k<i)
			{
				System.out.print(p);
				p--;
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
