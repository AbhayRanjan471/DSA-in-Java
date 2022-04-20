
public class Dequeue {

	private int data[];
	private int front;
	private int size;
	private int rear;
	private int length;

	Dequeue(){
		data = new int[10];
		front = -1;
		length = data.length;
		size = 0;
		rear = -1;
	}

	//		boolean full() {
	////			if((front == 0 && rear == size-1) || (front == rear + 1)) {
	////			    	
	////			        return true;
	////			}
	////			    else {
	////			        return false;
	////		}
	//			return ((front == 0 && rear == size-1) || (front == rear + 1));
	//	}
	void insertFront(int elem) {
		if(size == data.length) {
			System.out.println("-1");
			return;
		}
		else {
			//if queue is empty
			if(front == -1) {
				front = 0;
				rear = 0;
			}
			//if front points to the first position element
			else if(front == 0) {
				front = length -1 ;
			}
			else {
				--front;
			}
		}
		data[front] = elem;
		size++;
	}
	void insertRear(int elem){
		if(size == data.length) {
			System.out.println("-1");
			return;
		}
		else {
			//if queue is empty
			if(front == -1) {
				front = 0;
				rear = 0;
			}
			//If rear points to the last element
			else if(rear == length -1) {
				rear = 0;
			}
			else {
				++rear;
			}
		}

		data[rear] = elem;
		size++;
	}
	void deleteFront() {
		if(empty())
		{
			System.out.println("-1");
		}
		else
		{
			//If only one element is present
			if(front == rear) {
				front = rear = -1;
			}

			//If rear points to the first position element 
			else if( front == length -1) {
				front = 0;
			}

			else {
				++rear;		
			}
		}
		size--;
	}
	void deleteRear() {
		if(empty())
		{
			System.out.println("-1");
		}
		else
		{
			//If only one element is present
			if(front == rear)
				front = rear = -1;

			//If rear points to the first position element 
			else if(rear == 0)
				rear = length-1;

			else
				--rear;		
		}
		size--;
	}
	int getRear() {
		if(empty())
		{

			return -1;
		}
		else
		{
			return data[rear];
		}
	}
	int getfront() {
		if(empty())
		{	 
			return -1;
		}
		else
		{
			return data[front];
		}
	}
	boolean empty() {
		return (size == 0);
	}

}
