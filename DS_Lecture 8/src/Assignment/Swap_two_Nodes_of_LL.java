package Assignment;
 
//Swap the nodes that are present at the 'i-th' and 'j-th' positions.
//Note :
//Remember, the nodes themselves must be swapped and not the datas.
//
//No need to print the list, it has already been taken care. Only return the new head to the list.
//		Sample Input 1 :
//			1
//			3 4 5 2 6 1 9 -1
//			3 4
//			Sample Output 1 :
//			3 4 5 6 2 1 9 

	//Sample Input 2 :
	//2
	//10 20 30 40 -1
	//1 2
	//70 80 90 25 65 85 90 -1
	//0 6
	//Sample Output 2 :
	//10 30 20 40 
	//90 80 90 25 65 85 70 

import java.util.Scanner;

public class Swap_two_Nodes_of_LL {
	public static void print(Node<Integer>head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
	
	public static  Node<Integer> swapNodes( Node<Integer> head, int i, int j) {
		//Your code goes here
        if(head == null){
            return head;
        }
        if(i== j){
            return head;
        }
        Node<Integer> temp = head;
         Node<Integer> current1 = null;
         Node<Integer>  previous1 = null;
         Node<Integer> current2 = null;
         Node<Integer> previous2 = null;
        
        if( i ==0 || j == 0){
           // current1 = head;
            if( i != 0){
            
             Node<Integer>  newHead = swap(head, i);
                return newHead;
            }
            else{
                Node<Integer> newHead = swap(head , j);
                return newHead;
            }
        }
        int k=0;
        while(temp != null){
            
            if( k == i-1 ){
                previous1 = temp;
                current1 = temp.next;
            }
            else if( k == j-1){
                previous2 = temp;
            current2 = temp.next;
            }
             temp = temp.next;
             k++;
        }
       
    temp=current2.next;
    previous1.next = current2;
    previous2.next = current1;
    current2.next = current1.next;
    current1.next =temp;
      return head;
    }
    public static  Node<Integer> swap( Node<Integer> head , int n){
           Node<Integer> temp = head;
         Node<Integer> current1 = head;
       // LinkedListNode<Integer>  previous1 = null;
         Node<Integer> current2 = null;
         Node<Integer> previous2 = null;
        int k =0;
        while( temp != null){
            if( k == n-1 ){
                previous2 = temp;
                current2 = temp.next;
                current1.next = current2.next;
                current2.next =previous2;
                previous2.next = current1;
            }
          temp = temp.next;
            k++;
        }
        return current2;
    }

	public static Node<Integer> takeInput(){
		Node<Integer> head = null , tail = null;
		Scanner s = new Scanner (System.in);
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
		Scanner s = new Scanner(System.in);
		System.out.println("enter starting position from which swapping will start");
		int i = s.nextInt();
		System.out.println("enter the ending position");
		int j = s.nextInt();
		Node<Integer> head = takeInput();
		head = swapNodes(head, i,j);
		print(head);

	}

}
