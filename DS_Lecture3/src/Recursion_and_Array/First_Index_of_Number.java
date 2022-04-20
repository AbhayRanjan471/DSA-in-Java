package Recursion_and_Array;
//Given an array of length N and an integer x, you need to find and return the first index of
//integer x present in the array. Return -1 if it is not present in the array.
//First index means, the index of first occurrence of x in the input array.
//Do this recursively. Indexing in the array starts from 0.

//Sample Input :
//
//9 8 10 8
//8
//Sample Output :
//1

public class First_Index_of_Number {

public static int firstIndex(int input[], int x) {
		
		return firstIndex(input,x,0); // using the concept of function overloading
	}
	
	public static int firstIndex(int input[] ,int x, int startIndex) {
		if(startIndex >= input.length) {
			return -1;
		}
		if(input[startIndex] == x) {
			return startIndex;
		}
		int ans =firstIndex(input ,x ,startIndex+1);
		return ans;
	}

	public static void main(String[] args) {
		 int arr[]= {4,5,3,6};
		 int x=3;
		 System.out.println(firstIndex(arr ,x));

	}
}
