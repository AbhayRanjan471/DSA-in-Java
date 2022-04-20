package Length_of_LL;
//For a given singly linked list of integers, find and return its length. Do it using an iterative method.
//Remember/Consider :
//While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, 
//would never be a list element.
//	Sample Input 1 :
//	
//	3 4 5 2 6 1 9 -1
//	Sample Output 1 :
//	7

public class LinkedListNode <T> {

	T data;
	LinkedListNode <T> next;
	
	LinkedListNode(T data){
		this.data = data;
		next = null;
	}
}
