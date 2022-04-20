package Linkedlist_in_Collections;

import java.util.LinkedList; // there is lot of function inbuild in the Liked list which we can use

public class CollectionLinkedList {
//Collection already has a class called LinkedList where there is already many in_build function
	
	public static void main(String[] args) {
		 // this implementation of linked list is for doubly LinkedList
		LinkedList<Integer> list = new LinkedList<>(); // we have created a object of  linkedList 
		
		System.out.println(list.size());// this will give the size of the linked List
        
		// to add elements in linked List
		list.add(10); // This will create Node by itself and  will add 10 in the doubly linked list
		list.add(30);
		list.addFirst(40); // this will 40 in the first
		list.addLast(100);// this will add 100 in the last
		
		//To set element at particular index
		list.set(2, 90); // this will set 90 at index 2
		
		System.out.println(list.size());
		
		//To iterate in the List
		for(int i =0 ; i< list.size(); i++) {
			System.out.println(list.get(i)); // this will give the elements at i th position
		}
		
	}

}
