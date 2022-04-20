package Assignment_Time_nd_Space_Comp;
//You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. 
//You need to print their intersection; An intersection for this problem can be defined when
//both the arrays/lists contain a particular value or to put it in other words, when there 
//is a common value that exists in both the arrays/lists.
//	Sample Input 2 :
//	1
//	4
//	2 6 1 2
//	5
//	1 2 3 4 2
//	Sample Output 2 :
//	1 2 2
//Explanation for Sample Output 2 :
//Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. 
	//The first '2' of first array matches with the first '2' of the second array. Similarly, 
	//the second '2' of the first array matches with the second '2' if the second array.
	
import java.util.Arrays;

public class Array_Intersection {
	

	public static void intersection(int[] arr1, int[] arr2) {
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		 
		int i=0; 
		int j =0 ;
           while( i < arr1.length && j < arr2.length) {
        	   
        	   if(arr1[i] > arr2[j]) {
        		   j++;
        	   }
        	   else if(arr1[i] < arr2[j]) {
        		   i++;
        	   }
        	   else {
        		   System.out.print(arr1[i] + " ");
        		   i++ ;
        		   j++;
        	   }
           }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1 [] = {2,6,1,2};
		int arr2 [] = {1,2,3,4,2};
		intersection(arr1 , arr2);
		
	
	}
}
		
