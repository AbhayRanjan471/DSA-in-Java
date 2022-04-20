package Searching_and_Sorting;

import java.util.Scanner;

public class Insertion_sort {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int size=s.nextInt();
		 
		 
		 int arr[]=new int[size];
		 for(int i=0;i<size;i++) {
			  arr[i]=s.nextInt();  // taking input from the user
		 }
		 
			 for(int i=1;i<size;i++) { // doing sorting
				int j=i-1; 
			 int temp=arr[i];
			 
			 while(j>=0 && arr[j]>temp) {
				 arr[j+1]=arr[j];  // sifting the elements by 1
				 j--;
			 }
			 arr[j+1]=temp;
			 }
			 
		 for(int i=0;i<size;i++) {  //printing the sorted array
			 System.out.print(arr[i]+" ");
		 }

	}

}
