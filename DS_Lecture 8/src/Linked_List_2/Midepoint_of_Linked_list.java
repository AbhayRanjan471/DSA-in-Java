package Linked_List_2;

import java.util.Scanner;
//For a given singly linked list of integers, find and return the node present at the middle of the list.
//Sample Input 1 :
//1
//1 2 3 4 5 -1
//Sample Output 1 :
//3

//best approach
public class Midepoint_of_Linked_list {
	
	public static void print(Node<Integer>head) {
 
		System.out.println("node present at the middle of the list is ");
			System.out.print(head.data +" ");
			 
	}
	
	  public static  Node<Integer> midPoint( Node<Integer> head) {
	        //Your code goes here
	        if(head == null){
	            return head;
	        }
	        Node<Integer> fast = head;  // this will move 2x distance  
	         Node<Integer> slow = head; // this will move x distance , that is when fast will reach at the end of linked list slow will 
	                                    // be at the middle
	        
	        while( fast.next != null && fast.next.next != null ){
	            fast = fast.next.next;
	            slow =slow.next;
	            
	              }
	      
	        return slow;
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
		  Node<Integer> head = takeInput();
		  head = midPoint(head);
		  print(head);

	}

}
