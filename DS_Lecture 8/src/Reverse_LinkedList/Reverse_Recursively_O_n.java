package Reverse_LinkedList;

import java.util.Scanner;

//best approach its Time Complexity O(n)
public class Reverse_Recursively_O_n {
	
	public static void print(Node<Integer>head) {
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
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null , tail= null;
		
		System.out.println("eneter the elements");
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
				tail = tail.next; // or tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head = takeInput();
		head = reverseLL(head);
		print(head);
	}

}
