package Recursion_and_Array;

//for better approach check program " Recursion_and_Arrays_contd"

public class Check_Sorted_Array {
	public static boolean checkSorted(int arr[]) {
		 if(arr.length <= 1) {
			 return true;
		 }
		 if(arr[0]> arr[1]) {  // in this we re checking the stating integer at first the then proceding
			 return false;
		 }
		 int smallInput[]=new int[arr.length-1]; // here we are making a new array and storing n-1 value and then passig this value
		 for(int i=1 ; i < arr.length ;i++) {
			 smallInput[i-1] = arr[i];
			 
		 }
		 boolean smallAns=checkSorted(smallInput);
		 
		 return smallAns;
	}

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6};
		System.out.println(checkSorted(arr));



	}
   // alternate Approach
	
//public class Check_Sorted_Array {
//	public static boolean checkSorted(int arr[]) {
//		 if(arr.length <= 1) {
//			 return true;
//		 }
//		 int smallInput[]=new int[arr.length-1];
//		 for(int i=1 ; i < arr.length ;i++) {
//			 smallInput[i-1] = arr[i];
//			 
//		 }
//		 boolean smallAns=checkSorted(smallInput);
//		 
//		 if(! smallAns) {
//			 return false;
//		 }
//		 if(arr[0] <= arr[1]) {
//			 return true;
//		 }
//		 else {
//			 return false;
//		 }
//	}
//
//	public static void main(String[] args) {
//		int arr[]= {2,3,4,5,6};
//		System.out.println(checkSorted(arr));
//
//
//
//	}

}
