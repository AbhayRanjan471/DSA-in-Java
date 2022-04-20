package Recursion_2;

// its my way here I m storing the array
public class Merge_Sort_Code {

	

	public static int[] mergeSort(int[] input ,int startIndex ,int endIndex){
		int mid = (startIndex + endIndex)/2; 
//		if(startIndex > endIndex) {
//			return new int[0];
//		}
		
		if(startIndex >= endIndex) { // base case
			 
			int temp[] = new int[1];
			temp[0] =input[startIndex];
			return temp ;
		}
		int ans1 []= mergeSort(input , startIndex ,mid);
		int ans2 []= mergeSort(input ,mid+1 ,endIndex);
		int ans3 [] = merge( ans1 ,ans2);

		 return ans3;  // it will return to line 8 ,  
		


	}
	public static void mergeSort(int[] input){
		int endIndex = input.length;
		input=	mergeSort(input ,0,endIndex -1);
		
		for(int i=0 ;i< input.length ;i++) {  // printing the final array
			System.out.print(input[i] +" ");
		}
		 
	}

	// here we doing merge sort
	public static int[] merge(int ans1[] ,int ans2 []) {
		int i=0;
		int j=0;
		int k=0;
		int arr[] =new int[ans1.length + ans2.length];

		 
		while(i < ans1.length && j < ans2.length) {

			if(ans1[i] < ans2[j]) {
				arr[k] = ans1[i];
				k +=1;
				i +=1;
			}
			else {
				arr[k] = ans2[j];
				k +=1;
				j +=1;
			}
		}
		while( i < ans1.length) {
			arr[k] = ans1[i];
			k +=1;
			i +=1;

		}
		while( j < ans2.length) {
			arr[k] = ans2[j];
			k += 1;
			j += 1;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[]= {8,2,6,4,2,1,9};
		mergeSort(input);
	}

}
