package Graphs_1;

import java.util.Scanner;
//DFS:- Depth first search
public class DFS_Adjacency_Matrix {

	public static void printHelper(int edges[][] , int startVertx , boolean visited[]) {
		System.out.println(startVertx);
		//as we have printed we will mark it as visited
		visited[startVertx] =true;
		int n = edges.length;
		for(int i = 0 ; i < n ; i++) {
			if(edges[startVertx][i] == 1 && ! visited[i]) {
				printHelper(edges, i, visited);
			}
		}
	}

	public static void print(int edges[][] ) {
		boolean visited[] = new boolean[edges.length];
		for(int i =0 ; i < edges.length ; i++) {// jb tk sare vertex hum visit nai kr lete loop tb tk chale
			                                    // if we have disconnected graph ie, 0-1-2-0 and 3-4-5
			if(! visited[i]) { 
				printHelper(edges, i, visited);
			}
		}
	}

	public static void main(String[] args) {

		int NumOfEdges; // total no. of edges
		int NumOfVertex; // total no of vertex

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the no of vertex");
		NumOfVertex = s.nextInt();
		
		System.out.println("Enter the no of Edges");
		NumOfEdges = s.nextInt();

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
		print(edges);

	}

}
