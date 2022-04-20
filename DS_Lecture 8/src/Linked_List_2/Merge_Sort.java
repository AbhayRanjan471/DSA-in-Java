//Given a singly linked list of integers, sort it using 'Merge Sort.'
	//Sample Input 1 :
	//
	//10 9 8 7 6 5 4 3 -1
	//Sample Output 1 :
	// 3 4 5 6 7 8 9 10 

package Linked_List_2;

import java.util.Scanner;

public class Merge_Sort {

	public static  Node<Integer> mergeTwoSortedLinkedLists( Node<Integer> head1,  Node<Integer> head2) {

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
		if(T1 != null ){
			newTail.next = T1;
		}
		if(T2 != null ){
			newTail.next = T2;
		}
		return newHead;
	}

	public static  Node<Integer> midPoint( Node<Integer> head) {
		//Your code goes here
		// if(head == null){
		//     return head;
		// }
		Node<Integer> fast = head;
		Node<Integer> slow = head;

		while( fast.next != null && fast.next.next != null ){
			fast = fast.next.next;
			slow =slow.next;
		}
		return slow;
	}

	public static  Node<Integer> mergeSort( Node<Integer> head) {
		//Your code goes here
		if( head == null || head.next == null){
			return head;
		}
		//divideing the LL in two part 1st from head to mid and 2nd from mid+1 
		Node<Integer> mid = midPoint(head);//callig the midPoint function to get the reference of mid node
		Node<Integer> head2 = mid.next;
		mid.next = null;

		Node<Integer> newHead1 = mergeSort(head );
		Node<Integer> newHead2 = mergeSort(head2);

		Node<Integer> finalHead =mergeTwoSortedLinkedLists(newHead1 , newHead2);

		return finalHead;
	}
	public static void print(Node<Integer>head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}

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
		head = mergeSort(head);
		print(head);

	}

}
