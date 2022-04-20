package Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();                 //n=4
		 int i=1;                           // 1
		                                    // 23
		  while(i<=n)                       // 345
		  {                                 // 4567
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
