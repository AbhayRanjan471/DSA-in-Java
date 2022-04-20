//You have been given a singly linked list of integers along with two integers, 'M,' and 'N.' 
//Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. 
//Continue the same until the end of the linked list.
//To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.
	//Sample Input 1 :
	//1
	//1 2 3 4 5 6 7 8 -1
	//2 2
	//Sample Output 1 :
	//1 2 5 6
	//Sample Input 2 :
	//2
	//10 20 30 40 50 60 -1
	//0 1
	//1 2 3 4 5 6 7 8 -1
	//2 3
	//Sample Output 2 :
	//1 2 6 7

package Assignment;

import java.util.Scanner;

public class Delete_every_N_nodes {
	
	public static void print(Node<Integer>head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}

	public static  Node<Integer> skipMdeleteN( Node<Integer> head, int M, int N) {
		//Your code goes here
        if(head == null || M == 0){
            return null;
        }
        if( N == 0 ){
            return head;
        }
      
         Node<Integer> currentNode = head;
         Node<Integer> tail = null;
        while(currentNode != null){
              int take = 0;
               int skip = 0;
            
            //To add
            while(currentNode != null &&  take < M){
                if(tail == null){
                    tail = currentNode;
                }
                else{
                    tail.next = currentNode;
                    tail = tail.next;
                }
                currentNode = currentNode.next;
                take +=1;
            }
            //To delete
            while(currentNode != null && skip < N){
                currentNode = currentNode.next;
                skip += 1;
            }
            
        }
        if(tail != null){ // this is for the if the the is M = 2 and N = 3
                              // 1 2 3 4 3
            tail.next = null;
        }
        return head;
	}
	public static Node<Integer> takeInput(Scanner s){
		Node<Integer> head = null , tail = null;
		System.out.println("eneter the data");
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
		Scanner s = new Scanner (System.in);
		System.out.println("enter the no.of node to retain");
		int M = s.nextInt();
		System.out.println("enter the no.of node to delete");
		int N = s.nextInt();
		
		Node<Integer> head = takeInput(s);
		head = skipMdeleteN(head , M ,N);
		print(head);
	}
}
