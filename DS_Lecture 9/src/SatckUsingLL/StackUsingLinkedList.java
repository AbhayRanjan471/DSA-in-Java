package SatckUsingLL;

public class StackUsingLinkedList <T> {

	private Node<T> head; // we will keep the head of the Linked List
	private int size;
	
	public StackUsingLinkedList() {
		head = null;
		size = 0;
	}
	public int size() {
 
		return size;
	}
	public T top() throws StackEmptyException {
		 if(size() == 0) {
			 // StackEmptyException
			 StackEmptyException e = new StackEmptyException();
			 throw e;
		 }
		return head.data;
	}
	public boolean isEmpty() { // to check the stack is empty of not
		return(head == null);
		     //OR
		//return size()==0;
	}
	
	//TO Push
	public void push(T elements) {
		Node<T> newNode = new Node<T>(elements);// we are creating a Node and then putting the value
	    newNode.next = head;   // |3|@150|-->|2|@100|-->|1|null|
	     head = newNode;
	     size++;
	}
	public T pop() throws StackEmptyException {
		if(size() == 0) {
			throw new StackEmptyException();
		}
		T tempdata = head.data; // first we we store the the value and then we will delete it so that we can return the deleted data
		head = head.next;
		size--;
		return tempdata;
	}
}
