//Given an undirected, connected and weighted graph G(V, E) with V number of vertices
//(which are numbered from 0 to V-1) and E number of edges.
//Find and print the Minimum Spanning Tree (MST) using Kruskal's algorithm.
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
	//1 2 1
	//0 1 3
	//0 3 5

package Graphs_2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

//Time complexity O(ElogE + EV)
//create a Edge class which will contain 3 properties ie, source , edge,weight
class Edge implements Comparable<Edge>{  // we have to implement the comparable interface
	int source;
	int dest; // destination
	int weight;
	
	@Override
	//we are doing this way bcz our input Array is of type Edge
	public int compareTo(Edge o) { // this function will sort the array in increasing Array
		// TODO Auto-generated method stub
		return this.weight - o.weight;
	}
}

public class Kruskals_Algorithm {
	
	public static int findParent(int vertex, int[] parent) {
		 if(parent[vertex] == vertex) {
			 return vertex;
		 }
		 return findParent(parent[vertex], parent);
	}
	
	public static void kruskals(Edge input[] , int Numvertex) {
		Arrays.sort(input); //sorting the input array in increasing order
	
		//now we will create an output Array
		Edge output[] = new Edge[Numvertex - 1]; // bcz total no of edges will be Total no of vertex -1
		
		int parent[] = new int[Numvertex];
		for(int i = 0 ; i < Numvertex ; i++) {
			//initially we will initialize there index as there parent
			parent[i] = i ;
		}
		
		int count = 0; // this will count the no of edges in our MST
		int i = 0; // it will tell the current edge position
		
		while(count != Numvertex - 1) {
			Edge currentEdge = input[i]; // 1st we will check can we add this current edge in our MSt or not
			
			int sourceParent = findParent(currentEdge.source , parent); //this function will bring  vertex V1
			int destParent = findParent(currentEdge.dest , parent); //and this will bring  vertex V2
			
			if(sourceParent != destParent) {
				output[count] = currentEdge;
				count++;
				parent[sourceParent] = destParent; // we will make someone as parent
				
			}
			i++;
		}
		
		//printing our MSt
		for(int j =0 ; j < Numvertex - 1; j++) {
			if(output[j].source < output[j].dest) {
			System.out.println(output[j].source +" " + output[j].dest +" "+ output[j].weight);
			}
			else {
				System.out.println(output[j].dest +" " + output[j].source +" "+ output[j].weight);
			}
		}
	}
	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of Vertex");
		 int NumOfVertex = s.nextInt();
		 System.out.println("Enter the no of Edges");
		 int NumOfEdges = s.nextInt();

		 //create an Array of type Edge
		 Edge input[] = new Edge[NumOfEdges];
		 //taking input from the user
		 System.out.println("Enter the Vertex v1 v2 and  weight");
		 for(int i = 0 ; i < NumOfEdges ; i++) {
			 input[i] = new Edge();//creating an edge class object
			 input[i].source = s.nextInt();
			 input[i].dest = s.nextInt();
			 input[i].weight = s.nextInt();
		 }
		 //now we have to implement the kruskal's Algorithm
		 kruskals(input , NumOfVertex);
	}

}
