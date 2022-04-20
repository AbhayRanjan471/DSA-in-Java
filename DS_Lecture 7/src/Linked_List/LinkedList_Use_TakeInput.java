package Linked_List;
import java.util.Scanner;
//Time Complexity is O(n^2)
public class LinkedList_Use_TakeInput {

	public static void  print(Node<Integer> head) // here we are passing the reference of 1st node ie, node1
	{

		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next; // this will give the reference of next node to head(it is same as i++)
		}
	}

	// Taking Input from the user
	public static Node<Integer> takeInput(){
		        // return type

		Node<Integer> head = null; // initially we have taken head as null
		Scanner s = new Scanner(System.in);
		int data = s.nextInt(); // taking data from user

		while( data != -1) { // we will take the number till user input -1

			Node<Integer> newNode = new Node<Integer>(data); // creating a Node and putting the data that the user has enter
			// bcz user can only give us the input and its our duty to make node and create a link
			if(head == null) { ///jb user 1st data input kre ga hum use head assign kr de ge
				head = newNode;// this is done only for the 1st Node
			}
			else { // to input all the data to there next Node position
				// here we are linking the Node with each other
				Node<Integer> temp = head;
				while(temp.next != null) { // this is used to move to next Node

					temp = temp.next;
				}
				temp.next = newNode;
			}
			data = s.nextInt();// taking input from the user for next data
		}
		return head;

	}


	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		print(head);

		//		 
	}

}
