package Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);  //n=4
		 int n=s.nextInt();                 //     1
		 int i=1;                           //    23 
		                                   //    345
		  while(i<=n)                     //    4567
		  {
			  int space=1;
			  while(space<=n-i)
			  {
				  System.out.print(" ");      //sysout+ctrl+space
				  space++;
			  }
			 int k=i;  
			 int j=1;
			 while(j<=i) {
				 System.out.print(k);
				  k++;
				 j++;
			 }
			 System.out.println();
			 i++;
		  }

	}

}
