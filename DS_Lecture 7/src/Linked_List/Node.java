package Linked_List;

public class Node<T> { // we use generic
	
	T data; // to keep the data
	Node <T> next; // to keep the reference of next node
	               // <T> :- this means that agar node ka ak tpye integer hai to wo next use point to point kre ga jiska data type integer ho
	
	Node(T data){  // constructor
		this.data = data;
		next = null; // initially we have keep the next Node null
	}

}
