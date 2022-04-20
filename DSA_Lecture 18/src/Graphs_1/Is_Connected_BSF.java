//Given an undirected graph G(V,E), check if the graph G is connected graph or not.
//Sample Input 1:
//4 4
//0 1
//0 3
//1 2
//2 3
//Sample Output 1:
//true
//Sample Input 2:
//4 3
//0 1
//1 3 
//0 3
//Sample Output 2:
//false 
//Sample Output 2 Explanation
//The graph is not connected, even though vertices 0,1 and 3 are connected to each other but there isn’t any path from vertices 0,1,3 to vertex 2. 
package Graphs_1;
import java.util.*;

public class Is_Connected_BSF {

	public static void printBFSHelper(int edges[][] , int startVertx , boolean visited[] ){
		if(edges.length == 0){
			System.out.println("true");
			return;

		}
		Queue<Integer> queue = new LinkedList<>();
		queue.add(startVertx);
		visited[startVertx] = true;
		int n = edges.length;

		while(! queue.isEmpty()){
			int front = queue.poll();
			for(int i = 0 ; i < n ; i++) { // iterating for rest of the vertex
				if(edges[front][i] == 1 && ! visited[i]) {

					queue.add(i); // add in the queue
					visited[i] = true ; // mark as visited
				}
			}
		}
		//checking is there any unvisited index is present if yes then its a disconnected graph
		for(int i =0 ; i < n ; i++){
			if(visited[i] == false){
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");

	}

	public static void printBFS(int edges[][] ){
		boolean visited[] = new boolean[edges.length];

		printBFSHelper(edges , 0 ,visited );
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the no of vertex");
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

		printBFS(edges);

	}

}
