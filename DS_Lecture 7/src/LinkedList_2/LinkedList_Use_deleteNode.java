package LinkedList_2;

import java.util.Scanner;
//You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position,
//	Sample Input 1 :
//	
//	3 4 5 2 6 1 9 -1
//	3
//	Sample Output 1 :
//	3 4 5 6 1 9

public class LinkedList_Use_deleteNode {
	public static void print(Node<Integer>head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
	
	public static Node<Integer> delete(Node<Integer>head , int pos){
		if(head == null) { // when there is no Node in the linked list
			return head;
		}
		if(pos == 0) {
			head = head.next;
			return head;
		}
		int i=0;
		Node<Integer> temp = head;
		 
		while(i < pos -1 && temp != null) {
			temp = temp.next;
			i++;
			}
		 
		temp.next = temp.next.next; // doing this we have got the reference of next of next Node
		return head;
	}
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null , tail = null;
		Scanner s = new Scanner(System.in);
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
		Node<Integer> head = takeInput();
		head = delete(head , 3);
		print(head);
	}
}
