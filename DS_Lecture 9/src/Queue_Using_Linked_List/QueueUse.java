package Queue_Using_Linked_List;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException {
		 QueueUsingLL queue = new QueueUsingLL();
		 for( int i =1 ; i <= 5 ; i++ ) {
			 queue.enqueue(i);
		 }
		 
		 while(! queue.isEmpty()) {
			 try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }

		   // practice
//		 System.out.println("next");
//		 queue.enqueue(10);
//		 queue.enqueue(20);
//		 queue.enqueue(30);
//		 System.out.println(queue.dequeue());
//		 queue.enqueue(100);
//		 while(! queue.isEmpty()) {
//		 System.out.print(queue.dequeue() +" ");
//		 }
	}

}
