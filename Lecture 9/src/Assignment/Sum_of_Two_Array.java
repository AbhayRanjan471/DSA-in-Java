package Assignment;

import java.util.Scanner;

public class Sum_of_Two_Array {
	 public static int[] sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
		   int a1=arr1.length-1;
	        int a2=arr2.length-1;
	        int temp=0;
	        int sum=0;
	        int max=Math.max(arr1.length,arr2.length);

	        while(a1>=0 && a2>=0){
	        	 sum=arr1[a1]+arr2[a2]+temp;
	            output[max]=sum%10;
	            temp=sum/10;
	            a1--;
	            a2--;
	            max--;
	            }
	        while(a1>=0){
	             sum=arr1[a1]+temp;
	            output[max]=sum%10;
	            temp=sum/10;
	            a1--;
	            max--;
	        }
	        while(a2>=0){
	             sum=arr2[a2]+temp;
	            output[max]=sum%10;
	            temp=sum/10;
	            a2--;
	            max--;
	        }
	        output[0]=temp; 
	        
	        
	      
	    return output;
	 }

	public static int[] takingInput(Scanner s,int arr[]) {
		 System.out.println("enter the elements in array1");
		 
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=s.nextInt();
		 }
		 return arr;
	}

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("enter the size of array1");
		 int size1=s.nextInt();
		 
		 System.out.println("enter the size of array2");
		 int size2=s.nextInt();
		 int arr1[]=new int[size1];
		 int arr2[]=new int[size2];
		 
		
		 arr1=takingInput(s,arr1); //passing the Scanner also
		 arr2=takingInput(s,arr2);
		 int output[]=new int[(arr1.length)+arr2.length];
		 int sum[]= sumOfTwoArrays(arr1,arr2,output);
		  
		 for(int i=0;i<sum.length;i++) {
			 System.out.print(sum[i]);
		 }
		  

	

	}
}
