package Assignment;

import java.util.Scanner;

//You have been given an integer array/list(ARR) and a number X. Find and return the 
//total number of pairs in the array/list which sum to X.

public class Pair_Sum {
	  public static int pairSum(int arr[], int x) {
	    	//Your code goes here
	        int c=0;
	        for(int i=0;i<arr.length;i++){
	            
	            for(int j=i+1;j<arr.length;j++){
	                
	                if(arr[i]+arr[j]==x)
	                {
	                    c++;
	                    //break;
	                }
	            }
	        }
	        return c;
	    }

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the no. ");
		 int x=s.nextInt();
		 
		 System.out.println("enter the size of array");
		 int size=s.nextInt();
		 int arr[]=new int[size];
		 
		 System.out.println("enter the elements in array");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=s.nextInt();
		 }
		 int sum=pairSum(arr,x);
		 System.out.println(sum);

	}

	}


