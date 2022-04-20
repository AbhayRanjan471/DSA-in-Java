package Length_of_LL;
import java.util.Scanner;

public class LinkedListNode_Use {
	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
        int count=0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
	}
	
	public static LinkedListNode<Integer> takingInput(){
		
		LinkedListNode<Integer> head = null , tail = null; // assigning tail nad head as null
		
		Scanner s= new Scanner (System.in);
		System.out.println("Input the elements");
		int data = s.nextInt();//taking input from user
		
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			
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
		LinkedListNode<Integer> head = takingInput();
		int size = length(head);
		System.out.println(size);
       
	}

}
