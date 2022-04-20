package Delete_Node_Alternate;

import java.util.Scanner;



public class Next_Number {
	
	public static void print(Node<Integer>head) {
//		System.out.println(2/10);
//		System.out.println(2 % 10);
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
	public static Node<Integer> reverseLL(Node<Integer> head){
		if(head == null || head.next == null ) {
			return head;
		}
		
		Node<Integer> reverseTail = head.next;
		Node<Integer> smallHead = reverseLL(head.next);
		reverseTail.next = head;
		head.next = null;
		
		return smallHead;
	}
	public static Node<Integer> NextNode(Node<Integer> head){
		head = reverseLL(head); // first the node will be reversed
		
		Node<Integer> tail = head;
		Node<Integer> prev = null;
		tail.data = tail.data ;
		int rem = 1;
		while(tail != null) {
			int temp = tail.data + rem;
			tail.data = temp % 10;
			rem = temp / 10;
 
			prev = tail;
			tail = tail.next;
		}
		if(prev.data == 0) {
			Node<Integer>newNode = new Node<Integer>(1);
			prev.next = newNode;
			 
		}
		 head = reverseLL(head); // again the node will be reversed and we will will get the final node
		return head;
	}
	public static Node<Integer> takeInput(){
		Node<Integer> head = null , tail = null;
		Scanner s = new Scanner (System.in);
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer>head = takeInput();
		head = NextNode(head);
		print(head);
	}

}
