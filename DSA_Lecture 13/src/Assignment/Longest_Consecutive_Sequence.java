//You are given an array of unique integers that contain numbers in random order. You have to find
//the longest possible sequence of consecutive numbers using the numbers from given array.
//You need to return the output array which contains starting and ending element. If the 
//length of the longest possible sequence is one, then the output array must contain only single element.
//	Sample Input 1 :
//	13
//	2 12 9 16 10 5 3 20 25 11 1 8 6 
//	Sample Output 1 :
//	8 12 

package Assignment;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Longest_Consecutive_Sequence {

	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		HashMap<Integer,Boolean> map= new HashMap<>();

		for(int key : arr){//initially inserting all the elements in the hashMap and marking there value as true
			map.put(key,true);
		}
		//this arrayList will store the longest possible sequence of consecutive numbers
		ArrayList<Integer> maxArray = new ArrayList<>();
		int max= Integer.MIN_VALUE;
		
		for(int key : arr){
			ArrayList<Integer> array= new ArrayList<>();
			if(map.get(key)==true){//same value dobara check na ho isliye humne ye condition dala hai
				while(map.containsKey(key)){ //if we don't go over any consecutive num, map will not contain it.
					array.add(key);
					map.put(key,false);//marking the checked key value as false
					key=key+1;
				}

				if(array.size()>max){
					max=array.size();
					maxArray=array; //updating the arrayList
				}
			}	

		}
		//returning the output array which contains starting and ending element.
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(maxArray.get(0));
		ans.add(maxArray.get(max-1));
		return ans;
	}

	public static void main(String[] args) {
		//taking input from the user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements in the Array");
		for(int i =0 ; i < size ; i++) {
			arr[i] = s.nextInt();
		}

		//calling the function
		ArrayList<Integer> array = longestConsecutiveIncreasingSequence(arr);
		for(int i: array) {
			System.out.print(i +" ");
		}
	}

}
