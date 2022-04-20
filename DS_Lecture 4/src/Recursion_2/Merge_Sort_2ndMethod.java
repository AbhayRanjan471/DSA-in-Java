package Recursion_2;

 //best method ,here we r using void function
public class Merge_Sort_2ndMethod {

	public static void mergeSort(int input[] ) {
		if(input.length <= 1) {
			return;
		}
		int mid = input.length /2;
		int part1[] = new int[mid]; // to store the first part of the array
		int part2[] = new int[input.length - mid];  // to store the 2nd part of the array

		for(int i=0 ; i< mid ; i++) {
			part1[i] = input[i]; // storing the 1st half elements in part1
		}
		int k=0;
		for(int i= mid ; i < input.length; i++) {
			part2[k] =input[i];   // storing the 2nd half elements in part2
			k++;
		}

		mergeSort(part1);
		mergeSort(part2);

		merge(part1 ,part2 , input);

	}
	// here we are using merge sort
	public static void merge(int input1[] ,int input2 [] , int output[]) {
		int i=0;
		int j=0;
		int k=0;

		while(i < input1.length && j < input2.length) {

			if(input1[i] < input2[j]) {
				output[k] = input1[i];
				k +=1;
				i +=1;
			}
			else {
				output[k] = input2[j];
				k +=1;
				j +=1;
			}
		}
		while( i < input1.length) {
			output[k] = input1[i];
			k +=1;
			i +=1;

		}
		while( j < input2.length) {
			output[k] = input2[j];
			k += 1;
			j += 1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input [] = {4,6,2,8,1,3};
		mergeSort(input);
		
		for(int i=0 ;i<input.length ;i++) {  // for printing the merge array
			System.out.print(input[i] +" ");
		}
	}

}
 
   // alternate approach
//public class Merge_Sort_2ndMethod {
//	
//	public static void mergeSort(int input[] ,int startIndex , int endIndex ) {
//		if(startIndex >= endIndex) {
//			return;
//		}
//		int mid = (startIndex + endIndex) / 2 ;
//		//PArt 1
//		mergeSort(input , startIndex , mid);
//		//Part 2
//		mergeSort(input , mid +1 , endIndex);
//		
//		merge(input , startIndex ,endIndex);
//		
//	}
//	public static void merge(int input[] ,int sI , int eI) {
//		int mid = (sI + eI)/2;
//		int ans[] = new int [sI + eI]; // we will store the sorted array in this
//		int i=0;
//		int j= mid +1;
//		int k=0;
//		
//		while( i <= mid && j<= eI) {
//			if(input[i] < input[j]) {
//				ans[k] = input[i];
//				k++;
//				i++;
//			}
//			else {
//				ans[k] = input[j];
//				k++;
//				j++;
//			}
//		}
//			while(i <= mid) {
//				ans[k] = input[i];
//				k++;
//				i++;
//			}
//			while(j <= eI) {
//				ans[k] = input[j];
//				k++;
//				j++;
//			}
//			
//			for(int index=0 ; index < ans.length ; index++) {
//				input[sI + index] = ans[index];  // here we are copyinh back the sorted array into given input array
//			}
//		}
//	public static void mergeSort(int input[] ) {
//		int endIndex = input.length -1;
//		mergeSort(input , 0 ,  endIndex);
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int input [] = {4,6,2,8,1,3};
//		mergeSort(input);
//		
//		for(int i=0 ;i<input.length ;i++) {  // for printing the merge array
//			System.out.print(input[i] +" ");
//		}
//	}
//}
