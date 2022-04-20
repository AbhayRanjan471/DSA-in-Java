package Assignment_Time_nd_Space_Comp;

public class Dublicate_in_Array {
//	You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). 
	//Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging 
	//from 0 to 3, and among these, there is a single integer value that is present twice. You need to 
	//find and return that duplicate number present in the array.
	
//	Sample Input 1:
//		
//		9
//		0 7 2 5 4 7 1 3 6
//		Sample Output 1:
//		7
	
	public static int findDuplicate(int[] arr) {
		int N = arr.length;
		int sum =0;
		//int value=0;
		for(int i=0 ; i< arr.length ;i++) {
			sum += arr[i];
		}
		int value =  (N-2) * (N-1) /2;  // taking out sum of first (n-2) natural number
		return sum - value;
		
	}
	public static void main(String[] args) {
		 
		
				int arr[] = { 0,7,2,5,4,7,1,3,6};
				 System.out.println(findDuplicate(arr));
	}
}
	
//	public static int findDuplicate(int[] arr ,int s ,int i) {
//		for( int j=i+1 ; j< arr.length ; j++) {
//			if(arr[j] == s) {
//				return s;
//			}
//		}
//	return 0;
//		
//	}
//	public static int findDuplicate(int[] arr) {
//
//		 int temp =0;
//		  for(int i=0 ; i< arr.length ; i++) {
//			  int c=arr[i];
//			  int ans= findDuplicate(arr , c ,i);
//			  if(ans != 0) {
//				  return ans;
//				   
//			  }
//		  }
//		   
//		   return temp;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int arr[] = { 2,1,3,4,1,6,7};
//		 System.out.println(findDuplicate(arr));
//	}
//}



