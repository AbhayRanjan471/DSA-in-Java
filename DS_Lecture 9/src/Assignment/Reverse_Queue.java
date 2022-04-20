package Assignment;
import java.util.Queue;
import java.util.LinkedList;

public class Reverse_Queue {
	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
        if(input.isEmpty()){
            return;
        }
 
        int item = input.poll();
        reverseQueue(input);
        System.out.print(item +" ");
	}
}
