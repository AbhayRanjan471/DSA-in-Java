//You are given with an integer k and an array of integers that contain numbers in random order. Write a program
//to find k largest numbers from given array. You need to save them in an array and return it.
//Time complexity should be O(nlogk) and space complexity should be not more than O(k).
	//	Sample Input :
	//	13
	//	2 12 9 16 10 5 3 20 25 11 1 8 6 
	//	4
	//	Sample Output :
	//	12
	//	16
	//	20
	//	25

package Priority_Queues;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.ArrayList;

//My way
public class K_Largest_elements {
	public static ArrayList<Integer> kLargest(int input[], int k) {//
		 
		ArrayList<Integer> arr = new ArrayList<>();
		
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < input.length ; i++){
            pq.add(input[i]); // inserting the elements in the PriorityQueue
        }
        for(int i = 0 ; i < input.length ; i++){
            input[input.length - 1 -i] = pq.remove(); //removing the elements from the priority Queue and storing in the Array
                                                     // as we have seen before the array will be stored in descending order
        }
        for(int i = 0 ; i < k ; i++){ // storing the k no. of greatest elements into the ArrayList
        	arr.add(input[i]);
        }
        return arr;
		
	}

	public static void main(String[] args) {
		// taking input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		int input[] = new int[size];
		System.out.println("enter the elements in the array");
		for(int i = 0 ; i < size ; i++) {
			input[i] = s.nextInt();
		}
		  
		ArrayList<Integer> arr = kLargest(input , 3);
		//printing the array
		for(int i : arr) {
		System.out.print(i +" ");
		}

	}

}
