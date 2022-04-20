package Assignment;

import java.util.Scanner;
//You have been given a singly linked list of integers along with an integer 'N'. Write a function 
//to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.
//	Sample Input 1 :
//	2
//	1 2 3 4 5 -1
//	3
//	10 20 30 40 50 60 -1
//	5
//	Sample Output 1 :
//	3 4 5 1 2
//	20 30 40 50 60 10

// taking the sample input 1 2 3 4 5 -1 and n=3
public class Append_Last_N_toFirst {
	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
	
	public static  Node<Integer> appendLastNToFirst( Node<Integer> head, int n) {
		 if(head == null || n == 0){
	            return head;
	        }
	          Node<Integer> temp = head;
	        //taking out the length of the linked List
	        int length =0;
	        while( temp != null){
	            length++;
	            temp = temp.next;
	        }
	        int i=0;
	        temp = head;// giving temp the reference of head
	         Node<Integer> newHead = null; // 
	         Node<Integer> joint= null; 
	        while( i < length -n){
	            joint = temp; // here we are storing the reference of the number which is present at  point (length -n) ie, 2
	            temp = temp.next; // here we have stored the reference of 3
	            i++;
	        }
	         newHead = temp; // here we have assigned 3 as newHead
	         joint.next = null; // here we have break the connection between 2 and 3 
	        
	        while(temp.next != null){
	            temp = temp.next;
	        }
	         temp.next = head;// here we have passed the reference of head ie 1 to the no 5 and connected 3->4->5->1->2->null
	        
	         return newHead;
		}
	public static Node<Integer> takeInput(Scanner s){
		Node<Integer> head = null;
		Node<Integer>tail = null;
		
		System.out.println("enter the elements of linked list");
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
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no. from where u want to append");
        int n = s.nextInt();
        
		Node<Integer> head = takeInput(s);
		head = appendLastNToFirst(head ,n);
		print(head);
	}

}
