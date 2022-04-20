package Assignment;

import java.util.Scanner;

//You have been given a random integer array/list(ARR) of size N. Write a function that 
//rotates the given array/list by D elements(towards the left).
//Sample Input 1:
//
//7
//1 2 3 4 5 6 7
//2
//Sample Output 1:
//3 4 5 6 7 1 2

public class Rotate_Array {
	
	 public static int[] rotate(int[] arr, int d) {
	    	//Your code goes here
	        int j=0;
	        int n=arr.length;
	        int temp[]=new int[n];
	        for(int i=0;i<arr.length;i++){
	            
	            if(i<d){
	                temp[j]=arr[i];  // storing the no till d in temp
	                j++;
	            }
	            else{
	                arr[i-d]=arr[i];  //sifting all the remaining elements by d towards left
	            }
	        }
	        int k=n-d;// the remaing elements which are less then 'd' will be stored from 'k'th position
	        int s=0;
	        while(k<n){
	            arr[k]=  temp[s];  //storing the elements in last
	            k++;
	            s++;
	        }
	        return arr;
	    }

	public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
		 
		 System.out.println("enter the size of array");
		 int size=s.nextInt();
		 int arr[]=new int[size];
		 System.out.println("enter the sorted elements form which u want to rotate");
		 int d=s.nextInt();
		 System.out.println("enter the elements array");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=s.nextInt();
		 }
		 rotate(arr,d);
		 
		 for(int i=0;i<size;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 

	}

	}


