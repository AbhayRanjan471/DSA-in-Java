//You have been given two sorted(in ascending order) singly linked lists of integers.
//Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) 
//and return the new head to the list.
//Sample Input 1 :
//
//2 5 8 12 -1
//3 6 9 -1
//Sample Output 1 :
//2 3 5 6 8 9 12 

package Linked_List_2;

import java.util.Scanner;

public class Merge_Two_Sorted_LL {
	
	public static void print(Node<Integer>head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}

	}

	public static Node<Integer> mergeTwoSortedLinkedLists( Node<Integer> head1,  Node<Integer> head2) {

		Node<Integer> T1 = head1;
		Node<Integer> T2 = head2;

		Node<Integer> newTail = null;
		Node<Integer> newHead = null;
		if(T1 == null)
			return T2;
		if(T2 == null)
			return T1;
		while(T1 != null && T2 != null ){
			if(T1.data < T2.data){
				if(newHead == null){
					newHead = T1;
					newTail = T1; 
				}
				else{
					newTail.next = T1;
					newTail = T1;
				}
				T1 = T1.next;
			}
			else{
				if(newHead == null){
					newHead = T2;
					newTail = T2;
				}
				else{
					newTail.next = T2;
					newTail = T2;
				}
				T2 = T2.next;
			}
		}
		//this condition is for when two given LL are of uneven size 
		//jis linked ka size sabse bada ho ga uske jitne v bacche how nodes hai sort krne k bad  use newTAil ke next me add kr de ge
		if(T1 != null ){
			newTail.next = T1;
		}
		if(T2 != null ){
			newTail.next = T2;
		}
		return newHead;
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
		// TODO Auto-generated method stu
		System.out.println("Enter the 1st Linked List");
		Node<Integer> head1 = takeInput();
		System.out.println("Enter the 2nd Linked list");
		Node<Integer> head2 = takeInput();
		Node<Integer> head = mergeTwoSortedLinkedLists(head1, head2);
		print(head);


	}

}
