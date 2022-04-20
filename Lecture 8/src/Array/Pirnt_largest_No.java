package Array;

import java.util.Scanner;

public class Pirnt_largest_No {

	public static void main(String[] args) {
	  
	  int arr[]=takinginput();
	  int largest=largestInArray(arr);
	  System.out.println(largest);

	}
	public static int[] takinginput()
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int input[]=new int[size];
		
		for(int i=0;i<size;i++) {
			input[i]=s.nextInt();
		}
		return input;
	}
	public static int largestInArray(int input[])
	{
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<input.length;i++)
		{
			if(input[i]>max) {
				max=input[i];
			}
		}
		return max;
	}
	
	

}
