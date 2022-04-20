package Patterns;
 import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     int i=1;
//	        while(i<=n){
//				int j=1;
//				while(j<=2*n-1){
//					if (i == j) {                           //Alternate way according to TA
//						System.out.print(i);                //N=4
//					} else if (j == (2 * n - i)) {         //  1     1
//						System.out.print(i);               //   2   2
//					} else {                               //    3 3
//						System.out.print(" ");              //    4
//					}                                     //     3 3
//					j++;                                  //    2   2  
//				}                                         //   1     1
//				i++;
//				System.out.println();
//	        }
//	        
//	        i=n-1;
//	        while(i>0){
//	            int j=1;
//	            while(j<=2*n-1){
//	                	if (i == j) {
//						System.out.print(i);
//					} else if (j == (2 * n - i)) {
//						System.out.print(i);
//					} else {
//						System.out.print(" ");
//					}
//					j++;
//	            }
//	            i--;
//	            System.out.println();
//	        }
          
	     while(i<=n) {
	    	 int j=1;
	    	 while(j<=(2*n)-i) {
	    		 if(j==i||j==(2*n)-i) {      // here we are taking the 1st column nd the last coloumn ie. i and (2*n)-i and there we are printing the row ie. 'i'
	    			 System.out.print(i);   // my way but it's same as of 'TA' one
	    		 }
	    		 else {
	    			 System.out.print(" ");
	    		 }
	    		 j++;
	    		 
	    	 }
	    	 i++;
	    	 System.out.println();
	     }
	     // this on is the lower half of the pattern
	    	  i=n-1;
	    	 while(i>=1)
	    	 {
	    		 int j=1;
	    		 while(j<=(2*n)-i)
	    		 {
	    			if(j==i||j==(2*n)-i)
	    			{
	    				System.out.print(i);
	    				
	    			}
	    			else {
	    				System.out.print(" ");
	    			}
	    			j++;
	    		 }
	    		 i--;
	    			System.out.println();
	    
	    	 }
	    	
	     }

	}


