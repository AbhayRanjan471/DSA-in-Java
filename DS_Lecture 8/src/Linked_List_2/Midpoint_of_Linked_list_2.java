package Linked_List_2;

import java.util.Scanner;

public class Midpoint_of_Linked_list_2 {

	public static void print(Node<Integer>head) {
		 
		System.out.println("node present at the middle of the list is ");
			System.out.print(head.data +" ");
			 
	}
	
	  public static  Node<Integer> midPoint( Node<Integer> head) {
	        //Your code goes here
		    Node<Integer> temp= head;
	        int length =0 ;
	        while( temp != null){ // taking out the length of the linked list
	            length++;
	            temp = temp.next;
	        }
	        int mid =0;
	        if( length % 2 != 0){ // for odd 
	         mid = length/2 +1;
	        }
	        else{ // for even
	            mid = length/2;
	        }
	        temp = head;
	        int k=0;
	        while( k < mid -1){
	            temp = temp.next;
	            k++;
	        }
	         Node<Integer> temp1 = temp;
	        return temp1;
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
