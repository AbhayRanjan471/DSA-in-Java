package Searching_and_Sorting;

import java.util.Scanner;


public class Merge2_sorted_function_array {
	
	public static int[] MergeArray(int arr1[],int arr2[]) {
		 int n =arr1.length+arr2.length;
	     int arr3[]=new int[n];
	     
	     int i=0;
	     int j=0;
	     int k=0;
	     
	     while(i<arr1.length && j<arr2.length) {
	   	  
	   	  if(arr1[i]<arr2[j]) {
	   		  arr3[k]=arr1[i];
	   		  
	   		  k+=1;
	   		  i+=1;
	   	  }
	   	  else {               // in both condition it will come here when arr2[j]<arr1[i]  and when arr1[i]==arr2[j];
	   		  arr3[k]=arr2[j];
	   		 
	   		  k+=1;
	   		  j+=1;
	   	  }}
	  
	   	  while(i<arr1.length) {
	   		  arr3[k]=arr1[i];
	   		  
	   		  k+=1;
	   		  i+=1;
	   	  }
	   	  while(j<arr2.length) 
	   		  {
	   		  arr3[k]=arr2[j];
	   		  
	   		  k+=1;
	   		  j+=1;
	   	  }
	   	  return arr3;
	}
	
	public static int[] takingInput(Scanner s) {
	
		System.out.println("enter the size of 1st array");
	int size1=s.nextInt();
	int arr1[]=new int[size1];
	
	System.out.println("enter the size of 2nd array");
	int size2=s.nextInt();
	int arr2[]=new int[size2];
	
	System.out.println("enter the elements in 1st array");
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=s.nextInt();
	}
	System.out.println("enter the elements in 2nd array");
	for(int j=0;j<arr2.length;j++) {
		arr2[j]=s.nextInt();
	}
	
	int arr[]=MergeArray(arr1,arr2);
	return arr;
	
	}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);	 
     int arr3[]=takingInput(s);
     
     for(int i=0;i<arr3.length;i++) {
    	 System.out.print(arr3[i]+" ");
     }
	}

}
