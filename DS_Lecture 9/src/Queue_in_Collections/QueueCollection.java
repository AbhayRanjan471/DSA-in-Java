package Queue_in_Collections;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
//Queue is an Interface
//we cannot create objects of Interface	, but we can create the references
	public static void main(String[] args) {
		 Queue<Integer> queue = new LinkedList<>();//linked list class implements queue
		                                          // we have made object to Linked List class
		 queue.add(10); // to insert an element in queue
		 queue.add(20); // same as enqueue
		System.out.println(queue.poll()) ; //to remove the element from queue
        System.out.println(queue.size()); // size of the queue
        System.out.println(queue.peek()); // if we don't want to remove the element and just want to check the 1st element
        
	}

}
