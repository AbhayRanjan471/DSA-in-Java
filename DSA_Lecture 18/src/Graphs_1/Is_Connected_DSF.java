package Graphs_1;
import java.util.*;

public class Is_Connected_DSF {

	public static void printDSFHelper(int edges[][] , int startVertex , boolean visited[]){

		visited[startVertex] = true;
		int n = edges.length;

		for(int i = 0 ; i<n; ++i)
		{
			if(edges[startVertex][i]==1 && !visited[i])
			{
				printDSFHelper(edges,i,visited);

			}
		}
		return ;
	}

	public static void printBFS(int edges[][] ){
		if(edges.length == 0){
			System.out.println("true");
			return;
		}  
		boolean visited[] = new boolean[edges.length];

		printDSFHelper(edges , 0 ,visited );

		//checking is there any unvisited index is present if yes then its a disconnected graph
		for(int i =0 ; i < edges.length ; i++){
			if(visited[i] == false){
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		//	System.out.println("enter the n0 of vertex");
		int NumOfVertex = s.nextInt();
		//	System.out.println("Enter the no. of edges");
		int NumOfEdges = s.nextInt();

		int edges[][] = new int[NumOfVertex][NumOfVertex];

		//	System.out.println("Enter the no first and second vertex");
		for(int i =0 ;i < NumOfEdges ; i++){
			int firstVertex = s.nextInt();
			int secondVertex = s.nextInt();

			edges[firstVertex][secondVertex] = 1;
			edges[secondVertex][firstVertex] = 1;
		}

		printBFS(edges);

	}

}
