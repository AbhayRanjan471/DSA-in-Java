package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);     //****     
		int n=s.nextInt();                   // ***    
		int i=1;                             // **  
		                                     // * 
		while(i<=n) {
			 
			int j=n;
			 
			
			while(j>=i) {
				System.out.print("*");    //my ways
				j--;
				 
			}
			System.out.println();
			i++;
		}
//		while(i<=n) {
//			 
//			int j=1;
//			 
//			
//			while(j<=n-i+1) {
//				System.out.print("*");     //sir ways
//				j++;
//				 
//			}
//			System.out.println();
//			i++;
//		}

	}

}
