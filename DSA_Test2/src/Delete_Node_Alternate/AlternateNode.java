package Delete_Node_Alternate;

import java.util.Scanner;
//Delete Alternate Nodes
//Send Feedback
//Given a Singly Linked List of integers, delete all the alternate nodes in the list.
//Example:
//List: 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
//Alternate nodes will be:  20, 40, and 60.
//
//Hence after deleting, the list will be:
//Output: 10 -> 30 -> 50 -> null

public class AlternateNode {
	
	public static void print(Node<Integer>head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
		 
	}
	
	public static Node<Integer> AlternateNode(Node<Integer>head){
		  Node<Integer> cur = head;
	        Node<Integer> curNext;
	        while(cur != null && cur.next != null){
	            curNext = cur.next;
	            cur.next = curNext.next;
	            
	            cur= cur.next;
	        }
	        return head;
	}
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null , tail = null;
		System.out.println("enter the data");
		Scanner s = new Scanner(System.in);
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
		Node<Integer> head = takeInput();
		head = AlternateNode(head);
		print(head);
    
	}

}
