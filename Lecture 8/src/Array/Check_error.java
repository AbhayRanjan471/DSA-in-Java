package Array;

public class Check_error {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		System.out.println(arr[0]); //####Whenever an integer array is created, all elements are initialised to 0

		char chArray[] = new char[15];
	//	System.out.println(chArray[15]); //### For an array of size n, indexes of the array range from 0 to (n - 1).
		                                //So here for array of size 15, valid indices are from 0 to 14. This chArray[15] is 
		                                //trying to access an invalid index which gives ArrayIndexOutOfBoundsException.
		
		boolean arrab[] = new boolean[5];
		System.out.println(arrab[0]);    //####Whenever an boolean array is created, all elements are initialised to false
	}

}
