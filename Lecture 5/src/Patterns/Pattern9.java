package Patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);     //   *       N=4
		int n=s.nextInt();                   //   ***  
		int i=1;                             //  *****
		                                     // *******
		while(i<=n) {                       //   *****
			int space=1;                    //    ***
			int j=1;                        //     *
			 
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
			 
			
			while(k<i)
			{
				System.out.print("*");
				 
				k++;
			}
			System.out.println();
			i++;
		}
	  // now we are printing the downward pattern
		        int t=1;
				while(t<n)  // now we have to print n-1 remaining lower half patter 
				{
					int space=1;                    //***          *****
					while(space<=t)                 // **           ***
					{                               //  *            *
						System.out.print(" ");
 						space++;
 					}
 					int j=1;
 					while(j<=n-t) {
 						System.out.print("*");
 						j++;
 					}
					int k=1;                          //**
					while(k<=n-t-1) {                // *
						System.out.print("*");
						k++;
					}
					System.out.println();
					t++;
				};

	}

}
