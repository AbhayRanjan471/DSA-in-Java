//Given an array with N elements, you need to find the length of the longest subsequence in the given array
//such that all elements of the subsequence are sorted in strictly increasing order.
//Sample Input 1 :
//6
//5 4 11 1 16 8
//Sample Output 1 :
//3
//Sample Output Explanation
//Length of longest subsequence is 3 i.e. (5,11,16) or (4,11,16).
package Assignment;

import java.util.Scanner;

public class Longest_Increasing_Subsequence {
	
	public static int LongestIncrSubsequence(int arr[]) {
		int dp[] = new int[arr.length];
		int overAllmax = 0;// it will store the over all Longest subsequence 
		
		for(int i =0 ; i < arr.length ; i++) {
			int max = 0;
			for(int j =0 ; j < i ; j++) {
				if(arr[i] > arr[j]) {
					if(dp[j] > max) {
						max = dp[j];
					}
				}
			}
			dp[i] = max + 1; // putting the longest subsequence value
			
			//updating the over All max subsequence
			if(dp[i] > overAllmax) {
				overAllmax = dp[i];
			}
		}
		return overAllmax;
	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the no of elements in the Array");
		 int size = s.nextInt();
		 int arr[] = new int[size];
		 System.out.println("Enter the elements in the Array");
		 for(int i =0 ; i < size ; i++) {
			 arr[i] = s.nextInt();
		 }
		 int value = LongestIncrSubsequence(arr);
		 System.out.println(value);

	}

}
