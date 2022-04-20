package Print_ith_Node;

import java.util.Scanner;

public class LinkedList_Use {
	
	public static void printIthNode( Node<Integer> head, int i){
		//Your code goes here
        int position =0;
        int num;
        while(head != null){
            if(position == i){
             num =  head.data;
                System.out.println(num);

                break;
        }
            head = head.next;
            position++;
        }
	}
	
	public static Node<Integer> takingInput(Scanner s){
		Node <Integer> head = null , tail = null;
		//Scanner s = new Scanner(System.in);
		 System.out.println("eneter the elements");
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode =new Node<Integer>(data);
			
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
		Scanner s = new Scanner (System.in);
		System.out.println("eneter the position to be find");
		int find = s.nextInt();

		Node<Integer> head = takingInput(s);
		printIthNode(head , find);
	}

}
