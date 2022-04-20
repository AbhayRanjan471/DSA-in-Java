package Assignment_Time_nd_Space_Comp;
import java.util.Arrays;

public class Dublicate_in_Array_2 {
	
	public static int findDuplicate(int[] arr) {
		int temp=0;
		Arrays.sort(arr); // this method is use to sort the given array; *use its header file
		
		for(int i=0 ; i< arr.length ; i++) {
			if(arr[i] == arr[i+1]) {
				temp = arr[i];
				return temp;
			}
		}
		
//		int sum =0 ; int sumSort=0;
//		for( int i=0 ; i< arr.length ; i++) {
//			sum +=arr[i];
//		}
//		 Arrays.sort(arr);
//		 for(int j =0 ; j< arr.length-1  ; j++) {
//			 sumSort += arr[j];
//		 }
//		 return sum - sumSort;
		  return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {0,2,3,4,1,2};
		System.out.println(findDuplicate(arr));
		
	}

}
