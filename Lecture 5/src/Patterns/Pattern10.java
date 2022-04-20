package Patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);     //   1   
		int n=s.nextInt();                   //   121  
		int i=1;                             //  12321
		                                     // 1234321
		while(i<=n) {                       //   12321
			int space=1;                    //    121
			int j=1;                        //     1
			 
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
			 
			int d=i-1;      // we r taking one digit less for the right side pattern 
			while(k<i)
			{
				System.out.print(d);
				 d--;
				k++;
			}
			System.out.println();
			i++;
		}
		  // now we are printing the downward pattern
		        int t=1;
				while(t<n)  // now we havw to check for the remaining lower half ie, n-1
				{
					int space=1;                    //***          *****
					while(space<=t)                 // **           ***
					{                               //  *            *
						System.out.print(" ");
						space++;
					}
					int j=1;
					while(j<=n-t) {
						System.out.print(j);
						j++;
					}
					int q=n-t-1;  // for the right lower half
					int k=1;                          //**
					while(k<=n-t-1) {                // *
						System.out.print(q);
						k++;
						q--;
					}
					System.out.println();
					t++;
				};

	}

}
