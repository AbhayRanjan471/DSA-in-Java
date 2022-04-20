package Assignment_Time_nd_Space_Comp;

import java.util.Arrays;
public class Triplet_Sum {
	
	public static int tripletSum(int[] arr, int num) {
		Arrays.sort(arr);
		int count =0;
		for(int i =0 ; i< arr.length -2 ; i++) {
			
			int j=i+1;
			int k = arr.length -1;
			
			while( j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				
				if(sum == num) {
					count++;
					 j++;
					 k--;
					 }
				else if(sum > num ) {
					k--;
				}
				else if(sum < num) {
					j++;
				}
			}
		}
		return count;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6,7};
		int num = 12;
		int ans=tripletSum(arr,num);
		System.out.println(ans);
	}

}
