package LinkedList_2;

import java.util.Scanner;
// To Insert an number in the linked list
public class LinkedList_Use_InsertNode {
	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
	
public static Node<Integer> Insert(Node<Integer> head ,int num ,int pos){
	Node<Integer> newNode = new Node<Integer> (num);// here we have created a NOde of name newNOde in which we will store the value of num
	if(pos == 0) {
		newNode.next = head;// if the position is 0 , then we will store the reference of head to next of newNOde and return the reference of newNode
		return newNode;
	}
	int i =0;
	Node<Integer> temp = head;
	while(i < pos-1) {
		temp = temp.next;
		i++;
	}
	newNode.next = temp.next; // first step is to make the link otherwise we will loose the reference of the data and the we will break the previous link
	temp.next = newNode;
	return head;
}


	public static Node<Integer> takeInput(Scanner s){
		Node<Integer> head = null ,tail = null;
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
		Scanner s= new Scanner (System.in);
		System.out.println("enter the no to be Input");
		int num = s.nextInt();
		
		System.out.println("eneter the position");
		int pos = s.nextInt();
		
		 Node<Integer> head = takeInput(s);
		 head = Insert(head , num ,pos); // after the function call we are collecting our updated head 
		 
		 print(head);

	}

}
