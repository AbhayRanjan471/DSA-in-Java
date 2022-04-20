package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		                                       // N=5     n should only be ODD
		Scanner s=new Scanner(System.in);     //   *    
		int n=s.nextInt();                   //   ***  
		int i=1;                             //  *****
		if (n%2==0) {                        //   ***
			return; // will terminate the   //     *  
		} //prgm if no. is even
		else {
			
		int q=n/2+1;          //bcz we want to print the first upper half ie, why we have divided n by 2 and then added 1
		while(i<=q) {                       
			int space=1;                     
			int j=1;                         
			 
			while(space<=q-i)
			{
				System.out.print(" ");    
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
		
		        int t=1;       // its does the  same work as" int i" does in the line upper lines.
				while(t<=(n/2))      // here we want the remaining lower part that's why we have divide only by 2 and not added 1
				{
					int space=1;                              
					while(space<=t)                 // **           ***
					{                               //  *            *
						System.out.print(" ");
						space++;
					}
					int j=0;
					while(j<=((n/2)-t))
							{
						System.out.print("*");
						j++;
					}
					int k=1;                          //--*
					while(k<=((n/2)-t)) {                
						System.out.print("*");
						k++;
					}
					System.out.println();
					t++;
				};
		
	}
		
		//Alternate method(Solution by coding ninja)
		
		

	}
}
