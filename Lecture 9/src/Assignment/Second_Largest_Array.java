package Assignment;

import java.util.Scanner;

//You have been given a random integer array/list(ARR) of size N. You are required 
//to find and return the second largest element present in the array/list.
//If N <= 1 or all the elements are same in the array/list then
//return -2147483648 or -2 ^ 31(It is the smallest value for the range of Integer)

public class Second_Largest_Array {
	
	public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int max1=Integer.MIN_VALUE; // will store the maximum value
        int max2=Integer.MIN_VALUE;  // will store the second maximum value
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        for(int j=0;j<arr.length;j++){
            
            if(arr[j]>max2 && arr[j]!=max1){
                max2=arr[j];
            }
        }
        return max2;
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
		int max2nd= secondLargestElement(arr);
		 
        
        	System.out.println(max2nd);
        }
	}

	


