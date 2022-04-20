package Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		                                     //n=4
		 int n=s.nextInt();                  //1
		 int i=1;                           // 2 3
		 int k=1;                           // 4 5 6
		  while(i<=n)                      //  7 8 9 10
		  {
			 int j=1;
			 while(j<=i) {
				 System.out.print(k+" ");
				  k++;
				 j++;
			 }
			 System.out.println();
			 i++;
		  }
	}

}
