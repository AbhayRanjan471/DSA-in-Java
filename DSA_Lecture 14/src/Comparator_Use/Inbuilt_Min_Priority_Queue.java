package Comparator_Use;
import java.util.Comparator;
import java.util.PriorityQueue;
//comparator :- it is an Interface 

class MinPQComparator implements Comparator<Integer>{
	// inside Comparator there is a CompareTo method .This ComapreTo method decide how we are going to compare the two elements

	@Override
	//implementing the Interface
	public int compare(Integer o1, Integer o2) {// taking two objects as an input ie, o1 and o2
		if(o1 < o2) {
			return -1;
		}
		else if(o1 > o2) {
			return 1;
		}
		return 0;
	}

}
public class Inbuilt_Min_Priority_Queue {
 // your code start from here


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MinPQComparator minComparator = new MinPQComparator(); // creting an object
		 PriorityQueue<Integer> pq = new PriorityQueue<>(minComparator); //we have passed the object to know ki hume kis order me 
		                                                                //Priority Queue cahiye
//			PriorityQueue<Integer> pq = new PriorityQueue<>(); // 
		 
		 int arr[] = {9,1,0,4,7,3};
		 for(int i =0 ; i < arr.length ;i++) {
			 pq.add(arr[i]);
		 }
		 while(! pq.isEmpty()) {
			 System.out.print(pq.remove() +" ");
		 }
		 

	}

}
