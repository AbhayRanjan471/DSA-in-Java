package Assignment;
//You have been given a head to a singly linked list of integers. Write a function check to whether the list given 
//is a 'Palindrome' or not.
//Sample Input 1 :
//1
//9 2 3 3 2 9 -1
//Sample Output 1 :
//true
//Sample Input 2 :
//2
//0 2 3 2 5 -1
//-1
//Sample Output 2 :
//false
//true
//Explanation for the Sample Input 2 :
//For the first query, it is pretty intuitive that the the given list is not a palindrome, hence the output is 'false'.
//
//For the second query, the list is empty. An empty list is always a palindrome , hence the output is 'true'.

import java.util.Scanner;



 public class Palindrome_LinkedList {
	 public static boolean  isPalindrome(Node<Integer>head , Node<Integer>newHead){
			//Node<Integer> newHead = head;
			//Node<Integer> tail = head;
			
			if(head.next == null) {
				if(newHead.data == head.data) {
					newHead = newHead.next;
					return true;
				}
				else {
					return false;
				}
			}
			boolean isPlan = isPalindrome( head.next , newHead);
			
			if(isPlan == true) {
				if(newHead.data == head.data) {
					newHead = newHead.next;
					isPlan= true;
				}
				else {
					isPlan= false;
				}
			}
			 
			return isPlan;
	 }
	 public static boolean  isPalindrome(Node<Integer>head){
		 Node<Integer> newHead = head;
		 return isPalindrome(head , newHead);
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
		// TODO Auto-generated method stub

		Node<Integer> head = takeInput();
		System.out.println( isPalindrome(head));
	}

}
