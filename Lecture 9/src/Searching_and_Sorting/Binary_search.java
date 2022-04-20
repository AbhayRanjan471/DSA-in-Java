package Searching_and_Sorting;

import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int size=s.nextInt();
		 int search=s.nextInt();
		 
		 int arr[]=new int[size];
		 for(int i=0;i<size;i++) {
			  arr[i]=s.nextInt();
		 }
		
		 
		 int x=arr.length -1;
		 int end=x;
		 int start=0;
		 int mid;
		// int temo;
		 while(start<=end) {
			 mid=(start+end)/2;
			 
			 if(search==arr[mid]) {
				 System.out.println(mid);
				 break;
			 }
			 else if(search>arr[mid]) {
				 start=mid+1;
			 }
			 else if(search<arr[mid]) {
				 end=mid-1;
			 }
			 else {
				 System.out.println("search not found");
			 }
		 }
		 
		

	}

}
