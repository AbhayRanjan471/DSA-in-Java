package Linked_List;

public class LinkedList_Use_Function {
	
	public static void  print(Node<Integer> head) // here we are passing the reference of 1st node ie, node1
	{
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next; // this will give the reference of next node to head(it is same as i++)
		}
	}

	public static void main(String[] args) {
		 
		Node<Integer> node1 = new Node<Integer>(10);
		Node<Integer> node2 = new Node<Integer>(20);
		Node<Integer> node3 = new Node<Integer>(30);
		
		node1.next = node2;
		node2.next = node3;
		
		Node<Integer> head = node1; // head is just a reference which is referring to node1

		print(head);
	}

}
