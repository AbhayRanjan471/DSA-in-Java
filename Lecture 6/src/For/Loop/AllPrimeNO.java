package For.Loop;

import java.util.Scanner;

public class AllPrimeNO {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);  
		
		int n=s.nextInt();
		
		//Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
		
//		for(int i=2;i<=n;i++)
//		{
//			int c=0; 
//			for(int j=1;j<=i;j++)
//			{
//				if(i%j==0)
//				{
//			      c++;
//
//			     
//			      
//				}
//			}
//			if(c==2) {
//				System.out.println(i);
//			
//			}
//		}
		
		//alternate method
		
		for(int i=2;i<=n;i++)
		{
			   boolean isprime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
			      
			      isprime=false;
			      break;
			      
				}
			}
			if(isprime) {
				System.out.println(i);
			
			}
		}
	
	}
}
