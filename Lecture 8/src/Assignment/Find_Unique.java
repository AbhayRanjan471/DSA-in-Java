package Assignment;

import java.util.Scanner;

//You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
//Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
//You need to find and return that number which is unique in the array/list.

//Sample Input 1:
//
//7
//2 3 1 6 3 6 2
//
//Sample Output 1:
//1

public class Find_Unique {
	 public static int findUnique(int[] arr){
			//Your code goes here
	        
	        int unique=0;
			for(int i=0;i<arr.length;i++) {
				unique^=arr[i];  // way to find unique (use of XOR :-1^1 =0 ;2^2 =0)
			}
			return unique;
	 }
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the size of array");
		 int size=s.nextInt();
		 int arr[]=new int[size];
		 System.out.println("enter the elements array");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=s.nextInt();
		 }
		 int unique=findUnique(arr);
		 System.out.println(unique);

	}

}
