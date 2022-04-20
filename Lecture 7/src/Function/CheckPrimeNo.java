package Function;

import java.util.Scanner;

public class CheckPrimeNo {

	
		 public static boolean isPrime(int n)
		 {
			 for(int i=2;i<n;i++)
			 {
				 if(n %i==0) {
					 return false;// return krne pe ab function ktm ho jaye ga
				                // as soon as it" return false" the function will get over
			 }
			 } 
			 return true;
		 }
		 public static void main(String[] args) {
			 Scanner s=new Scanner(System.in);
			 int n=s.nextInt();
			// boolean isprime=true;   // if we do this way then then it will print true all the time
			boolean ansPrime= isPrime(n);
			 
			 
				 System.out.println(ansPrime);
			 }

	}


