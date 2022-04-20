//Given an array A of random integers and an integer k, find and return the kth largest element in the array.
//Note: Try to do this question in less than O(N * logN) time.
	//Sample Input 1 :
	//6
	//9 4 8 7 11 3
	//2
	//Sample Output 1 :
	//9

package Assignment;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_largest_element {
	
	public static int kthLargest(int n, int[] input, int k) {
		// Write your code here

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //inserting the elements in the priority Queue
        for(int i = 0 ; i < input.length ; i++){
            pq.add(input[i]);
             
        }
       // removing the elements from the priority Queue and inserting into the given array
        for(int i =0 ; i < input.length ; i++){
            input[input.length - 1 -i] = pq.remove();
        }
        return input[k-1]; 
        
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
		 System.out.println("Enter the Kth position");
		 int k = s.nextInt();
		 
		 //calling the function
		 int value = kthLargest(size, arr, k);
		 System.out.println("Kth largest element is \n" + value);
		 

	}

}
