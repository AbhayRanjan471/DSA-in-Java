package Reverse_LinkedList;

import java.util.Scanner;

public class Reverse_LL_On2 {
	public static void print(Node<Integer>head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
	
	public static Node<Integer> reverse (Node<Integer>head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> finalHead = reverse(head.next);
		Node<Integer> temp = finalHead;
		
		while(temp.next != null) {// this iteration is done to get the reference of last no , so that we can link the head in the last
			temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		
		return finalHead;
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
	public static void main(String [] args) {
		Node<Integer> head = takeInput();
		head = reverse(head);
		print(head);
	}

}
