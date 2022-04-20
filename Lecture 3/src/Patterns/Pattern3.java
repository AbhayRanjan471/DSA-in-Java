package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		                                        //n=4
		 Scanner s=new Scanner(System.in);     //      1
		 int n=s.nextInt();                    //     23
		 int i=1;                             //     456
		 int k=1;                           //      78910
		  while(i<=n)
		  {
			  int space=1;
			  while(space<=n-i) {        //space=n-i
				  System.out.print(" ");
				  space++;
			  }
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
