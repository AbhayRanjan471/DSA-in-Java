package Graphs_1;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class BFS_Traversal {

	public static void printBFSHelper(int edges[][] , int startVertx , boolean visited[]) {
		//Create a Queue
		Queue<Integer> queue = new LinkedList<>();
		queue.add(startVertx); // add the starting vertex into the queue;
		visited[startVertx] = true; // ,ark starting  vertex as visited
		int n = edges.length;

		//we will work till the queue is not empty
		while(! queue.isEmpty()) {
			int front = queue.poll(); // take out the front vertex from the queue
			System.out.println(front);

			for(int i = 0 ; i < n ; i++) { // iterating for rest of the vertex
				if(edges[front][i] == 1 && ! visited[i]) {
					queue.add(i); // add in the queue
					visited[i] = true ; // mark as visited
				}
			}
		}
	}
	
	public static void printBFS(int edges[][]) {
		boolean visited[] = new boolean[edges.length];
		for(int i = 0 ; i < edges.length ; i++) {
			if(! visited[i]) {
			printBFSHelper(edges, i, visited);
			}
		}
	}

	public static void main(String[] args) {
		int NumOfEdges; // total no. of edges
		int NumOfVertex; // total no of vertex

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of Edges");
		NumOfEdges = s.nextInt();

		System.out.println("Enter the no of vertex");
		NumOfVertex = s.nextInt();

		//now we will create a 2D array of type integer
		int edges[][] = new int[NumOfVertex][NumOfVertex];

		//jaha jaha v edge hai waha pe hum 1 put kre ge
		System.out.println("Enter the first and second vertex");
		for(int i =0 ; i < NumOfEdges ; i++) {
			int firstVertex = s.nextInt();
			int secondVertex = s.nextInt();
			//we will ask is there any edge between first and second vertex
			edges[firstVertex][secondVertex] = 1; // if there is edge between this two vertex then we will mark it as 1
			edges[secondVertex][firstVertex] = 1; //this has to be 1 bcz if there is an edge between 1-2 there is 
			//already a edge between 2-1

		}
		printBFS(edges);

	}
}




