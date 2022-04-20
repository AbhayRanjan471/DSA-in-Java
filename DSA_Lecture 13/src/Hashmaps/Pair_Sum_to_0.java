//Given a random integer array A of size N. Find and print the count of pair of elements in the array which sum up to 0.
//Note: Array A can contain duplicate elements as well.
//	Sample Input 1:
//	5
//	2 1 -2 2 3
//	Sample Output 1:
//	2

package Hashmaps;

import java.util.HashMap;
import java.util.Set;

public class Pair_Sum_to_0 {

	public static int PairSum(int[] input, int size) {
		int count = 0;

		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : input) {
			if(map.containsKey(-i)) { // checking does it contain the -ve of i
				count += map.get(-i); // adding its value in count

			}
			if(map.containsKey(i)) {
				map.put(i, map.put(i, map.get(i)+1));
			}
			else {
				map.put(i, 1);
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int input [] = {2,1,-2,2,3};
		int count= PairSum(input, 0);
		System.out.println(count);
	}

}
