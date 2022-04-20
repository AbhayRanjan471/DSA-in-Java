package Recursion_and_Array;
// in this we are besically using function overloading ,so that some input which we don't allow the user to change 
// will be made in overloaded function

public class Recursion_and_helper_Function {
 
	public static boolean checkSortedBetter(int arr [],int startIndex) {
		if(startIndex >= arr.length-1) {
			return true;
		}
		if(arr[startIndex] > arr[startIndex + 1]) {
			return false;
		}
		boolean isSort=checkSortedBetter(arr , startIndex +1); // here we are just passing the reference of the array and starting index by increasing 1
		return isSort;
	}
	
	public static boolean checkSortedBetter(int arr []) { // using concept of function overloading
		return checkSortedBetter(arr , 0); //here we are passing the starting Index and not in the main so that user cannot change it.
		                           
	}

	public static void main(String[] args) {
		 int arr[]= {2,4,5,6};
		 System.out.println(checkSortedBetter(arr));

	}
}
