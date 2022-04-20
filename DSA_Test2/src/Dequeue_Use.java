
public class Dequeue_Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dequeue queue = new Dequeue();
//		System.out.println(queue.getfront());
//		queue.insertFront(49);
//		queue.insertFront(64);
//		queue.insertFront(99);
//		System.out.println(queue.getfront());
//		System.out.println(queue.getRear());
		System.out.println(queue.getfront());
		queue.insertFront(49);
		queue.insertFront(64);
		queue.insertRear(99);
		//queue.insertRear(40);
	//	queue.insertRear(50);
		//queue.insertRear(60);
		System.out.println(queue.getfront());
		System.out.println(queue.getRear());
		
	}

}
