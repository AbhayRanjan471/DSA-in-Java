package Linked_List_Recursively;

import java.util.Scanner;
//Given a singly linked list of integers and position 'i', delete the node present at the 'i-th' position in the linked list recursively.
//	Sample Input 1 :
//	
//	3 4 5 2 6 1 9 -1
//	3
//	Sample Output 1 :
//	3 4 5 6 1 9

public class Delete_Recursively {

	public static void print(Node<Integer>head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
	
	public static  Node<Integer> deleteNodeRec( Node<Integer> head, int pos) {
    	//Your code goes herehead
        if(pos == 0){
            return head.next;
        }
        if(head.next == null  ){
            return head;
        }
        
     Node<Integer> newHead = deleteNodeRec(head.next , pos-1);
        head.next = newHead;
        return head;
	}
	
	public static Node<Integer> takeInput(Scanner s){
		Node<Integer> head = null , tail = null;
		//Scanner s = new Scanner(System.in);
		System.out.println("eneter the data");
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node <Integer>(data);
			
			if(head == null) {
				head = newNode;
				tail= newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String [] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the position from where u wnat to delet");
		int pos = s.nextInt();
		
		Node<Integer> head = takeInput(s);
		head = deleteNodeRec(head , 3);
		print(head);
	}
}
