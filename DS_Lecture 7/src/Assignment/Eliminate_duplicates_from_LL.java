package Assignment;

import java.util.Scanner;
//You have been given a singly linked list of integers where the elements are sorted in ascending order.
//Write a function that removes the consecutive duplicate values such that the given list only contains
//unique elements and returns the head to the updated list.
//	Sample Input 1 :
//	
//	1 2 3 3 3 3 4 4 4 5 5 7 -1
//	Sample Output 1 :
//	1 2 3 4 5 7 

public class Eliminate_duplicates_from_LL {
	
	public static void print(Node<Integer>head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
	
	public static  Node<Integer> removeDuplicates( Node<Integer> head) {
		  if(head==null||head.next==null)
	        {
	            return head;
	        }
	         Node<Integer> temp=head;
	        while(temp !=null && temp.next != null)
	        {
	            if((int)temp.data==(int)temp.next.data)
	            {
	                temp.next=temp.next.next;  
	            }
	            else
	            {
	                temp=temp.next;
	                
	            }
	        }
	        return head;
	}

	
	public static Node<Integer> takeInput(){
		Node<Integer>head = null ,tail = null;
		
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node <Integer>(data);
			
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
		
	}

	public static void main(String[] args) {
		 Node<Integer>head = takeInput();

		 head = removeDuplicates(head);
		 print(head);
	}

}
