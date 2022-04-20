package Assignment;

import java.util.Scanner;

//You have been given an integer array/list(ARR) of size N that contains only 
//integers, 0 and 1. Write a function to sort this array/list. Think of a solution
//which scans the array/list only once and don't require use of an extra array/list.

//Sample Input 1:
//
//7
//0 1 1 0 1 0 1
//Sample Output 1:
//0 0 0 1 1 1 1

public class Sort_0_1 {
	
	
	
//	 public static void sortZeroesAndOne(int[] arr) {
//	    	//Your code goes here
//	      
//	        int c=0;
//	        int pointer_to_next_zero=0;
//	        for(int i=0;i<arr.length;i++){
//	            
//	            if(arr[i]==0){
//	                int temp=arr[pointer_to_next_zero];   //arr[1]=1;
//	                arr[pointer_to_next_zero]=arr[i];
//	                System.out.print(arr[pointer_to_next_zero]+" ");//arr[1]=0;  arr[i]=0;
//	                arr[i]=temp;                         //arr[i]=1;
//	                pointer_to_next_zero++;
//	                c++;
//	            }
//	            
//	        }
//	        int i=0;
//	        while(i<(arr.length-c)) {    // this is used for printing the 1
//	        	System.out.print("1 ");
//	        	i++;
//	        }
//	 }
//
//	public static void main(String[] args) {
//		
//		 Scanner s=new Scanner(System.in);
//		 System.out.println("enter the size of array");
//		 int size=s.nextInt();
//		 
//		 int arr[]=new int[size];
//		 System.out.println("enter the elements array");
//		 for(int i=0;i<arr.length;i++) {
//			 arr[i]=s.nextInt();
//		 }
//		 sortZeroesAndOne(arr);
//		 
//
//	
//
//	}
//
//}
       
	//alternate approach
	
  public static void sortZeroesAndOne(int[] arr) {
	//Your code goes here
  int count=0;
  for(int i=0;i<arr.length;i++){
      if(arr[i]==0)
          count++;  // counting no. of zeroes
  }
 
 
  for(int i=0;i<arr.length;i++){
      if(i<count)
         System.out.print((arr[i]=0) +" ");
      else
         System.out.print((arr[i]=1)+" "); 
  }
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
	 sortZeroesAndOne(arr);
}
	 
}



