package Assignment_Time_nd_Space_Comp;
//You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
//Now, in the given array/list, 'M' numbers are present twice and one number is present only once.

	//Sample Input 1:
	
	//7
	//2 3 1 6 3 6 2
	//Sample Output 1:
	//1
public class Find_the_Unique_Element {
	public static int findUnique(int[] arr) {
		 int unique =0 ;
		 
		 for(int i=0 ; i< arr.length ;i++) {
			 unique^= arr[i]; // // way to find unique (use of XOR :-1^1 =0 ;2^2 =0)
		 }
		return unique;
	}


	public static void main(String[] args) {
		 int arr[]= {2,1,3,6,3,6,2,};
		int num = findUnique(arr);
		System.out.println(num);
	}
}
