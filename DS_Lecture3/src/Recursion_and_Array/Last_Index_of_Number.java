package Recursion_and_Array;

//Given an array of length N and an integer x, you need to find and return the last index of 
//integer x present in the array. Return -1 if it is not present in the array.
//Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
//You should start traversing your array from 0, not from (N - 1).
//Do this recursively. Indexing in the array starts from 0.

public class Last_Index_of_Number {

public static int lastIndex(int input[], int x) {
		int startIndex=input.length -1;
		return lastIndex(input,x,startIndex); // using the concept of function overloading
	}
	
	public static int lastIndex(int input[] ,int x, int startIndex) {
		if(startIndex < 0) {
			return -1;
		}
		if(input[startIndex] == x) {
			return startIndex;
		}
		int ans =lastIndex(input ,x ,startIndex-1);
		return ans;
	}

	public static void main(String[] args) {
		 int arr[]= {4,5,3,6,4,7,7};
		 int x=7;
		 System.out.println(lastIndex(arr ,x));

	}

}
