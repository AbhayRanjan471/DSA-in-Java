package Searching_and_Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int size=s.nextInt();
		 
		 
		 int arr[]=new int[size];
		 for(int i=0;i<size;i++) {
			  arr[i]=s.nextInt();
		 }
		 
			 for(int i=0;i<size;i++) {
				 
			 
			 
			 for(int j=0;j<size-1;j++) {
				 if(arr[j]>arr[j+1]) {
					 int temp=arr[j+1];
					 arr[j+1]=arr[j];
					 arr[j]=temp;
				 }
			 }
			 }
			 
		 for(int t=0;t<arr.length;t++) {
			 System.out.print(arr[t]+" ");
		 }

	}

}
