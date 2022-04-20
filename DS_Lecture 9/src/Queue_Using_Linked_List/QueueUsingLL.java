package Queue_Using_Linked_List;

public class QueueUsingLL <T> {

	 private Node<T> front;
	 private Node<T> rear;
	 int size;
	 
	 public QueueUsingLL() {
		 front = null;
		 rear = null;
		 size = 0;
	 }
	public int size() {
		 return size;
	 }
	 
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public T front() throws QueueEmptyException {
		if(size == 0) {
			// QueueEmptyException
			throw new QueueEmptyException();
		}
		return front.data;
		
	}
	
	public void enqueue (T element) {
		Node<T> newNode = new Node<T>(element);
		if(rear == null) {
			front = newNode;
			rear = newNode;
		}
		else {
		rear.next = newNode;
		rear = newNode;
		}
		size++;
	}
	
	public T dequeue() throws QueueEmptyException {
		if(size == 0) {
			//QueueEmptyException
			throw new QueueEmptyException();
		}
		
		T temp = front.data;
		front = front.next;
		
		if(size == 1) {//reset
			rear = null;
		}
		size--;
		return temp;
	}
}
