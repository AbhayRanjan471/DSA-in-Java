package Assignment;

//Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search.
//Return the index of x.
//Return -1 if x is not present in the given array.
//Note : If given array size is even, take first mid.
//Input format :
//
//Line 1 : Array size
//
//Line 2 : Array elements (separated by space)
//
//Line 3 : x (element to be searched)

//Sample Input :
//6
//2 3 4 5 6 8 
//5 
//Sample Output:
//3 

public class Binary_search_Recursive {
	
	public static int binarySearch(int input[], int element, int startIndex ,int endIndex) {
		
		if(startIndex > endIndex) {
			return -1;
		}
		int mid =(startIndex + endIndex)/2;
		
		if(element == input[mid]) {
			return mid;
		}
		else if(element > input[mid]) {
			startIndex = mid + 1;
		}
		else {
			endIndex = mid -1;
		}
		int smallans = binarySearch(input , element ,startIndex ,endIndex);
		return smallans;
	}

	public static void binarySearch(int input[], int element) {
		int startIndex= 0;
		int endIndex = input.length -1;
		System.out.print(binarySearch(input ,element , startIndex ,endIndex));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {2,3,4,5,6,8};
		int element = 5;

		 binarySearch(input , element);
	}

}
