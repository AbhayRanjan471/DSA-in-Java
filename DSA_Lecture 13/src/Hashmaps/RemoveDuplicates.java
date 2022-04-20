package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

// given an array return an ArrayList which does't contain the the duplicate values
public class RemoveDuplicates {

	public static ArrayList<Integer> removeDuplicate(int arr[]){
		//creating an ArrayList to insert the nonDuplicate elements
		ArrayList<Integer> output = new ArrayList<>();
		//creating a HashMap
		       //Key    //value
		HashMap<Integer, Boolean> seen = new HashMap<>();
		for(int i =0 ; i < arr.length ; i++) {
			if(seen.containsKey(arr[i])) { //using this we can skip the duplicate elements
				continue;
			}
			output.add(arr[i]); // adding the element in the ArrayList
			seen.put(arr[i], true); // Adding the element in the HashMap for checkList
		}
		return output;
		
	}
	public static void main(String[] args) {
		int arr[] = {1,3,2,4,1,2,2,2,10,3,2};
		ArrayList<Integer> output = removeDuplicate(arr);
		// printing the ArrayList
		for(int i = 0 ; i < output.size() ; i++) {
			System.out.println(output.get(i));
		}
		//fast way to print
//		for(int i : output) {
//			System.out.println(i);
//		}



	}

}
