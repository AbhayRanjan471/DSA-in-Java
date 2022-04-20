package Recursion_and_Array;

//Given an array of length N, you need to find and return the sum of all elements of the array.
//Do this recursively.
public class Sum_of_Array {
	
	public static int sum(int input[]) {
		
		if(input.length <=1) {
			return input[0];
		}
		 int smallInput []=new int[input.length -1];
	        for(int i=1;i<input.length ;i++){
	            smallInput[i-1] =input[i];
	            
	        }
	        int sumAns=sum(smallInput) +input[0];
	        return sumAns;
		}
	

	public static void main(String[] args) {
		 int arr[]= {3,4,1,5};
		 System.out.println(sum(arr));

	}

}
