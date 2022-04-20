//Given an array of integers, check whether it represents max-heap or not. Return true if the given array represents max-heap, else return false.
	//Sample Input 1:
	//8
	//42 20 18 6 14 11 9 4
	//Sample Output 1:
	//true

package Assignment;

import java.util.Scanner;

public class Check_Max_Heap {

	public static boolean checkMaxHeap(int arr[]) {
		int n = arr.length;
		for(int i =0 ; 2*i+1 < n ; i++) {
			int leftChildIndex = 2 * i + 1;
			int rightChildIndex = 2 * i + 2;

			//if(left child greater then parent then return false
			if(arr[i] < arr[leftChildIndex]) {
               return false;
			}
			//if right child exist and is greater then parent then return false
			if(rightChildIndex < n && arr[i] < arr[rightChildIndex]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		//Taking input of the array
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the size of the array");
		 int size = s.nextInt();
		 int arr[] = new int[size];
		 System.out.println("Enter the elements in the array");
		 for(int i = 0 ; i < size ;i ++) {
			 arr[i] = s.nextInt();
		 }
		 //calling th function
		 boolean isCheck = checkMaxHeap(arr);
		 System.out.println(isCheck);
	}

}
