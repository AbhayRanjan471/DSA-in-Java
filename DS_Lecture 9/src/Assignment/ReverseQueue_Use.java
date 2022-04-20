package Assignment;
//import java.util.Queue;
//import java.util.LinkedList;
import java.util.*; // we can use this instead of importing all the above classes

public class ReverseQueue_Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new LinkedList<>(); //its work in same way we have check in ReverseStack_use 
		                                          // instead of inbuilt stack class function it uses inbuilt LinkedList class function
		for(int i =0 ; i < 5 ; i++) {
			queue.add(i);
		}
		Reverse_Queue.reverseQueue(queue);
		//while(queue.isEmpty())
	}

}
