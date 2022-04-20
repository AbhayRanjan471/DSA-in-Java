package Assignment;

import java.util.Scanner;

//You have been given an integer array/list(ARR) of size N. It has been
//sorted(in increasing order) and then rotated by some number 'K' in the right hand direction.
//Your task is to write a function that returns the value of 'K', that 
//means, the index from which the array/list has been rotated.

//Sample Input 1:
//
//6
//5 6 1 2 3 4
//Sample Output 1:
//2

public class CheckArray_Rotation {
	
	 public static int arrayRotateCheck(int[] arr){
	    	//Your code goes here
	      
	        int k=0;
	        for(int i=0;i<arr.length-1;i++){
	            
	        if(arr[i]>arr[i+1]){
	            k=i+1;
	            
	        }   
	           
	        }
	        return k;
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
	int k=arrayRotateCheck(arr);
		 
System.out.println(k);
	}

	}


