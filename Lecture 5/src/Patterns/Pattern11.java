package Patterns;
import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int i=1; 
		                                                    //N=4   (check the alternate method pattern 12 or 13 this one is too lenthy
		 while(i<=n) {                                 // 1     1
			 int j=1;                               //     2   2
			                                        //      3 3
			 while(j<=n)                            //       4
			 {                                      //      3 3
				 if(j==i) {                        //      2   2
					 System.out.print(i);          //     1     1
				 }
				 else {
					 System.out.print(" ");
				 }
				 j++;
			 }
			  int p=n-i;
			  int k=1;
			  
			  while(k<=p)
			  {
				  if(k==p)
				  {
					  System.out.print(i);
				  }
				  else {
					  System.out.print(" ");
				  }
				  k++;
			  }
			  System.out.println();
			  i++;
		 }
         int t=1;
		 
		 while(t<=n-1)
		 {
			 int j=1;
			 
			 while(j<=n) 
			 {
				 if(j==n-t) {
					 System.out.print(j);
				 }
				 else {
					 System.out.print(" ");
				 }
				 j++;
			 }
			  
			      int r=n-t;
				 int x=n-1;
				 while(x>=r)
				 {
					 if(x==r)
					 {
						 System.out.print(x);
					 }
					 else {
						 System.out.print(" ");
					 }
					 x--;
				 }
				 
			 
			 t++;
			 System.out.println();
		 }

	}
}

