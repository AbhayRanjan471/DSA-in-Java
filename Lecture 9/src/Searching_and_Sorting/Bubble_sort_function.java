package Searching_and_Sorting;
import java.util.Scanner;

public class Bubble_sort_function {
	
		public static void print(int arr[]) {  // this function is used to print the sorted array
			
			System.out.println("ur sorted array is ");
		   for(int i=0;i<arr.length;i++) {
			   System.out.print( arr[i]+" ");
		   }
		}
		
		public static int[] Sorting(int arr[]) {  // this function is used to sort the array
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=0;j<arr.length-i-1;j++) {
					
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			return arr;
		}
		
		public static int[] takingInput(int n,Scanner s) {   // this function is taking all the necessary inputs
			int size=n;
			int arr[]=new int[size];
			System.out.println("enter the elments in the array");
			for(int i=0;i<arr.length;i++) {
				arr[i]=s.nextInt();
			}
			return arr;
		}

		public static void main(String[] args) {
			 Scanner s=new Scanner(System.in);
			 System.out.println("enter the size of the array");
			 int size=s.nextInt();
			 int arr[]=takingInput(size,s);
	         int sort[]=Sorting(arr);
	         print(sort);
		}

	}


