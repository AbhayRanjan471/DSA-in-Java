//Given k different arrays, which are sorted individually (in ascending order). You need to merge all the given 
//arrays such that output array should be sorted (in ascending order).
//Hint : Use Heaps.
	//Sample Input 1:
	//4
	//3
	//1 5 9
	//2
	//45 90
	//5
	//2 6 78 100 234
	//1
	//0
	//Sample Output 1:
	//0 1 2 5 6 9 45 78 90 100 234

package Assignment;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class PairComparator implements Comparator<Pair>{

	@Override
	public int compare(Pair o1, Pair o2) {
		if(o1.value <= o2.value) { 
			return 1;
		}
		else  {
			return -1;
		}
	}

}
class Pair{
	int value ; // store the value of the array
	int arrayNumber; // Visualize it as jaggedArray we are storing the Kth array

	public Pair (int v , int n) {
		value = v;
		arrayNumber = n;
	}
}
public class Merge_K_sorted_arrays {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
		//Your code start from here
		if(input.size() == 0) {
			return null;
		}
		PairComparator compare = new PairComparator();
		PriorityQueue<Pair> maxHeap = new PriorityQueue<>(input.size() ,compare);
		for(int i =0 ; i< input.size(); i++) {
			int index = input.get(i).size() - 1;
			//creating an object of Pair class and passing the value and the arrayNumber
			Pair current = new Pair(input.get(i).get(index) , i);
			maxHeap.add(current);
			input.get(i).remove(index); // removing that value which we have added in the Priority Queue from the array
 
		}
		//creating the ArrayList in which we will add the final value
		ArrayList<Integer> output = new ArrayList<>();
		while(! maxHeap.isEmpty()) {
			Pair max = maxHeap.remove(); // removing the maximum element from the priority Queue(ie, from maxHeap) 
			//and storing in max(we are doing in this way bcz maxHeap contains two input(value , arrayNumber) we have 
			//made in Pair class
			output.add(max.value); //inserting the value in the ArrayList
			int i = max.arrayNumber;// storing the arrayNumber from which value has been removed bcz next element will be
			// inserted from that array only
			if(input.get(i).size() > 0) {
				int index = input.get(i).size() -1;
				int value = input.get(i).get(index);
				input.get(i).remove(index); // removing the element from the array
				//cerating an object of Pair Class and passing the (Value , ArrayNumber)
				Pair current = new Pair(value, i);
				maxHeap.add(current);

			}
		}
		Collections.reverse(output);
		return output;


	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total no. of Arrrays in the ArrayList to be input");
		int x=s.nextInt();

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();// creating an Array of ArrayList

		for(int i=0;i<x;i++){

			System.out.println("Enter the size of the "+ (i+1)+" th Array" );
			int n=s.nextInt();
			ArrayList<Integer> temp=new ArrayList<>();
			System.out.println("Enter the elements in the "+(i+1)+" th Array");
			for(int j=0;j<n;j++){
				temp.add(s.nextInt()); // adding the elements in the ArrayList
			}
			list.add(temp); // connecting the ArrayList
		}

		ArrayList<Integer> output =   mergeKSortedArrays(list);
		for(int i : output) {
			System.out.print(i+" ");
		}
	}

}
