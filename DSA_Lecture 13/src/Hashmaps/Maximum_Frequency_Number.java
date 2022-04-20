//You are given an array of integers that contain numbers in random order. Write a program to find 
//and return the number which occurs the maximum times in the given input.
//If two or more elements contend for the maximum frequency, return the element which occurs in the array first.
//		Sample Input 1 :
//			13
//			2 12 2 11 12 2 1 2 2 11 12 2 6 
//			Sample Output 1 :
//			2
//			Sample Input 2 :
//			3
//			1 4 5
//			Sample Output 2 :
//			1	

package Hashmaps;

import java.util.HashMap;
import java.util.Set;

public class Maximum_Frequency_Number {

	 public static int maxFrequencyNumber(int[] arr){ 
		 int value = 0;
		 HashMap<Integer, Integer> map = new HashMap<>();
		 for(int i = 0 ; i < arr.length ; i++) {
			 if(map.containsKey(arr[i]) ){//checking if that value present in the map or not if it contain then we will increase its value by 1
				 map.put(arr[i], map.get(arr[i]) + 1);
			 }
			 else {
				 map.put(arr[i], 1);//if the particular value doesn't present we will insert it into the map and assign its value 1
			 }
		 }
		 // in this we are iterating over hole array which is not good , but in question we are told to that
		 //If two or more elements contend for the maximum frequency, return the element which occurs in the array first.
		 // so we are iterating over an array
		 int max = Integer.MIN_VALUE;
	        int maxFreq = 0;
			for(int i : arr) {
				if(map.get(i) > maxFreq) {
					maxFreq = map.get(i);
	                max = i;
	            }
			}
			// best way to iterate but in this the problem is that the order is not maintain
			Set<Integer> keys = map.keySet();
			 int maxx = Integer.MIN_VALUE;
		        int maxFreqq = 0;
			for(int i : keys) {
				if(map.get(i) > maxFreqq) {
					maxFreqq = map.get(i);//storing the value of key
	                maxx = i;//storing the key
	            }
				
			}
			System.out.println(maxx);
			return max;
			 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,12,3,11,12,2,1,3,2,11,12,3,6};
		int max = maxFrequencyNumber(arr);
		System.out.println(max);

	}

}
