//An island is a small piece of land surrounded by water . A group of islands is said to be connected if we 
//can reach from any given island to any other island in the same group . Given V islands (numbered from 1 to V) 
//and E connections or edges between islands. Can you count the number of connected groups of islands.
	//Sample Input 1:
	//5 8
	//0 1
	//0 4
	//1 2
	//2 0
	//2 4
	//3 0
	//3 2
	//4 3
	//Sample Output 1:
	//1 

package Assignment;
import java.util.*;

public class Islands { //same as BFS problem

	public static void ConntIsland(int edges[][] , int startVertx , boolean visited[]) {
		//Create a Queue
		Queue<Integer> queue = new LinkedList<>();
		queue.add(startVertx); // add the starting vertex into the queue;
		visited[startVertx] = true; // mark starting  vertex as visited
		int n = edges.length;

		//we will work till the queue is not empty
		while(! queue.isEmpty()) {
			int front = queue.poll(); // take out the front vertex from the queue
			 
			for(int i = 0 ; i < n ; i++) { // iterating for rest of the vertex
				if(edges[front][i] == 1 && ! visited[i]) {
					queue.add(i); // add in the queue
					visited[i] = true ; // mark as visited
				}
			}
		}
	}
	public static int Island(int edges[][]) {
		int group = 0 ; // storing total no of island are connected
		boolean visited[] = new boolean[edges.length];
		for(int i = 0 ; i < edges.length ; i++) {
			if(! visited[i]) {
				ConntIsland(edges, i, visited);
				group++;
			}
		}
		return group;
	}
	 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total no of V island");
		int Numvertex = s.nextInt();
		System.out.println("Enter the total no of edges between island");
		int Numedges = s.nextInt();
		
		int edges[][] = new int[Numvertex][Numvertex];
		 
		System.out.println("Enter the connected Island");
		for(int i = 0 ; i < Numedges ; i++) {
			int Island_1 = s.nextInt();
			int Island_2 = s.nextInt();
			edges[Island_1][Island_2] = 1;
			edges[Island_2][Island_1] = 1;
		}
		
		int ConntIsland = Island(edges );
		System.out.println("Total connected Island are : " + ConntIsland);

	}

}
