package Reverse_LinkedList;

import java.util.Scanner;

 

public class Reverse_Iterative {
	
	public static void print(Node<Integer>head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
	
	public static Node<Integer> Reverse(Node<Integer> head){
		Node<Integer> current = head;
		Node<Integer> previous = null;
		Node<Integer> temp ;
		
		while(current != null) {
			temp = current.next ;// 1st step :- current k next me jo hai uska reference hum temp pe store kre ge 
			current.next = previous;
			
			previous = current;
			current = temp;
		}
		return previous;// previous k pas last node ka reference ho ag so we are passing it
	}
	 public static Node<Integer> takeInput(){
			Node<Integer> head = null ,tail = null;
			
			Scanner s = new Scanner (System.in);
			System.out.println("eneter the data");
			 int data = s.nextInt();
			
			 while(data != -1) {
				 Node<Integer> newNode =new Node<Integer>(data);
				 if(head == null) {
					 head = newNode;
					 tail = newNode;
				 }
				 else {
					 tail.next = newNode;
					 tail = newNode; // or tail = tail.next
				 }
				 data = s.nextInt();
			 }
			 return head;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head = takeInput();
		head = Reverse(head);
		print(head);
	}

}
