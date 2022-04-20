package Patterns;

import java.util.Scanner;

public class SumOfEvenNdOdd {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();       // n=34567   o/p=4+6  3+5+7
		 int sum1=0;
		 int sum2=0;
		  while(n>0) {
			  int r=n%10;
			  n=n/10;
			  
			  if(r % 2==0) {
				  sum1=r+sum1;
				  
			  }
			  else{
				  sum2=r+sum2;
			  }
			  
		  }
		  System.out.println(sum1 +" "+sum2);

	}

}
