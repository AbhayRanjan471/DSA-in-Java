package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) { 
		 Scanner s=new Scanner(System.in);  //n=4
		 int n=s.nextInt();               //        *
		 int i=1;                        //        ***   
//		 int k=1;                        //       *****
//		  while(i<=n)                   //       *******
//		  {
//			  int space=1;
//			  while(space<=n-i)
//			  {
//				  System.out.print(" ");      //sysout+ctrl+space
//				  space++;
//			  }
//			   
//			 int j=1;
//			 while(j<=i) {
//				 System.out.print("*");
//				   
//				 j++;
//			 }
//			 while(k<i)
//			 {
//				  int p=1;
//				  while(p<=k)
//				  {
//					  System.out.print("*");    //itni khusi mujhe aj tk nai howe
//					  p++;
//				  }
//				  k++;
//			 }
//			 System.out.println();
//			 i++;
			 
			 //Alternte method (in this method one loop is less)
		 
			 while(i<=n)                   //       *******
			  {
				  int space=1;
				  while(space<=n-i)
				  {
					  System.out.print(" ");      //sysout+ctrl+space
					  space++;
				  }
				   
				 int j=1;
				 while(j<=i) {
					 System.out.print("*");
					   
					 j++;
				 }
				 int k=1;
				 while(k<i)
				 {
					  
						  System.out.print("*");    //itni khusi mujhe aj tk nai howe
						  k++;
					  
					  
				 }
				 System.out.println();
				 i++;
			 
		  }

	}

}
