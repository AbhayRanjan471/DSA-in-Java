package Recursion_and_Array;

//better approach for sorting array
// in this we are not passing a new array we are just referring the array and incrementing the start Index 
public class Recursion_and_Arrays_contd {
	
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

	public static void main(String[] args) {
		 int arr[]= {2,4,5,6};
		 System.out.println(checkSortedBetter(arr ,0));

	}

}
