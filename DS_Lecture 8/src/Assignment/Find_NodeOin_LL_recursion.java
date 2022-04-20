package Assignment;

import java.util.Scanner;
//Given a singly linked list of integers and an integer n, find and return the index for the first occurrence
//of 'n' in the linked list. -1 otherwise.
//Follow a recursive approach to solve this.
	//Sample Input 1 :
	//
	//3 4 5 2 6 1 9 -1
	//100
	//Sample Output 1 :
	//-1

	//Sample Input 2 :
	//2
	//10 20010 30 400 600 -1
	//20010
	//100 200 300 400 9000 -34 -1
	//-34
	//Sample Output 2 :
	//1
	//5

public class Find_NodeOin_LL_recursion {
	public static void print(int n) {
		System.out.println(n);
	}
	public static int findNodeRec( Node<Integer> head, int n ,int index) {
    	//Your code goes here
        if(head.data == n){
            return index;
        }
        
        if(head.next == null){
            return -1;
        }
        
        return findNodeRec(head.next , n , index +1);
      //  return pos;
	}
    public static int findNodeRec( Node<Integer> head, int n) {

        int index= findNodeRec(  head, n ,0);
        return index;
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
		System.out.println("input the no to be search");
		int n = s.nextInt();
		
		Node<Integer> head = takeInput(s);
		int num = findNodeRec(head , n);
		print(num);

	}

}
