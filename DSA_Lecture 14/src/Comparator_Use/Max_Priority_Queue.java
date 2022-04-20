package Comparator_Use;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

//comparator:_ is an interface
//Comparator decides ki elements kis order me ho ge
 
class MaxPQComparator implements Comparator<Integer>{
	// inside Comparator there is a CompareTo method .This ComapreTo method decide how we are going to compare the two elements
	@Override
	//implementing the Interface
	//this function is comparing the two objects
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1 < o2){
			return 1;
		}else if(o1 > o2){
			return -1;
		}
		return 0;
	}

}

 

public class Max_Priority_Queue {
  

	public static void main(String[] args) {
		MaxPQComparator maxComparator = new MaxPQComparator(); // creating an object
	    PriorityQueue<Integer> pq = new PriorityQueue<>(maxComparator);//we have passed the object to know ki hume kis order me 
		                                                                       //Priority Queue cahiye
		 
	//	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  
	     //Collections.reverseOrder() ; is an inbuilt Comparator function we can use this instead of writing all the above methods
		
		int arr[] = {9,1,0,4,7,3};
		for(int i = 0; i < arr.length; i++){
			pq.add(arr[i]);
		}

		//	System.out.println(pq.element());
		while(! pq.isEmpty()){
			System.out.print(pq.remove() + " ");
		}
	}
}
 

