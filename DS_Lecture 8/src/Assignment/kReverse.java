package Assignment;
//Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its modified list.
//		 'k' is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.
//		Example :
//		Given this linked list: 1 -> 2 -> 3 -> 4 -> 5
//
//		For k = 2, you should return: 2 -> 1 -> 4 -> 3 -> 5
//
//		For k = 3, you should return: 3 -> 2 -> 1 -> 5 -> 4
//				Sample Input 1 :
//					1
//					1 2 3 4 5 6 7 8 9 10 -1
//					4
//					Sample Output 1 :
//					4 3 2 1 8 7 6 5 10 9		

import java.util.Scanner;

public class kReverse {
	
	public static void print(Node<Integer> head){
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
		 public static  Node<Integer> kReverse( Node<Integer> head, int k) {
	        if (k == 0 || k == 1) {
	            return head;
	        }
	         Node<Integer> current = head;
	         Node<Integer> fwd = null;
	         Node<Integer> prev = null;
	        int count = 0;
	        /* Reverse first k nodes of linked list */
	        while (count < k && current != null) {
	            fwd = current.next;
	            current.next = prev;
	            prev = current;
	            current = fwd;
	            count++;
	        }
	        if (fwd != null) {
	            head.next = kReverse(fwd, k);
	        }
	        return prev;
	    }
	 public static Node<Integer> takeInput(Scanner s){
			Node<Integer> head = null , tail = null;
			System.out.println("eneter the data");
			int data = s.nextInt();
			while(data != -1) {
				Node<Integer> newNode = new Node<Integer>(data);
				if(head == null) {
					head = newNode;
					tail = newNode;
					
				}
				else {
					tail.next = newNode;
					tail = tail.next; // or tail = newNode;
				}
				data = s.nextInt();
				
			}
			return head;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("enter the position from where u want to reverse");
		int k = s.nextInt();
		
		Node<Integer> head = takeInput(s);
		head = kReverse(head , k);
		print(head);
	}

}
