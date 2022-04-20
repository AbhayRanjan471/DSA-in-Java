//Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), check if there exists any path between them or not. Print true if the path exists and false otherwise.
	//Sample Input 1 :
	//4 4
	//0 1
	//0 3
	//1 2
	//2 3
	//1 3
	//Sample Output 1 :
	//true

package Graphs_1;
import java.util.Scanner;
import java.util.*;

public class Has_Path_BSF {

	public static void printBFSHelper(int edges[][] , int startVertx , boolean visited[] , int v2){
		Queue<Integer> queue = new LinkedList<>();
		queue.add(startVertx);
		visited[startVertx] = true;
		int n = edges.length;

		while(! queue.isEmpty()){
			int front = queue.poll();
			for(int i = 0 ; i < n ; i++) { // iterating for rest of the vertex
				if(edges[front][i] == 1 && ! visited[i]) {
					if(i == v2){ // if it matches with the v2 that means there is a path from v1-v2
						System.out.println("true");
						return;

					}
					queue.add(i); // add in the queue
					visited[i] = true ; // mark as visited
				}
			}
		}
		System.out.println("false");
		return;
	}

	public static void printBFS(int edges[][] , int v1 , int v2){
		boolean visited[] = new boolean[edges.length];

		//passing the starting index ie, v1 from where we have to check the path
		printBFSHelper(edges , v1 , visited , v2);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the n0 of vertex");
		int NumOfVertex = s.nextInt();
		System.out.println("Enter the no. of edges");
		int NumOfEdges = s.nextInt();

		int edges[][] = new int[NumOfVertex][NumOfVertex];
		
		System.out.println("Enter the no first and second vertex");
		for(int i =0 ;i < NumOfEdges ; i++){
			int firstVertex = s.nextInt();
			int secondVertex = s.nextInt();

			edges[firstVertex][secondVertex] = 1;
			edges[secondVertex][firstVertex] = 1;
		}
		System.out.println("Enter the path from where to where we want to search");
		int v1 = s.nextInt();
		int v2 = s.nextInt();
		printBFS(edges , v1 , v2);

	}

}
