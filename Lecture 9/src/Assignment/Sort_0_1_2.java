package Assignment;

import java.util.Scanner;

//You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s.
//Write a solution to sort this array/list in a 'single scan'.
//'Single Scan' refers to iterating over the array/list just once or to put it in 
//other words, you will be visiting each element in the array/list just once.

//Sample Input 1:
//
//7
//0 1 2 0 2 0 1
//Sample Output 1:
//0 0 0 1 1 2 2

public class Sort_0_1_2 {
	
	//1st method
	 public static int[] sort012(int[] arr){
	        int one=0;   // to count total no. of zeros
	        int zero=0;  // to count total no of one
	        int two=0;    // to count total no of two
	        
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]==0){
	                zero++;     
	            }
	            else if(arr[i]==1){
	                one++;
	            }
	            else{
	                two++;
	            }
	            
	        }
	        for(int j=0;j<arr.length;j++){
	            if(zero>0){
	                arr[j]=0; //  first all the zeroes will be added
	                zero--;
	            }
	            else if(one>0){
	                arr[j]=1;  // 2nd all the 1 will be added 
	                one--;
	            }
	            else{
	                arr[j]=2;
	                two--;     // 3rd at the remaing place all the 2 will be added
	            }
	        }
	            return arr;
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
		 sort012(arr);
		 for(int i=0;i<size;i++) {
			 System.out.print(arr[i]+" ");
		 }

	}

	}

   // second method

//public static int[] sort012(int[] arr){
//   int n=arr.length;
//  int j=0;
//  int k=n-1;
//  for(int i=0;i<n;i++){
//     
//      if(arr[i]==0){
//          arr[j]=arr[i];
//          j++;
//      }
//      else if( arr[i]==2){
//          arr[k]=arr[i];
//          k--;
//      }
//  }
//  while(j<=k){
//      arr[j]=1;
//      j++;
//      }
//	return arr;
//}
//public static void main(String[] args) {
//Scanner s=new Scanner(System.in);
//	 
//	 System.out.println("enter the size of array");
//	 int size=s.nextInt();
//	 int arr[]=new int[size];
//	 System.out.println("enter the elements array");
//	 for(int i=0;i<arr.length;i++) {
//		 arr[i]=s.nextInt();
//	 }
//	 sort012(arr);
//	 for(int i=0;i<size;i++) {
//		 System.out.print(arr[i]+" ");
//	 }
//	 
//
//}
//
//}
