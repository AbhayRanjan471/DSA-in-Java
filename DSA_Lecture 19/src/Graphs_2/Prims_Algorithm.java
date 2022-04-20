//Given an undirected, connected and weighted graph G(V, E) with V number of vertices (which are numbered from 0 to V-1) 
//and E number of edges.
//Find and print the Minimum Spanning Tree (MST) using Prim's algorithm.
//For printing MST follow the steps -
//1. In one line, print an edge which is part of MST in the format - 
//v1 v2 w
//where, v1 and v2 are the vertices of the edge which is included in MST and whose weight is w. 
//And v1  <= v2 i.e. print the smaller vertex first while printing an edge.
//2. Print V-1 edges in above format in different lines.
	//Sample Input 1 :
	//4 4
	//0 1 3
	//0 3 5
	//1 2 1
	//2 3 8
	//Sample Output 1 :
	//0 1 3
	//1 2 1
	//0 3 5

package Graphs_2;

import java.util.Scanner;

public class Prims_Algorithm {

	private static int findMinVertex(int[] weight, boolean visited[]) {

		int minVertex = -1;//initially assume vertex as -1
		for(int i = 0; i < weight.length; i++){
			if(!visited[i]  && (minVertex == -1 || weight[i] < weight[minVertex])){
				minVertex = i;
			}
		}
		return minVertex;
	}

	private static void prims(int[][] adjacencyMatrix) {
		int numVertx  = adjacencyMatrix.length;
		boolean visited[] = new boolean[numVertx ];
		int weight[] = new int[numVertx ];
		int parent[] = new int[numVertx ];
		//Initially we will initialize weight of every vertex as infinity except vertex[0]
		weight[0] = 0;
		parent[0] = -1;
		for(int i = 1; i < numVertx ; i++){
			weight[i] = Integer.MAX_VALUE;
		}
		for(int i = 0; i < numVertx ; i++){
			// Pick vertex with min weight
			int minVertex = findMinVertex(weight, visited);//we need min weight vertex which are not visited yet so we are passing the
			                                              //visited Array also to check wither the vertex is visited or not
			visited[minVertex] = true;//marking it as visited
			// Explore its unvisited neighbors
			for(int j = 0; j < numVertx ; j++){
				if(adjacencyMatrix[minVertex][j] != 0 && !visited[j]){
					if(adjacencyMatrix[minVertex][j] < weight[j]){
						weight[j] = adjacencyMatrix[minVertex][j];
						parent[j] = minVertex;
					}
				}
			}
		}

		// Print edges of MST
		for(int i = 1; i < numVertx ; i++){
			if(parent[i] < i){
				System.out.println(parent[i] + " "+ i +" "+ weight[i]);
			}else{
				System.out.println(i + " "+ parent[i] +" "+ weight[i]);
			}
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of vertex and no of Edges");
		int NumVertex = s.nextInt();
		int NumEdges = s.nextInt();
		//creating an adjacency matrix
		int adjacencyMatrix[][] = new int[NumVertex][NumVertex];
		//Taking input of the graph
		System.out.println("Eneter the vertex1 , vertex2 and the weight");
		for(int i = 0; i < NumEdges; i++){
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int weight = s.nextInt();
			adjacencyMatrix[v1][v2] = weight;
			adjacencyMatrix[v2][v1] = weight;
		}

		prims(adjacencyMatrix);
	}



}
