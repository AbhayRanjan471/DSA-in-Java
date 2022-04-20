package Reverse_LinkedList;

import java.util.Scanner;

public class Reverse_Recursively_DoubleNode {
	

	public static void print(Node<Integer>head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}

	}
	
	public static DoubleNode reverseLLBetter(Node<Integer>head) {
		if(head == null || head.next == null) {
			DoubleNode ans = new DoubleNode(); // we made DoubleNode class so that we can return two things 
			                                   // by doing this we are able to return two thing that is head and tail
			ans.head = head;             
			ans.tail = head;
			return ans;
		}
	 //return type
		DoubleNode  smallAns = reverseLLBetter(head.next);//here we are getting the tail and head of the reverse list
		smallAns.tail.next = head; //reverse list k tail me overall jo head tha use humne attach kr diya , storing head to the next to the tail to reverse
		head.next = null; //then make the head.next null to break it from forming a loop
		
		DoubleNode ans = new DoubleNode();// here we making the final ans
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;
		
		
	}
	public static Node<Integer> takeInput(){

		Node<Integer> head = null , tail =null;
		System.out.println("enter the elements");
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
		 Node<Integer>head = takeInput();
		 DoubleNode ans = reverseLLBetter(head);
		 print(ans.head);

	}

}
