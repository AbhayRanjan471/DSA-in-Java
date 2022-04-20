package Assignment;

import java.util.Scanner;
//Even after Odd LinkedList
//Send Feedback
//For a given singly linked list of integers, arrange the elements such that all the even numbers are
//placed after the odd numbers. The relative order of the odd and even terms should remain unchanged.
	//Sample Input 1 :
	//
	//1 4 5 2 -1
	//Sample Output 1 :
	//1 5 4 2 
	 
public class Even_after_Odd_LL {
	
	public static void print(Node<Integer>head) {
		System.out.println("even after odd LL are ");
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}

	public static  Node<Integer> evenAfterOdd( Node<Integer> head) {
		//Your code goes here
        if(head == null){
            return head;
        }
        //creating LL which will store the oddHead and OddTail and evenHEad and evenTail
        //at last we will add evenHead next of oddTail
         Node<Integer> oddHead = null , oddTail = null , evenTail = null , evenHead = null;
         Node<Integer> temp = head;
        
        while(temp != null){
            if(temp.data % 2 == 0){//when The node is Even
                if(evenHead == null){
                    evenHead = temp;
                    evenTail = temp;
                }
                else{
                    evenTail.next = temp;
                    evenTail = evenTail.next;
                }
            }
            else if( temp.data % 2 != 0){//when the node is ODd
                if(oddHead == null){
                    oddHead = temp;
                    oddTail = temp;
                }
                else{
                    oddTail.next = temp;
                    oddTail = oddTail.next;
                }
            }
            temp = temp.next;//updating the temp and moving forward
        }
        if(evenTail != null){
            evenTail.next = null; 
        }
        if(oddTail != null){
            oddTail.next = null;
        }
        if(oddHead == null){//suppose there is no odd node and only even node
            return evenHead;
        }
        //attaching odd LL with even LL
        oddTail.next = evenHead;
        return oddHead;
	}
	public static Node<Integer> takeInput(){
		Node<Integer> head = null , tail = null;
		Scanner s = new Scanner(System.in);
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
		//Scanner s = new Scanner (System.in);
		 
		
		Node<Integer> head = takeInput();
		head = evenAfterOdd(head );
		print(head);

	}
}
