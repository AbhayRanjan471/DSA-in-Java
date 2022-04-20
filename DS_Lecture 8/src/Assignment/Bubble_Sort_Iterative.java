package Assignment;

import java.util.Scanner;

//Given a singly linked list of integers, sort it using 'Bubble Sort.'
//Note :
//No need to print the list, it has already been taken care. Only return the new head to the list.
//		Sample Input 1 :
//			10 9 8 7 6 5 4 3 -1
//			Sample Output 1 :
//			 3 4 5 6 7 8 9 10 
//			 Sample Output 2 :
//			10 -5 9 90 5 67 1 89 -1
//			Sample Output 2 :
//			-5 1 5 9 10 67 89 90 

public class Bubble_Sort_Iterative {
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
 
	public static  Node<Integer> bubbleSort( Node<Integer> head) {
        
        if(head==null || head.next==null){
            return head;
        }
		
         Node<Integer> curr= head;
         Node<Integer> prev= null, frw= null;
        int len=0;
        while(curr!=null){
            len++;
            curr= curr.next;
        }
	
        for(int j=0; j<len-1; j++){
            curr=head;
            prev=null;
            frw=null;
           for(int i=0; i<len-j-1; i++){
                if(prev==null && curr.data > curr.next.data){
                	frw= curr.next;
                    curr.next= frw.next;
                    frw.next= curr;
                    head= frw;
                   prev=  frw;
                }
                else if(curr.data > curr.next.data){
                    frw= curr.next;
                    prev.next= frw;
                    curr.next= frw.next;
                    frw.next= curr;
                    prev= frw;
                }
                else{
                    prev= curr;
                    curr= curr.next;
                }
            }        
        }
        return head;
        
	}
	public static Node<Integer> takeInput(){
		Node<Integer> head = null , tail = null;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the data");
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode; //or tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head = takeInput();
		head = bubbleSort(head);
		print(head);

	}

}
