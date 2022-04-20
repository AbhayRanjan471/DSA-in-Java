package Assignment;

import java.util.Scanner;

//You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2).
//Each number is present at least once. That is, if N = 5, the array/list constitutes values 
//ranging from 0 to 3 and among these, there is a single integer value that is present twice. 
//You need to find and return that duplicate number present in the array.
//Note :
//Duplicate number is always present in the given array/list.

//Sample Input 1:
//
//9
//0 7 2 5 4 7 1 3 6
//Sample Output 1:
//7

public class Find_Duplicate {
	 public static int duplicateNumber(int arr[]) {
	    	//Your code goes here
	         int temp=0;
	        for(int i=0;i<arr.length;i++){
	            int c=0;
	            for(int j=0;j<arr.length;j++){
	                
	                if(arr[i]==arr[j]){
	                    c++;
	                }
	                
	            }
	            if(c==2){
	                temp=arr[i];
	               return temp;
	            }
	        }
	       return temp;
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
		 int dubli=duplicateNumber(arr);
         System.out.println(dubli);
	}

}
