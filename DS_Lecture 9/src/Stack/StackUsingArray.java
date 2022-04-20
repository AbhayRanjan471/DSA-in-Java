package Stack;

public class StackUsingArray {
	
	//To store Stack we are using Array
	private int data [];  // we are keeping stack as an array
	private int top; // is the index of topmost element of stack

	public StackUsingArray() { // Constructor
		data = new int[10]; // max elements we can store in stack is 10;
		top =-1; // initially
	}
	public StackUsingArray(int capacity) {
		data = new int [capacity];// now according to user, size of stack will be declared
		top = -1;
	}
	public boolean isEmpty() { // isEmpty() function is not common to all the stack its not a shared property
		                      // every stack has its individual property  , so we cannot keep it as "static"
//		if(top == -1) {
//			return true;
//		}
//		else {
//			return false;
//		}
		 // OR
		return (top == -1);
	}
	
	public int size() { // this tells number of elements in Stack
		return top + 1;
	}
	public int top() throws StackEmptyException{  // this tells which element is present at the top of the Stack
		if(size() == 0) {// when stack is empty
			//StackEmptyException  // now for this we have created a StackEmptyException class to through this exception
		
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	public void push(int elem) throws StackFullException { // to insert element in stack
		// jb stack pura bhar chuka ho ga
		if(size() == data.length) { // here again we will throw an exception
			// StackFullException   // now for this we have created a StackFullException class to through this exception
//			StackFullException e = new StackFullException ();
//			throw e;
			
			// when stack will be full we will call this function
			doubleCapacity();
		}
		
		top++; // top is initially at -1 so we did ++
		data[top] = elem;
	}
	public void doubleCapacity() {
		int temp[] = data ;
		data = new int[2 * temp.length];
		for(int i = 0; i <= top ; i++) {
			data[i] = temp [i];
		}
	}
	public int pop() throws StackEmptyException { // we can keep its return its return type as void also , that means it will just remove the elements and will not return it
		// if stack is empty 
		if(size() == 0) {
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
	}
	 

}
