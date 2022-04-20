package Linked_List_Recursively;

import java.util.Scanner;

 

public class Insert_Recursively {

	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
	
public static Node<Integer> Insert(Node<Integer> head ,int num ,int pos ){
	 if(pos == 0) {
		 //creating a newNode and inserting the element in that node
		 Node<Integer> newNode = new Node<Integer> (num);
		 newNode.next = head;//recursively call krne k bad jo current head av hai use newNode k next pe attach  kre ge
		 return newNode;
	 }
	 if(head == null) { // this condition will use to terminete the program  when pos value is greater then the length of linked list
		 return head;
	 }
	 
	 Node<Integer> smallHead = Insert(head.next , num , pos -1);
	 head.next = smallHead;
	 
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
		 head = Insert(head , num ,pos ); // after the function call we are collecting our updated head 
		 
		 print(head);

	}
}
