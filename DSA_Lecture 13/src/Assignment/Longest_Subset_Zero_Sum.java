//Given an array consisting of positive and negative integers, find the length of the longest subarray whose sum is zero.
//	Sample Input 1:
//	10 
//	 95 -97 -387 -435 -5 -70 897 127 23 284
//	Sample Output 1:
//	5

package Assignment;
import java.util.HashMap;
import java.util.Scanner;

public class Longest_Subset_Zero_Sum {
	
	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
        int maxLength = Integer.MIN_VALUE;
      //  int len =  0;
        int sum =0; 
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0 , -1); // zero is also consider when we get sum =0 in the any place then we have to take the length form
                        // from strating
        for(int i =0 ; i < arr.length ; i++){
            sum += arr[i];
           // map.put(sum , i);
            if(map.containsKey(sum)){
                int len = i - map.get(sum) ;
                if(len > maxLength){
                    maxLength = len;
                }
            }
            else{
                map.put(sum , i);
            }
        }
        
        return maxLength;
	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the size of the array");
		 int size = s.nextInt();
		 int arr[] = new int[size];
		 System.out.println("Enter the elements in the Array");
		 for(int i =0 ; i < size ;i++) {
			 arr[i] = s.nextInt();
		 }
		 
		 int num = lengthOfLongestSubsetWithZeroSum(arr);
		 System.out.println("Longest subset zero sum is\n" + num);

	}

}
