//You want to buy a ticket for a well-known concert which is happening in your city. But the number of 
//tickets available is limited. Hence the sponsors of the concert decided to sell tickets to customers based on some priority.
//A queue is maintained for buying the tickets and every person is attached with a priority (an integer, 1 being the lowest priority).
//The tickets are sold in the following manner -
//1. The first person (pi) in the queue requests for the ticket.
//2. If there is another person present in the queue who has higher priority than pi, then ask pi to move at end of
//the queue without giving him the ticket.
//3. Otherwise, give him the ticket (and don't make him stand in queue again).

//Sample Input 1 :
//3
//3 9 4
//2
//Sample Output 1 :
//2
//Sample Output 1 Explanation :
//Person with priority 3 comes out. But there is a person with higher priority than him. So he goes and then 
//stands in the queue at the end. Queue's status :  {9, 4, 3}. Time : 0 secs.
//Next, the person with priority 9 comes out. And there is no person with higher priority than him. 
//So he'll get the ticket. Queue's status :  {4, 3}. Time : 1 secs.
//Next, the person with priority 4 comes out (which is you). And there is no person with higher priority 
//than you. So you'll get the ticket. Time : 2 secs.
//Sample Input 2 :
//5
//2 3 2 2 4
//3
//Sample Output 2 :
//4

package Assignment;
import java.util.PriorityQueue;
import java.util.Queue;
//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Buy_the_Ticket {

	public static int buyTicket(int input[], int k) {

		int time = 0;
		//creating a Queue to store the index value
		Queue<Integer> queue = new LinkedList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		//adding the elements in the PriorityQueue and the index no. in the Queue
		for(int i =0 ; i < input.length; i++){
			queue.add(i);
			pq.add(input[i]);
		}

		while(! pq.isEmpty()){
			for(int i =0 ;i < queue.size() ; i++){
				int index = queue.peek();

				//this conditon will exicute when the person at k index come in the front of the line and his priority
                //at that instant is maximum
				if(input[index] == pq.peek() && k == index){
					time +=1;
					return time;
				}
				 //when some other person come in front of the line whoes priority is max from every one
                //we will give him the ticket and remove it from the queue and priority Queue and add time+1
				else if(input[index] == pq.peek()){ //removing the index an the value of the highest PriorityQueue
					pq.poll(); // removing element from the PriorityQueue
					queue.poll(); // removing the index value from the Queue
					time +=1;
				}
				//when some person come in fornt of the line whoes priority is not max we will insert that 
                //person at the last of the line
				else{
					int en = queue.poll();//removing the person  from front of  the queue
					queue.add(en);//and inserting it at the end of the line
				}
			}

		}
		return time;

	}
	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total number of Coustmers");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Priority of every Person");
		for(int i =0 ; i < size ; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Enter your position in Ticket Line");
		int k = s.nextInt();
		 
		int t = buyTicket(arr, k);
		System.out.println("Time taken by u to issue the Tickets is \n" + t +" min");

	}

}
