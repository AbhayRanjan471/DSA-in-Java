package Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);     //4444     
		int n=s.nextInt();                   // 333    
		int i=1;                             // 22  
		//int k=n;                           // 1 
		while(i<=n) {
			 
			int j=n;
			 
			
			while(j>=i) {
				System.out.print(n-i+1);    
				//System.out.print(k); 
				j--;
				 
			}
			System.out.println();
			i++;
			//k--;
		}
		
		//Alternate method
		
//		int i=1;
//		while(i<=n) {
//			int j=1;
//			while(j<=n-i+1)
//			{
//				System.out.print(n-i+1);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

	}

}
