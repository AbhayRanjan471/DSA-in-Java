package Queue_Using_Array;

public class QueueUsingArray {

	private int data[];
	private int front;// index at which front element is stored
	private int rear; //index at which rear element is stored
	private int size;
	
	public QueueUsingArray() { //constructor
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;
	}
	public QueueUsingArray(int capacity) { //constructor
		data = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;
	}
	int size() { // to check the size of Queue
		return size;
	}
	
	boolean isEmpty() { // to check that the queue is empty or not
		return (size == 0);
	}
	
 public int front() throws QueueEmptyException { // to know the front element of the queue
		if(size == 0) {
			// QueueEmptyException  // we have created a QueueEmptyException class to throw this exception
			throw new QueueEmptyException(); // here we are directly creating the object and throwing it ,without storing its reference
		}
		return data[front];
	}
	        // TO ADD
	void enqueue(int element) throws QueueFullException { // to add the element in the queue
		//if the queue is full
		if(size == data.length) {
			//QueueFullException
			//throw new QueueFullException();
			
			doubleCapacity(); // dynamic array
		}
		
		if(size == 0) {
			front = 0; // 1. front will change only when the 1st element is added 
			           // 2.  after initilazation front =0 ; it will remain 0 and the rear will be change
		}
		size++;
	//	rear++; // bcz rear is initially at -1 
		
//		if(rear == data.length) { // when at the end position the again reset the rear
//			rear= 0;
//		}     
//		     OR
		rear = (rear + 1) % data.length;
		
		data[rear] = element;
	}
	  // Dynamic Array
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];
		int index =0;
		
		for(int i = front ; i < temp.length ; i++) {
			data[index] = temp[i];
			index++;
		}
		for(int i = 0 ; i<= front -1 ; i++) {
			data[index] = temp[i];
			index++;
		}
		// updating rear and front
		front = 0;
		rear = temp.length - 1;
	}
	
	   // TO REMOVE
	int dequeue() throws QueueEmptyException {
		
		if(size == 0) {
			// QueueEmptyException  // we have created a QueueEmptyException class to throw this exception
			throw new QueueEmptyException(); // here we are directly creating the object and throwing it ,without storing its reference
		}
		int temp = data[front]; // it's FIFO so, we will remove the element from front

		//		front++;
//		// When front is full we will reset it to 0
//		if(front == data.length) {
//			front =0;
//		}
		      //OR
		front = (front + 1)% data.length;
		
		size--;
		
		if(size == 0) { // when all the element are removed we will reset front and rear
			front = -1;
			rear = -1;
		}
		return temp; 
	}
}
