package Queue_Using_Array;

public class QueueUse {

	public static void main(String[] args) throws QueueFullException, QueueEmptyException {
		 
		QueueUsingArray queue = new QueueUsingArray(3);

		//TO insert
		for(int i =1 ; i <= 5 ; i++) {
			try {
				queue.enqueue(i);
			} catch (QueueFullException e) {
				 
			}
		}
		// TO remove
		while(! queue.isEmpty()) {
			try {
				System.out.println( queue.dequeue());
			} catch (QueueEmptyException e) {
				 
			}
		}
		
		//practice
//		System.out.println("next");
//		QueueUsingArray queue1 = new QueueUsingArray(3);
//		queue1.enqueue(5);
//		queue1.enqueue(10);
//		queue1.enqueue(20);
//		System.out.print(queue1.dequeue() +" ");
//		queue1.enqueue(15);
//		System.out.print(queue1.dequeue() +" ");
//		queue1.enqueue(100);
//		System.out.print(queue1.dequeue() +" ");
//		queue1.enqueue(60);
//		System.out.println();
//		queue1.enqueue(200);
//		while(! queue1.isEmpty()) {
//			System.out.print(queue1.dequeue()+" ");
//		}
		
		 
	}

}
